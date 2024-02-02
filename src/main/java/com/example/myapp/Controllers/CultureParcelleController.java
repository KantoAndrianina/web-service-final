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
@RequestMapping("/culture-parcelles")
public class CultureParcelleController {

    private final CultureParcelleService cultureParcelleService;

    @Autowired
    public CultureParcelleController(CultureParcelleService cultureParcelleService) {
        this.cultureParcelleService = cultureParcelleService;
    }

    @GetMapping
    public List<CultureParcelle> getAllCultureParcelles() {
        return cultureParcelleService.getAllCultureParcelles();
    }

    @PostMapping
    public CultureParcelle saveCultureParcelle(@RequestBody CultureParcelle cultureParcelle) {
        return cultureParcelleService.saveCultureParcelle(cultureParcelle);
    }

    // Ajoutez d'autres méthodes de contrôleur selon vos besoins

}
