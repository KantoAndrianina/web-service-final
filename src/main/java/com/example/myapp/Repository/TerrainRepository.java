package com.example.myapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.example.myapp.Models.Terrain;

@Repository
public interface TerrainRepository extends JpaRepository<Terrain, Integer> {

    @Query("SELECT t FROM Terrain t")
    List<Terrain> getAllTerrains();

    @Query("SELECT t FROM Terrain t WHERE t.validation = 0")
    List<Terrain> findTerrainNonValide();
    
    @Query("SELECT t FROM Terrain t WHERE t.validation = 1")
    List<Terrain> findTerrainValide();
    
    List<Terrain> findByValidation(int validation);
}
