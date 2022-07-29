public class Main {

    public static void main(String[] args) {
        // 3. Tester l’ajout dans la classe de test des 3 produits

        ProduitAlimentaire produitAlimentaireLait = null;
        ProduitAlimentaire produitAlimentaireYaourt = null;
        ProduitAlimentaire produitAlimentaireSicam = null;
        try {
            produitAlimentaireLait = new ProduitAlimentaire(1021, "Lait", "Delice", 0.7f);
            produitAlimentaireYaourt = new ProduitAlimentaire(2410, "Yaourt", "Vitalait", 0.5f);
            produitAlimentaireSicam = new ProduitAlimentaire(3250, "Tomate", "Sicam", 1.200f);
        }catch(PrixNegatifException exception) {
            System.out.println(exception.getMessage());
        }
        Magasin magasin = new Magasin();
        /*
        magasin.ajouterNouveauProduit(produitAlimentaireLait);
        magasin.ajouterNouveauProduit(produitAlimentaireYaourt);
        magasin.ajouterNouveauProduit(produitAlimentaireSicam);

        4. Qu’est vous remarquez ?
        Exception ArrayIndexOutOfBoundsException
        */

        // 5. corrigez l’erreur en proposant une solution
        try {
            magasin.ajouterNouveauProduit(produitAlimentaireLait);
            magasin.ajouterNouveauProduit(produitAlimentaireYaourt);
            magasin.ajouterNouveauProduit(produitAlimentaireSicam);

        }catch(MagasinPleinException exception) {
            System.out.println(exception.getMessage());
        }catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }
}
