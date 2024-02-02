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
@RequestMapping("/photo-terrains")
public class PhotoTerrainController {

    @Autowired
    private PhotoTerrainService photoTerrainService;

    @GetMapping
    public List<PhotoTerrain> getAllPhotosTerrain() {
        return photoTerrainService.getAllPhotoTerrains();
    }

    @GetMapping("/{id}")
    public Optional<PhotoTerrain> getPhotoTerrainById(@PathVariable int id) {
        return photoTerrainService.getPhotoTerrainById(id);
    }

    @PostMapping
    public PhotoTerrain savePhotoTerrain(@RequestBody PhotoTerrain photoTerrain) {
        return photoTerrainService.savePhotoTerrain(photoTerrain);
    }

    @DeleteMapping("/{id}")
    public void deletePhotoTerrain(@PathVariable int id) {
        photoTerrainService.deletePhotoTerrain(id);
    }
}
