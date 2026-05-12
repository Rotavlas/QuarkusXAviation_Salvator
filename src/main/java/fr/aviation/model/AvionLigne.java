package fr.aviation.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "AVIONS_LIGNE")
public class AvionLigne extends PanacheEntityBase {
    @Id 
    @Column(name = "ID_AL") 
    public String idAl;
    
    @Column(name = "ID_ALFULL") 
    public String idAlFull;
    
    public String constructeur;
    public String modele;
    
    @Column(name = "NBREPASSMAX") 
    public Integer nbrePassMax;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_MOTEUR")
    public Moteur moteur;
}