package fr.aviation.web;

import fr.aviation.model.CompagnieAerienne;
import fr.aviation.model.AvionLigne;
import fr.aviation.model.FlottePassagers;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/web")
public class WebResource {

    @Inject
    Template compagniePage;

    @Inject
    Template avionPage;

    @Inject
    Template index;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance getIndex() {
        List<CompagnieAerienne> compagnies = CompagnieAerienne.listAll();
        List<AvionLigne> avions = AvionLigne.listAll();
        return index.data("compagnies", compagnies).data("avions", avions);
    }

    @GET
    @Path("/compagnie/{id}")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance getCompagnie(@PathParam("id") String id) {
        CompagnieAerienne compagnie = CompagnieAerienne.findById(id);
        if (compagnie == null) {
            throw new NotFoundException("Compagnie introuvable");
        }
        return compagniePage.data("compagnie", compagnie);
    }

    @GET
    @Path("/avion/{id}")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance getAvion(@PathParam("id") String id) {
        AvionLigne avion = AvionLigne.findById(id);
        if (avion == null) {
            throw new NotFoundException("Avion introuvable");
        }
        
        List<FlottePassagers> flottes = FlottePassagers.list("avion", avion);
        
        return avionPage.data("avion", avion).data("flottes", flottes);
    }
}