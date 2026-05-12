package fr.aviation.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "MOTEURS")
public class Moteur extends PanacheEntityBase {
    @Id 
    @Column(name = "ID_MOTEUR") 
    public String idMoteur;
    
    @Column(name = "ID_MOTEURFULL") 
    public String idMoteurFull;
    
    public String type;
    public String fabricant;
    public String famille;
    public String modele;
    @Column(columnDefinition = "NUMBER")
    public Double poussee;
}