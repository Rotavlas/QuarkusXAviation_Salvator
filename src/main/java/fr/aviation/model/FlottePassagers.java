package fr.aviation.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "FLOTTES_PASSAGERS")
public class FlottePassagers extends PanacheEntityBase {
    @Id 
    @Column(name = "ID_FPASS") 
    public String idFpass;

    @ManyToOne
    @JoinColumn(name = "ID_COMPAGNIE")
    @JsonIgnore
    public CompagnieAerienne compagnie;

    @ManyToOne
    @JoinColumn(name = "ID_AL")
    public AvionLigne avion;

    public Integer nombre;
}