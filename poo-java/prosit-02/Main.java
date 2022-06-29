package tn.tuniprob.gestionmagasin;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        ProduitAlimentaire produitAlimentaireLait = new ProduitAlimentaire(1021, "Lait", "Delice", 0.7f);
        ProduitAlimentaire produitAlimentaireYaourt = new ProduitAlimentaire(2410, "Yaourt", "Vitalait", 0.5f);
        ProduitAlimentaire produitAlimentaireSicam = new ProduitAlimentaire(3250, "Tomate", "Sicam", 1.200f);

        produitAlimentaireLait.setDateDexpiration(LocalDate.of(2023, 06, 20));
        produitAlimentaireYaourt.setDateDexpiration(LocalDate.of(2023, 06, 20));
        produitAlimentaireSicam.setDateDexpiration(LocalDate.of(2023, 06, 20));


        Magasin magasin1 = new Magasin();
        magasin1.setIdentifiant(101);
        magasin1.setAdresse("Beja Rue Bizert");
        magasin1.setCapaciteMagasin(50);
        magasin1.ajouterNouveauProduit(produitAlimentaireLait);
        magasin1.ajouterNouveauProduit(produitAlimentaireYaourt);
        magasin1.afficher();
        System.out.println(magasin1.toString());

        Magasin magasin2 = new Magasin();
        magasin2.setIdentifiant(102);
        magasin2.setAdresse("BEJA NORD, Zone industrielle RTE TABARKA");
        magasin2.setCapaciteMagasin(50);
        magasin2.ajouterNouveauProduit(produitAlimentaireSicam);
        magasin2.afficher();
        System.out.println(magasin2.toString());

        System.out.println("Le nombre total de tous les produits " + Magasin.nombreTotalTousProduits);

    }
}