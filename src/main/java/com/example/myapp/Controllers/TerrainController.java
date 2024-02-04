package com.example.myapp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.myapp.Services.*;
import com.example.myapp.Models.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;



@RestController
// @CrossOrigin(origins = "")
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
    public ResponseEntity<Terrain> createTerrain(@RequestBody Terrain terrain) {
        Terrain createdTerrain = terrainService.createTerrain(terrain);
        return new ResponseEntity<>(createdTerrain, HttpStatus.CREATED);
    }

     @PutMapping("/{id}")
    public ResponseEntity<Terrain> updateTerrain(@PathVariable int id, @RequestBody Terrain updatedTerrain) {
        Terrain terrain = terrainService.updateTerrain(id, updatedTerrain);
        return terrain != null
                ? new ResponseEntity<>(terrain, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTerrain(@PathVariable int id) {
        terrainService.deleteTerrain(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/nonValide")
    public ResponseEntity<List<Terrain>> getNonValideTerrains() {
        List<Terrain> nonValideTerrains = terrainService.findTerrainNonValide();
        return new ResponseEntity<>(nonValideTerrains, HttpStatus.OK);
    }

    @GetMapping("/valide")
    public ResponseEntity<List<Terrain>> getValideTerrains() {
        List<Terrain> valideTerrains = terrainService.findTerrainValide();
        return new ResponseEntity<>(valideTerrains, HttpStatus.OK);
    }

    @PostMapping("/valider/{id}")
    public ResponseEntity<Void> validerTerrain(@PathVariable int id) {
        terrainService.validerTerrain(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}/refuser")
    public ResponseEntity<Void> refuserTerrain(@PathVariable int id) {
        terrainService.refuserTerrain(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // @GetMapping("/utilisateur/{idUtilisateur}")
    // public List<Terrain> getTerrainsByUserId(@PathVariable int idUtilisateur) {
    //     return terrainService.getTerrainsByUserId(idUtilisateur);
    // }
}
