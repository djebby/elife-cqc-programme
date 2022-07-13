package edu.esprit.test;

import edu.esprit.entities.Acteur;
import edu.esprit.entities.sousclasses.Figurant;
import edu.esprit.entities.sousclasses.Realisateur;

public class Main {

    public static void main(String[] args) {

        // 2- Créer les instances suivantes...
        Acteur act1 = new Acteur();
        Acteur act2 = new Acteur();

        Realisateur realisateur = new Realisateur(15, "Alain marvel", 1222.5);
        Figurant fig1 = new Figurant(5, "Julien", "France");
        Figurant fig2 = new Figurant(36, "Sami", "Algerie");

        // 3- On vous demande de modifier, dans la méthode main...
        fig1.idFigurant = 24;
        /*
            realisateur.salaireRealisateur *= 1.755;
            on ne peut pas accéder directement a l'attribut salaireRealisateur car
            elle est privée donc il faut utiliser les accesseurs et les mutateurs.
         */

        /* 5- ... modifier l’accès à la classe Figurant
           (de public vers private, puis de public vers default)

           1ére Cas ( de pubic vers private) :
                c'est un erreur syntaxique car on ne peut pas mettre
                un class privée c'est inutile.

           2éme Cas ( de public vers default ) :
                c'est un erreur de visibilité le class principale (Main) est
                défini dans une "package" et le class Realisateur dans une autre.

           => il faut mettre le Class Realisateur public
        */






    }
}

























