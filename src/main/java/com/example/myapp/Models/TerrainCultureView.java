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
    @Column(name = "id_Terrain")
    private Integer id_Terrain;
    private String Terrain_Description;
    private String Terrain_Localisation;
    private Integer Terrain_Nb_Parcelle;
    @Column(name = "id_Utilisateur")
    private Integer id_Utilisateur;
    private String Utilisateur_Prenom;
    private String Utilisateur_Email;
    private Integer id_Photo_Terrain;
    private String Photo_Terrain_img;
    private Integer id_Parcelle;
    private Double Rendement;
    private Double Largeur;
    private Double Longueur;
    private Integer id_Culture;
    private String Culture_Nom;
    private Double Culture_Prix;
    private Integer id_Culture_Parcelle;
    private Integer id_Simulation;
    private Date Simulation_Date;

    // Getters and setters
    public Integer getId_Terrain() {
        return id_Terrain;
    }

    public void setId_Terrain(Integer id_Terrain) {
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

    public Integer getTerrain_Nb_Parcelle() {
        return Terrain_Nb_Parcelle;
    }

    public void setTerrain_Nb_Parcelle(Integer terrain_Nb_Parcelle) {
        Terrain_Nb_Parcelle = terrain_Nb_Parcelle;
    }

    public Integer getId_Utilisateur() {
        return id_Utilisateur;
    }

    public void setId_Utilisateur(Integer id_Utilisateur) {
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

    public Integer getId_Photo_Terrain() {
        return id_Photo_Terrain;
    }

    public void setId_Photo_Terrain(Integer id_Photo_Terrain) {
        this.id_Photo_Terrain = id_Photo_Terrain;
    }

    public String getPhoto_Terrain_img() {
        return Photo_Terrain_img;
    }

    public void setPhoto_Terrain_img(String photo_Terrain_img) {
        Photo_Terrain_img = photo_Terrain_img;
    }

    public Integer getId_Parcelle() {
        return id_Parcelle;
    }

    public void setId_Parcelle(Integer id_Parcelle) {
        this.id_Parcelle = id_Parcelle;
    }

    public Double getRendement() {
        return Rendement;
    }

    public void setRendement(Double Rendement) {
        Rendement = Rendement;
    }

    public Double getLargeur() {
        return Largeur;
    }

    public void setLargeur(Double Largeur) {
        Largeur = Largeur;
    }

    public Double getLongueur() {
        return Longueur;
    }

    public void setLongueur(Double Longueur) {
        Longueur = Longueur;
    }

    public Integer getId_Culture() {
        return id_Culture;
    }

    public void setId_Culture(Integer id_Culture) {
        this.id_Culture = id_Culture;
    }

    public String getCulture_Nom() {
        return Culture_Nom;
    }

    public void setCulture_Nom(String culture_Nom) {
        Culture_Nom = culture_Nom;
    }

    public Double getCulture_Prix() {
        return Culture_Prix;
    }

    public void setCulture_Prix(Double culture_Prix) {
        Culture_Prix = culture_Prix;
    }

    public Integer getId_Culture_Parcelle() {
        return id_Culture_Parcelle;
    }

    public void setId_Culture_Parcelle(Integer id_Culture_Parcelle) {
        this.id_Culture_Parcelle = id_Culture_Parcelle;
    }

    public Integer getId_Simulation() {
        return id_Simulation;
    }

    public void setId_Simulation(Integer id_Simulation) {
        this.id_Simulation = id_Simulation;
    }

    public Date getSimulation_Date() {
        return Simulation_Date;
    }

    public void setSimulation_Date(Date simulation_Date) {
        Simulation_Date = simulation_Date;
    }
}
