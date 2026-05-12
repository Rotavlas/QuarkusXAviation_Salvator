package fr.aviation.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "COMPAGNIES_AERIENNES")
public class CompagnieAerienne extends PanacheEntityBase {
    @Id 
    @Column(name = "ID_COMPAGNIE") 
    public String idCompagnie;
    
    public String nom;

    @OneToMany(mappedBy = "compagnie", fetch = FetchType.EAGER)
    public List<FlottePassagers> flottes;
}