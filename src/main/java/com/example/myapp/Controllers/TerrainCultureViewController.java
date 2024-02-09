package com.example.myapp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


import com.example.myapp.Services.*;
import com.example.myapp.Models.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin(origins = "*") // Replace with your React app's URL
@RequestMapping("/terrain-cultures")
public class TerrainCultureViewController {

    @Autowired
    private TerrainCultureViewService terrainCultureViewService;

    @GetMapping
    public List<TerrainCultureView> getAllTerrainCultureViews() {
        return terrainCultureViewService.getAllTerrainCultureViews();
    }

    @GetMapping("/{id}")
    public Optional<TerrainCultureView> getTerrainCultureViewById(@PathVariable int id) {
        return terrainCultureViewService.getTerrainCultureViewById(id);
    }

    @GetMapping("/utilisateur/{idUtilisateur}")
    public List<TerrainCultureView> getTerrainCultureViewsByUtilisateurId(@PathVariable int idUtilisateur) {
        return terrainCultureViewService.findByIdUtilisateur(idUtilisateur);
    }

    // Ajoutez d'autres méthodes pour gérer les opérations CRUD si nécessaire
}
