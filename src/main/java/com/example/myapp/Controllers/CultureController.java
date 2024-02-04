package com.example.myapp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.myapp.Services.*;
import com.example.myapp.Models.*;

@RestController
@CrossOrigin(origins = "https://lively-lollipop-255c7d.netlify.app")
@RequestMapping("/cultures")
public class CultureController {
    @Autowired
    private CultureService cultureService;

    @GetMapping
    public List<Culture> getAllCultures() {
        return cultureService.getAllCultures();
    }

    @PostMapping
    public ResponseEntity<Culture> addCulture(@RequestBody Culture culture) {
        try {
            Culture newCulture = cultureService.saveCulture(culture);
            return new ResponseEntity<>(newCulture, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/{id_Culture}/updatePrix")
    public ResponseEntity<Culture> updatePrix(@PathVariable int id_Culture, @RequestParam double newPrix) {
        Culture updatedCulture = cultureService.updatePrix(id_Culture, newPrix);

        if (updatedCulture != null) {
            return new ResponseEntity<>(updatedCulture, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
