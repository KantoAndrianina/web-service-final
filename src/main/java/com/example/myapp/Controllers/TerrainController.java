package com.example.myapp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.myapp.Services.*;
import com.example.myapp.Models.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/terrains")
public class TerrainController {

    @Autowired
    private TerrainService terrainService;

    @GetMapping
    public List<Terrain> getAllTerrains() {
        return terrainService.getAllTerrains();
    }

    @GetMapping("/{id}")
    public Terrain getTerrainById(@PathVariable int id) {
        return terrainService.getTerrainById(id);
    }

    @PostMapping
    public Terrain saveTerrain(@RequestBody Terrain terrain) {
        return terrainService.saveTerrain(terrain);
    }

    @DeleteMapping("/{id}")
    public void deleteTerrain(@PathVariable int id) {
        terrainService.deleteTerrain(id);
    }

    @GetMapping("/utilisateur/{idUtilisateur}")
    public List<Terrain> getTerrainsByUserId(@PathVariable int idUtilisateur) {
        return terrainService.getTerrainsByUserId(idUtilisateur);
    }
}
