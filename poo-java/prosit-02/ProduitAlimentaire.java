package tn.tuniprob.gestionmagasin;

import java.time.LocalDate;

public class ProduitAlimentaire {
    private int identifiant;
    private String libelle;
    private String marque;
    private float prix;

    private LocalDate dateDexpiration;


    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        if(prix > 0)
            this.prix = prix;
    }

    public void setDateDexpiration(LocalDate dateDexpiration) {
        this.dateDexpiration = dateDexpiration;
    }

    public LocalDate getDateDexpiration() {
        return dateDexpiration;
    }

    public ProduitAlimentaire() {
    }

    public ProduitAlimentaire(int identifiant, String libelle, String marque) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
    }

    public ProduitAlimentaire(int identifiant, String libelle, String marque, float prix) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }
    public void afficher(){
        System.out.println("identifiant: " + this.identifiant);
        System.out.println("libelle: " + this.libelle);
        System.out.println("marque: " + this.marque);
        System.out.println("prix: " + this.prix + " TND");
    }

    @Override
    public String toString() {
        return "identifiant=" + identifiant +
                "\nlibelle=" + libelle +
                "\nmarque=" + marque +
                "\nprix=" + prix + " TND";
    }
}