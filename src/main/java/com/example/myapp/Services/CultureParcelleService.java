package com.example.myapp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.example.myapp.Repository.*;
import com.example.myapp.Models.*;

@Service
public class CultureParcelleService {

    private final CultureParcelleRepository cultureParcelleRepository;

    @Autowired
    public CultureParcelleService(CultureParcelleRepository cultureParcelleRepository) {
        this.cultureParcelleRepository = cultureParcelleRepository;
    }

    public List<CultureParcelle> getAllCultureParcelles() {
        return cultureParcelleRepository.findAll();
    }

    public CultureParcelle saveCultureParcelle(CultureParcelle cultureParcelle) {
        return cultureParcelleRepository.save(cultureParcelle);
    }

    // Ajoutez d'autres méthodes de service selon vos besoins
}
