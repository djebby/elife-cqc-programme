public class Main {
    public static void main(String[] args) {

        // 1. Créer dans la méthode main deux magasins...
        Magasin magasin1 = new Magasin(1, " Carrefour", "Centre-Ville ");
        Magasin magasin2 = new Magasin(2, "Monoprix", "Menzah 6");
        // 2. Créer 2 caissiers, un vendeur et un responsable pour le premier magasin
        Caissier caissier1 = new Caissier(1, "Lubna Sabbagh", "15 Avenue Trimeche", 190, 101);
        Caissier caissier2 = new Caissier(2, "Azza Haddad", "99 Rue Mohamed Ali Annabi", 200, 102);
        Vendeur vendeur1 = new Vendeur(3, "Ibrahim Omran Khouri", "63 Rue de damas", 205, 190);
        Responsable responsable1 = new Responsable(4, "Wahid Mustafa Hakimi", "32 Rue de baghdad", 170, 13);
        Employe [] magasin1Employees = { caissier1, caissier2, vendeur1, responsable1 };
        magasin1.setEmployes(magasin1Employees);

        // 2. un caissier, 3 vendeurs et un responsable pour le deuxième magasin
        Caissier caissier3 = new Caissier(5, "Daniel K. Ormsby", "542 McKinley Avenue", 180, 102);
        Vendeur vendeur2 = new Vendeur(6, "Samuel G. Strain", "59 Gore Street", 181, 230);
        Vendeur vendeur3 = new Vendeur(7, "Victoria W. Olson", "4961 Horner Street", 40, 140);
        Vendeur vendeur4 = new Vendeur(8, "Tina C. Delp", "3467 Green Avenue", 40, 470);
        Responsable responsable2 = new Responsable(9, "John Y. Andrews", "Largo Febo, 131", 40, 20);
        Employe [] magasin2Employees = { caissier3, vendeur2, vendeur3, vendeur4, responsable2};
        magasin2.setEmployes(magasin2Employees);

        // 3. Afficher les caractéristiques des employés déjà créés
        magasin1.afficherEmployees();
        magasin2.afficherEmployees();

        // 4. Créer et ajouter quelques produits pour chaque magasin
        ProduitAlimentaire produitAlimentaireLait = new ProduitAlimentaire(1021, "Lait", "Delice", 0.7f);
        ProduitAlimentaire produitAlimentaireYaourt = new ProduitAlimentaire(2410, "Yaourt", "Vitalait", 0.5f);
        ProduitAlimentaire produitAlimentaireYaourt02 = new ProduitAlimentaire(2411, "Yaourt", "Natilait", 0.55f);
        ProduitAlimentaire produitAlimentaireSicam = new ProduitAlimentaire(3250, "Tomate", "Sicam", 1.200f);

        magasin1.ajouterNouveauProduit(produitAlimentaireLait);
        magasin1.ajouterNouveauProduit(produitAlimentaireYaourt);
        magasin2.ajouterNouveauProduit(produitAlimentaireYaourt02);
        magasin2.ajouterNouveauProduit(produitAlimentaireSicam);

        // 5. Afficher tous les détails de chaque magasin...
        magasin1.afficherDetailsMagasin();
        magasin2.afficherDetailsMagasin();

        // 6. Calculer et afficher les différents salaires
        caissier1.afficheSalaire();
        caissier2.afficheSalaire();
        vendeur1.afficheSalaire();
        responsable1.afficheSalaire();
        caissier3.afficheSalaire();
        vendeur2.afficheSalaire();
        vendeur3.afficheSalaire();
        vendeur4.afficheSalaire();
        responsable2.afficheSalaire();

        System.out.println("------le nombre des employes par type dans magasin------");
        magasin1.nbEmployeParType();
        magasin2.nbEmployeParType();

        System.out.println(magasin1.toString());
        System.out.println(magasin2.toString());

        System.out.println(responsable2.equals(responsable2));
        System.out.println(responsable2.equals(responsable1));

    }
}