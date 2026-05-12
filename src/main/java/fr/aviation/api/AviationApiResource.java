package fr.aviation.api;

import fr.aviation.model.AvionLigne;
import fr.aviation.model.CompagnieAerienne;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
public class AviationApiResource {

    @GET
    @Path("/avions")
    public List<AvionLigne> getAvions() {
        return AvionLigne.listAll();
    }

    @GET
    @Path("/compagnies")
    public List<CompagnieAerienne> getCompagnies() {
        return CompagnieAerienne.listAll();
    }
}