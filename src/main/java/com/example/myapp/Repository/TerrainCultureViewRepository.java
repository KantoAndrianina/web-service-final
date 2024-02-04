package com.example.myapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.data.repository.query.*;
import org.springframework.data.jpa.repository.Query;


import com.example.myapp.Models.*;

@Repository
public interface TerrainCultureViewRepository extends JpaRepository<TerrainCultureView, Integer> {
    @Query("SELECT t FROM TerrainCultureView t WHERE t.id_Utilisateur = :idUtilisateur")
    List<TerrainCultureView> findByIdUtilisateur(@Param("idUtilisateur") int idUtilisateur);
}
