package com.example.myapp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

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

    public Terrain createTerrain(Terrain terrain) {
        return terrainRepository.save(terrain);
    }

    public Terrain updateTerrain(int id, Terrain updatedTerrain) {
        if (terrainRepository.existsById(id)) {
            updatedTerrain.setIdTerrain(id);
            return terrainRepository.save(updatedTerrain);
        } else {
            // Handle the case where the terrain with the given id is not found
            return null;
        }
    }

    public void deleteTerrain(int id) {
        terrainRepository.deleteById(id);
    }

    // public List<Terrain> getTerrainsByUserId(int idUtilisateur) {
    //     return terrainRepository.findByIdUtilisateur(idUtilisateur);
    // }

    public List<Terrain> findTerrainNonValide() {
        return terrainRepository.findByValidation(0);
    }

    public List<Terrain> findTerrainValide() {
        return terrainRepository.findByValidation(1);
    }

    public void validerTerrain(int idTerrain) {
        Optional<Terrain> optionalTerrain = terrainRepository.findById(idTerrain);

        if (optionalTerrain.isPresent()) {
            Terrain terrain = optionalTerrain.get();
            terrain.setValidation(1);
            terrainRepository.save(terrain);
        } else {
            // Handle the case where terrain with the given id is not found
            // You can throw an exception or handle it based on your application logic
        }
    }

    public void refuserTerrain(int id) {
        // Implementation to refuse/delete terrain
        // This might involve deleting the terrain from the repository
        terrainRepository.deleteById(id);
    }
}
