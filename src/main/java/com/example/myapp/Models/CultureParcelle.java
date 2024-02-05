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
    private Integer id_Culture_Parcelle;

    @Column(name = "id_Parcelle")
    private Integer idParcelle;

    @Column(name = "id_Culture")
    private Integer idCulture;

    // Getters and Setters
    public Integer getId_Culture_Parcelle() {
        return id_Culture_Parcelle;
    }

    public void setId_Culture_Parcelle(Integer id_Culture_Parcelle) {
        this.id_Culture_Parcelle = id_Culture_Parcelle;
    }

    public Integer getIdParcelle() {
        return idParcelle;
    }

    public void setIdParcelle(Integer idParcelle) {
        this.idParcelle = idParcelle;
    }

    public Integer getIdCulture() {
        return idCulture;
    }

    public void setIdCulture(Integer idCulture) {
        this.idCulture = idCulture;
    }
}
