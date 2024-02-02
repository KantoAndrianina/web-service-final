package com.example.myapp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import jakarta.persistence.Table;
import jakarta.persistence.Column;


// import javax.persistence.Entity;
// import javax.persistence.Id;
// import java.util.Date;

@Entity
@Table(name = "v_terrain_culture")
public class TerrainCultureView {
    @Id
    private int id_Terrain;
    private String Terrain_Description;
    private String Terrain_Localisation;
    private int Terrain_Nb_Parcelle;
    @Column(name = "id_Utilisateur")
    private int id_Utilisateur;
    private String Utilisateur_Prenom;
    private String Utilisateur_Email;
    private int id_Photo_Terrain;
    private String Photo_Terrain_img;
    private int id_Parcelle;
    private double Rendement;
    private double Largeur;
    private double Longueur;
    private int id_Culture;
    private String Culture_Nom;
    private int Culture_Prix;
    private int id_Culture_Parcelle;
    private int id_Simulation;
    private Date Simulation_Date;

    // Getters and setters
    public int getId_Terrain() {
        return id_Terrain;
    }

    public void setId_Terrain(int id_Terrain) {
        this.id_Terrain = id_Terrain;
    }

    public String getTerrain_Description() {
        return Terrain_Description;
    }

    public void setTerrain_Description(String terrain_Description) {
        Terrain_Description = terrain_Description;
    }

    public String getTerrain_Localisation() {
        return Terrain_Localisation;
    }

    public void setTerrain_Localisation(String terrain_Localisation) {
        Terrain_Localisation = terrain_Localisation;
    }

    public int getTerrain_Nb_Parcelle() {
        return Terrain_Nb_Parcelle;
    }

    public void setTerrain_Nb_Parcelle(int terrain_Nb_Parcelle) {
        Terrain_Nb_Parcelle = terrain_Nb_Parcelle;
    }

    public int getId_Utilisateur() {
        return id_Utilisateur;
    }

    public void setId_Utilisateur(int id_Utilisateur) {
        this.id_Utilisateur = id_Utilisateur;
    }

    public String getUtilisateur_Prenom() {
        return Utilisateur_Prenom;
    }

    public void setUtilisateur_Prenom(String utilisateur_Prenom) {
        Utilisateur_Prenom = utilisateur_Prenom;
    }

    public String getUtilisateur_Email() {
        return Utilisateur_Email;
    }

    public void setUtilisateur_Email(String utilisateur_Email) {
        Utilisateur_Email = utilisateur_Email;
    }

    public int getId_Photo_Terrain() {
        return id_Photo_Terrain;
    }

    public void setId_Photo_Terrain(int id_Photo_Terrain) {
        this.id_Photo_Terrain = id_Photo_Terrain;
    }

    public String getPhoto_Terrain_img() {
        return Photo_Terrain_img;
    }

    public void setPhoto_Terrain_img(String photo_Terrain_img) {
        Photo_Terrain_img = photo_Terrain_img;
    }

    public int getId_Parcelle() {
        return id_Parcelle;
    }

    public void setId_Parcelle(int id_Parcelle) {
        this.id_Parcelle = id_Parcelle;
    }

    public double getRendement() {
        return Rendement;
    }

    public void setRendement(double Rendement) {
        Rendement = Rendement;
    }

    public double getLargeur() {
        return Largeur;
    }

    public void setLargeur(double Largeur) {
        Largeur = Largeur;
    }

    public double getLongueur() {
        return Longueur;
    }

    public void setLongueur(double Longueur) {
        Longueur = Longueur;
    }

    public int getId_Culture() {
        return id_Culture;
    }

    public void setId_Culture(int id_Culture) {
        this.id_Culture = id_Culture;
    }

    public String getCulture_Nom() {
        return Culture_Nom;
    }

    public void setCulture_Nom(String culture_Nom) {
        Culture_Nom = culture_Nom;
    }

    public int getCulture_Prix() {
        return Culture_Prix;
    }

    public void setCulture_Prix(int culture_Prix) {
        Culture_Prix = culture_Prix;
    }

    public int getId_Culture_Parcelle() {
        return id_Culture_Parcelle;
    }

    public void setId_Culture_Parcelle(int id_Culture_Parcelle) {
        this.id_Culture_Parcelle = id_Culture_Parcelle;
    }

    public int getId_Simulation() {
        return id_Simulation;
    }

    public void setId_Simulation(int id_Simulation) {
        this.id_Simulation = id_Simulation;
    }

    public Date getSimulation_Date() {
        return Simulation_Date;
    }

    public void setSimulation_Date(Date simulation_Date) {
        Simulation_Date = simulation_Date;
    }
}
