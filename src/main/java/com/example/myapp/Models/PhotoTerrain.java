package com.example.myapp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

import jakarta.persistence.*;
import jakarta.persistence.Column;

@Entity
@Table(name = "Photo_Terrain")
public class PhotoTerrain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Photo_Terrain;

    private int id_Terrain;
    private String img;

    public int getId_Photo_Terrain() {
        return id_Photo_Terrain;
    }

    public void setId_Photo_Terrain(int id_Photo_Terrain) {
        this.id_Photo_Terrain = id_Photo_Terrain;
    }

    public int getId_Terrain() {
        return id_Terrain;
    }

    public void setId_Terrain(int id_Terrain) {
        this.id_Terrain = id_Terrain;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}