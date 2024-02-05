package com.example.myapp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

import jakarta.persistence.*;
import jakarta.persistence.Column;

@Entity
@Table(name = "Parcelle")
public class Parcelle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Parcelle;

    private Integer id_Terrain;
    @Column(name = "rendement")
    private Double rendement;
    @Column(name = "largeur")
    private Double largeur;
    @Column(name = "longueur")
    private Double longueur;

    public Integer getId_Parcelle() {
        return id_Parcelle;
    }

    public void setId_Parcelle(Integer id_Parcelle) {
        this.id_Parcelle = id_Parcelle;
    }

    public Integer getId_Terrain() {
        return id_Terrain;
    }

    public void setId_Terrain(Integer id_Terrain) {
        this.id_Terrain = id_Terrain;
    }

    public Double getRendement() {
        return rendement;
    }

    public void setRendement(Double rendement) {
        this.rendement = rendement;
    }

    public Double getLargeur() {
        return largeur;
    }

    public void setLargeur(Double largeur) {
        this.largeur = largeur;
    }

    public Double getLongueur() {
        return longueur;
    }

    public void setLongueur(Double longueur) {
        this.longueur = longueur;
 
    }
}