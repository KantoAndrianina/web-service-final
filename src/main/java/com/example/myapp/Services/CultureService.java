package com.example.myapp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.example.myapp.Repository.*;
import com.example.myapp.Models.*;

@Service
public class CultureService {
    
    @Autowired
    private CultureRepository CultureRepository;

    public List<Culture> getAllCultures() {
        return CultureRepository.findAll();
    }

    public Culture getCultureById(Integer id) {
        return CultureRepository.findById(id).orElse(null);
    }

    public Culture saveCulture(Culture culture) {
        return CultureRepository.save(culture);
    }

    public void deleteCulture(Integer id) {
        CultureRepository.deleteById(id);
    }

    public Culture updatePrix(int id_Culture, double newPrix) {
        Culture cultureToUpdate = CultureRepository.findById(id_Culture);

        if (cultureToUpdate != null) {
            cultureToUpdate.setPrix(newPrix);
            return CultureRepository.save(cultureToUpdate);
        } else {
            // Handle case where Culture with the given id_Culture is not found
            return null;
        }
    }
}
