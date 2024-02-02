package com.example.myapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.myapp.Models.*;


@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
   
}