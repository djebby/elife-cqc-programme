package tn.tuniprob.gestionmagasin;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        ProduitAlimentaire produitAlimentaireLait = new ProduitAlimentaire(1021, "Lait", "Delice", 0.7f);
        ProduitAlimentaire produitAlimentaireYaourt = new ProduitAlimentaire(2410, "Yaourt", "Vitalait", 0.5f);
        ProduitAlimentaire produitAlimentaireYaourt02 = new ProduitAlimentaire(2411, "Yaourt", "Natilait", 0.55f);
        ProduitAlimentaire produitAlimentaireSicam = new ProduitAlimentaire(3250, "Tomate", "Sicam", 1.200f);

        produitAlimentaireLait.setDateDexpiration(LocalDate.of(2023, 06, 25));
        produitAlimentaireYaourt.setDateDexpiration(LocalDate.of(2023, 06, 25));
        produitAlimentaireYaourt02.setDateDexpiration(LocalDate.of(2023, 06, 25));
        produitAlimentaireSicam.setDateDexpiration(LocalDate.of(2023, 06, 25));

        // test 1) a.
        System.out.println( produitAlimentaireYaourt.comparer(produitAlimentaireYaourt02) );
        // test 2) b.
        System.out.println( ProduitAlimentaire.comparer(produitAlimentaireLait, produitAlimentaireLait) );

        Magasin magasin1 = new Magasin();
        magasin1.setIdentifiant(101);
        magasin1.setAdresse("Beja Rue Bizert");
        magasin1.setCapaciteMagasin(50);
        magasin1.ajouterNouveauProduit(produitAlimentaireLait);
        magasin1.ajouterNouveauProduit(produitAlimentaireYaourt);
        magasin1.ajouterNouveauProduit(produitAlimentaireYaourt02);

        Magasin magasin2 = new Magasin();
        magasin2.setIdentifiant(102);
        magasin2.setAdresse("BEJA NORD, Zone industrielle RTE TABARKA");
        magasin2.setCapaciteMagasin(50);
        magasin2.ajouterNouveauProduit(produitAlimentaireSicam);

        // test 2éme question
        System.out.println(magasin1.estIlExist(1021));
        System.out.println(magasin2.estIlExist(0523));

        // test 3éme question
        magasin2.ajouterNouveauProduit(produitAlimentaireSicam);

        // test 4éme question
        System.out.println("test 4eme question");
        magasin1.afficher();
        System.out.println(Magasin.getNombreTotalTousProduits());
        magasin1.supprimerProduit(1021);
        magasin1.afficher();
        System.out.println(Magasin.getNombreTotalTousProduits());

        // test 5éme question
        System.out.println("test 5eme question");
        System.out.println( Magasin.superieurMagasin(magasin1, magasin2) );
    }
}