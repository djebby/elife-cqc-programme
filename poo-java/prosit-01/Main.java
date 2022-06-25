import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // 1. Créer un produit vide (sans attributs)
        ProduitAlimentaire produitAlimentaireVide = new ProduitAlimentaire();

        /*
        2. Créer des nouveaux produits tout en spécifiant les caractéristiques suivantes :
            a. 1021, Lait et Delice
            b. 2510, Yaourt et Vitalait
            c. 3250, Tomate, Sicam et 1.200
        */

        ProduitAlimentaire produitAlimentaireLait = new ProduitAlimentaire(1021, "Lait", "Delice");
        ProduitAlimentaire produitAlimentaireYaourt = new ProduitAlimentaire(2410, "Yaourt", "Vitalait");
        ProduitAlimentaire produitAlimentaireSicam = new ProduitAlimentaire(3250, "Tomate", "Sicam", 1.200f);

        // 3. Afficher les détails de chaque produit créé en implémentant une méthode afficher().
        produitAlimentaireLait.afficher();
        produitAlimentaireYaourt.afficher();
        produitAlimentaireSicam.afficher();

        // 4. Attribuer le prix 0.700 au produit lait, afficher le produit modifié.
        produitAlimentaireLait.prix = 0.7f;
        produitAlimentaireLait.afficher();

        // 5. Compléter les informations manquantes pour chaque produit
        produitAlimentaireYaourt.prix = 0.5f;

        // 6. Afficher les produits modifiés.
        System.out.println("----------- 6. Afficher les produits modifies. -----------");
        produitAlimentaireLait.afficher();
        produitAlimentaireYaourt.afficher();
        produitAlimentaireSicam.afficher();

        // 7. Afficher les produits déjà crées avec la méthode toString(). Qu’est-ce que vous avez remarqué ?
        System.out.println(produitAlimentaireLait.toString());
        System.out.println(produitAlimentaireYaourt.toString());
        System.out.println(produitAlimentaireSicam.toString());
        /*
        par defaut il affiche le nom du class avec un pointeur dans la case memoire qui stocke l'object crée.
        mais aprés l'Override de la function toString j'ais la modifier pour nous affiche tou les propritée
        du l'objet ( produitX dans notre cas ).
        */

        // 8. Ajouter un attribut «date d’expiration» de type Date et affecter des dates aux produits
        //existants, et afficher le résultat.

        produitAlimentaireLait.dateDexpiration = LocalDate.of(2023, 06, 20);
        produitAlimentaireYaourt.dateDexpiration = LocalDate.of(2023, 06, 20);
        produitAlimentaireSicam.dateDexpiration = LocalDate.of(2023, 06, 20);

        System.out.println(produitAlimentaireLait.dateDexpiration);
        System.out.println(produitAlimentaireYaourt.dateDexpiration);
        System.out.println(produitAlimentaireSicam.dateDexpiration);
    }
}