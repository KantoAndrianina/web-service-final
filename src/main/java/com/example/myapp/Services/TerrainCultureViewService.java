package com.example.myapp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.example.myapp.Repository.*;
import com.example.myapp.Models.*;

@Service
public class TerrainCultureViewService {

    @Autowired
    private TerrainCultureViewRepository terrainCultureViewRepository;

    public List<TerrainCultureView> getAllTerrainCultureViews() {
        return terrainCultureViewRepository.findAll();
    }

    public Optional<TerrainCultureView> getTerrainCultureViewById(int id) {
        return terrainCultureViewRepository.findById(id);
    }

    public List<TerrainCultureView> findByIdUtilisateur(int idUtilisateur) {
        return terrainCultureViewRepository.findByIdUtilisateur(idUtilisateur);
    }
    // Autres méthodes de service
}
