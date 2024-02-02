package com.example.myapp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.example.myapp.Repository.*;
import com.example.myapp.Models.*;

@Service
public class PhotoTerrainService {

    @Autowired
    private PhotoTerrainRepository photoTerrainRepository;

    public List<PhotoTerrain> getAllPhotoTerrains() {
        return photoTerrainRepository.findAll();
    }

    public Optional<PhotoTerrain> getPhotoTerrainById(int id) {
        return photoTerrainRepository.findById(id);
    }

    public PhotoTerrain savePhotoTerrain(PhotoTerrain photoTerrain) {
        return photoTerrainRepository.save(photoTerrain);
    }

    public void deletePhotoTerrain(int id) {
        photoTerrainRepository.deleteById(id);
    }
}
