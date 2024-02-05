
package com.example.myapp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

import jakarta.persistence.*;
import jakarta.persistence.Column;

@Entity
public class Terrain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Terrain")
    private Integer idTerrain;

    @Column(name = "Description")
    private String description;

    @Column(name = "Localisation")
    private String localisation;

    @Column(name = "Nb_Parcelle")
    private Integer nbParcelle;

    @Column(name = "id_Utilisateur")
    private Integer idUtilisateur;

    @Column(name = "validation")
    private Integer validation;

    // Getters and setters
    public Integer getIdTerrain() {
        return idTerrain;
    }

    public void setIdTerrain(Integer idTerrain) {
        this.idTerrain = idTerrain;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public Integer getNbParcelle() {
        return nbParcelle;
    }

    public void setNbParcelle(Integer nbParcelle) {
        this.nbParcelle = nbParcelle;
    }

    public Integer getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Integer idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

     public Integer getValidation() {
        return validation;
    }

    public void setValidation(Integer validation) {
        this.validation = validation;
    }

}
