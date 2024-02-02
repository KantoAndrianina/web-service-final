package com.example.myapp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.example.myapp.Repository.*;
import com.example.myapp.Models.*;
@Service
public class TerrainService {

    @Autowired
    private TerrainRepository terrainRepository;

    public List<Terrain> getAllTerrains() {
        return terrainRepository.findAll();
    }

    public Terrain getTerrainById(int id) {
        return terrainRepository.findById(id).orElse(null);
    }

    public Terrain saveTerrain(Terrain terrain) {
        return terrainRepository.save(terrain);
    }

    public void deleteTerrain(int id) {
        terrainRepository.deleteById(id);
    }

    public List<Terrain> getTerrainsByUserId(int idUtilisateur) {
        return terrainRepository.findByIdUtilisateur(idUtilisateur);
    }
}
