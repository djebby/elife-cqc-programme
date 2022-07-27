public class Main {
    public static void main(String[] args) {

        // 1. Affecter à l’actrise dont le nom est Hend Sabri...
        String[] hendArtDom = {"Drame", "Comedie", "Romance"};
        Acteur actriceHend = new Acteur(9876, "Hend Sabri", hendArtDom);

        // 3. Créer les films suivants...
        Film film1 = new Film(1234, "Samat Al kousour");
        Film film2 = new Film(4321, "Daweha", 80);
        Film film3 = new Film(5678, "Dachra", 75, 12000.500);

        // 5. Faire le casting/affectation des acteurs aux films
        String[] jaaferArtDom = {"Comedie"};
        Acteur acteurJaafer = new Acteur(12510, "Jaafer Gasmi", jaaferArtDom, 47);
        String[] daferArtDom = {"Drama"};
        Acteur acteurDafer = new Acteur(32350, "Dafer Abeddine", daferArtDom, 49);

        Acteur[] film1Acteurs = {actriceHend, acteurJaafer};
        film1.setActeurs(film1Acteurs);

        Acteur[] film2Acteurs = {acteurDafer};
        film2.setActeurs(film2Acteurs);

        // 6 - le nombre des acteurs...
        System.out.println(film1.getNb_acteurs()); // affiche 2
        System.out.println(film2.getNb_acteurs()); // affiche 1
        System.out.println(Film.getNb_tous_acteurs()); // affiche 3
    }
}