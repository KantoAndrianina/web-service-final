package com.example.myapp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

import jakarta.persistence.*;
import jakarta.persistence.Column;


@Entity
@Table(name = "Culture_Parcelle")
public class CultureParcelle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Culture_Parcelle;

    @Column(name = "id_Parcelle")
    private int idParcelle;

    @Column(name = "id_Culture")
    private int idCulture;

    // Getters and Setters
    public int getId_Culture_Parcelle() {
        return id_Culture_Parcelle;
    }

    public void setId_Culture_Parcelle(int id_Culture_Parcelle) {
        this.id_Culture_Parcelle = id_Culture_Parcelle;
    }

    public int getIdParcelle() {
        return idParcelle;
    }

    public void setIdParcelle(int idParcelle) {
        this.idParcelle = idParcelle;
    }

    public int getIdCulture() {
        return idCulture;
    }

    public void setIdCulture(int idCulture) {
        this.idCulture = idCulture;
    }
}
