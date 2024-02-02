
package com.example.myapp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

import jakarta.persistence.*;
import jakarta.persistence.Column;

@Entity
@Table(name = "v_terrain")
public class Terrain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Terrain")
    private int idTerrain;

    @Column(name = "Description")
    private String description;

    @Column(name = "Localisation")
    private String localisation;

    @Column(name = "Nb_Parcelle")
    private int nbParcelle;

    @Column(name = "id_Utilisateur")
    private int idUtilisateur;

    // Getters and setters
    public int getIdTerrain() {
        return idTerrain;
    }

    public void setIdTerrain(int idTerrain) {
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

    public int getNbParcelle() {
        return nbParcelle;
    }

    public void setNbParcelle(int nbParcelle) {
        this.nbParcelle = nbParcelle;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

}
