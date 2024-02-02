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
    private int id_Parcelle;

    private int id_Terrain;
    @Column(name = "rendement")
    private double rendement;
    @Column(name = "largeur")
    private double largeur;
    @Column(name = "longueur")
    private double longueur;

    public int getId_Parcelle() {
        return id_Parcelle;
    }

    public void setId_Parcelle(int id_Parcelle) {
        this.id_Parcelle = id_Parcelle;
    }

    public int getId_Terrain() {
        return id_Terrain;
    }

    public void setId_Terrain(int id_Terrain) {
        this.id_Terrain = id_Terrain;
    }

    public double getRendement() {
        return rendement;
    }

    public void setRendement(double rendement) {
        this.rendement = rendement;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
 
    }
}