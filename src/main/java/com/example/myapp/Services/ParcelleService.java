package com.example.myapp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.example.myapp.Repository.*;
import com.example.myapp.Models.*;

@Service
public class ParcelleService {

    @Autowired
    private ParcelleRepository parcelleRepository;

    public List<Parcelle> getAllParcelles() {
        return parcelleRepository.findAll();
    }

    public Optional<Parcelle> getParcelleById(int id) {
        return parcelleRepository.findById(id);
    }

    public Parcelle saveParcelle(Parcelle parcelle) {
        return parcelleRepository.save(parcelle);
    }

    public void deleteParcelle(int id) {
        parcelleRepository.deleteById(id);
    }
}
