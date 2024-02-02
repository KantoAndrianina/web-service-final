package com.example.myapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


import com.example.myapp.Models.*;

@Repository
public interface TerrainRepository extends JpaRepository<Terrain, Integer> {
    List<Terrain> findByIdUtilisateur(int idUtilisateur);
}
