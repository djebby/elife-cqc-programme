public class Main {

    public static void main(String[] args) {
        // 1. Créer un Acteur génerique (sans attributs)
        Acteur acteurInconnue = new Acteur();

        // 2. Créer des nouveaux acteurs...
        Acteur actriceHend = new Acteur(9876, "Hend Sabri");
        Acteur acteurJaafer = new Acteur(12510, "Jaafer Gasmi", "Comedie");
        Acteur acteurDafer = new Acteur(32350, "Dafer Abeddine", "Drama", 49);

        // 4. Attribuer un age à l’acteur Jaafer Gasmi, afficher l’acteur modifié.
        acteurJaafer.setAge(47);
        acteurJaafer.afficher();

        // 5. Compléter les informations manquantes pour chaque acteur
        actriceHend.setDomaineArtistique("Drama");
        actriceHend.setAge(42);

        // 6. Afficher les acteurs modifiés.
        actriceHend.afficher();
    }
}