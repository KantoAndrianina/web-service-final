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
    private Integer id_Photo_Terrain;

    private Integer id_Terrain;
    private String img;

    public Integer getId_Photo_Terrain() {
        return id_Photo_Terrain;
    }

    public void setId_Photo_Terrain(Integer id_Photo_Terrain) {
        this.id_Photo_Terrain = id_Photo_Terrain;
    }

    public Integer getId_Terrain() {
        return id_Terrain;
    }

    public void setId_Terrain(Integer id_Terrain) {
        this.id_Terrain = id_Terrain;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}