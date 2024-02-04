package com.example.myapp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

/*TY LE ANDRI NO METY FA NENAH JAVA 17*/
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.Column;
/* DE JEREO ANATY application.propreties fa misy zavatra napiko manova azy ho lasa postgres
 */
@Entity
public class Culture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Culture")
    private int id_Culture;

    @Column(name = "nom")
    private String nom;
    @Column(name = "prix")
    private double prix;

    public int getId_Culture() {
        return id_Culture;
    }

    public void setId_Culture(int id_Culture) {
        this.id_Culture = id_Culture;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

}
