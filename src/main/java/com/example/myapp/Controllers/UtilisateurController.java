package com.example.myapp.Controllers;

import com.example.myapp.Models.*;
import com.example.myapp.Services.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.*;

@RestController
@CrossOrigin(origins = "*") // Replace with your React app's URL
@RequestMapping("/utilisateurs")
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping
    public List<Utilisateur> getAllUtilisateurs() {
        return utilisateurService.getAllUtilisateurs();
    }

    // @GetMapping
    // public String testa() {
    // return "TESTAAAAA";
    // }

    @GetMapping("/{id}")
    public Utilisateur getUtilisateurById(@PathVariable Integer id) {
        return utilisateurService.getUtilisateurById(id);
    }

    // @PostMapping
    // public Utilisateur saveUtilisateur(@RequestBody Utilisateur utilisateur) {
    // return utilisateurService.saveUtilisateur(utilisateur);
    // }

    @PostMapping
    public ResponseEntity<Utilisateur> addUtilisateur(@RequestBody Utilisateur utilisateur) {
        try {
            Utilisateur newUtilisateur = utilisateurService.saveUtilisateur(utilisateur);
            return new ResponseEntity<>(newUtilisateur, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteUtilisateur(@PathVariable Integer id) {
        utilisateurService.deleteUtilisateur(id);
    }

    @PostMapping("/login")
    public ResponseEntity<Utilisateur> login(@RequestBody Utilisateur utilisateur) {
        // Extract email and password from utilisateur object
        String email = utilisateur.getEmail();
        String mdp = utilisateur.getMdp();

        Utilisateur loggedInUser = utilisateurService.login(email, mdp);

        if (loggedInUser != null) {
            return ResponseEntity.ok(loggedInUser);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }
    }
}