package com.example.myapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.example.myapp.Models.*;

@Repository
public interface TerrainCultureViewRepository extends JpaRepository<TerrainCultureView, Integer> {
    // List<TerrainCultureView> findByIdUtilisateur(int id_Utilisateur);
}
