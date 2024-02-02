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
@RequestMapping("/parcelles")
public class ParcelleController {

    @Autowired
    private ParcelleService parcelleService;
   
    @GetMapping
    public List<Parcelle> getAllParcelles() {
        return parcelleService.getAllParcelles();
    }

    @GetMapping("/{id}")
    public Optional<Parcelle> getParcelleById(@PathVariable int id) {
        return parcelleService.getParcelleById(id);
    }

    @PostMapping
    public Parcelle saveParcelle(@RequestBody Parcelle parcelle) {
        return parcelleService.saveParcelle(parcelle);
    }

    @DeleteMapping("/{id}")
    public void deleteParcelle(@PathVariable int id) {
        parcelleService.deleteParcelle(id);
    }
}
