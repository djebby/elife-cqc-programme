public class Magasin {
    private int identifiant;
    private String adresse;

    // 2. Modifier la taille maximum du tableau produit à 2
    private int capaciteMagasin = 2;
    private ProduitAlimentaire [] ensembleProduits = new ProduitAlimentaire[capaciteMagasin];
    private int dernierIndiceEnsProd = 0;

    public static int getNombreTotalTousProduits() {
        return nombreTotalTousProduits;
    }

    private static int  nombreTotalTousProduits = 0;

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCapaciteMagasin() {
        return capaciteMagasin;
    }

    public void setCapaciteMagasin(int capaciteMagasin) {
        this.capaciteMagasin = capaciteMagasin;
    }

    public int getDernierIndiceEnsProd() {
        return dernierIndiceEnsProd;
    }

    // 6. la méthode ajouterProduit() devra utiliser cette exception ( MagasinPleinException )
    public void ajouterNouveauProduit(ProduitAlimentaire produitAlimentaire) throws MagasinPleinException, PrixNegatifException {
        if(this.dernierIndiceEnsProd == this.capaciteMagasin) {
            throw new MagasinPleinException("la magasin est plein...");
        }
    // 1. enlevez les tests qui vérifient que le magasin n'est pas plein.
        if(!estIlExist(produitAlimentaire.getIdentifiant()) ) {
            if(produitAlimentaire.getPrix() <= 0)
                throw new PrixNegatifException("prix ne doit pas etre negatif");
            this.ensembleProduits[dernierIndiceEnsProd++] = produitAlimentaire;
            nombreTotalTousProduits++;
        } else {
            System.out.println("produit existe deja");
        }

    }

    public void afficher() {
        System.out.println("identifiant du magasin: "+this.identifiant);
        System.out.println("adresse du magasin: "+this.adresse);
        System.out.println("capacite du magasin: "+this.capaciteMagasin);
        System.out.println("----------- Les Produits -----------");
        for (int i = 0; i < dernierIndiceEnsProd; i++) {
            this.ensembleProduits[i].afficher();
            System.out.println("-----------");
        }
    }

    @Override
    public String toString() {
        String returnedStr = "identifiant du magasin: "+this.identifiant +
                "\nadresse du magasin: "+this.adresse +
                "\ncapacite du magasin: "+this.capaciteMagasin + "\n" +
                "----------- Les Produits -----------";

        for (int i = 0; i < dernierIndiceEnsProd; i++){
            returnedStr += "\n" + this.ensembleProduits[i].toString()
                    + "\n-----------";
        }

        return returnedStr;
    }

    public boolean estIlExist(int id){
        for (int i = 0; i < dernierIndiceEnsProd; i++) {
            if(this.ensembleProduits[i].getIdentifiant() == id)
                return true;
        }
        return false;
    }

    public void supprimerProduit(int id) {

        if(!estIlExist(id)) {
            System.out.println("produit avec identifiant : " + id + " n'existe plus.");
        } else {
            for (int i = 0; i < dernierIndiceEnsProd; i++) {
                if( this.ensembleProduits[i].getIdentifiant() == id ) {
                    for (int j = i; j < dernierIndiceEnsProd; j++) {
                        this.ensembleProduits[j] = this.ensembleProduits[j+1];
                    }
                    this.dernierIndiceEnsProd--;
                    nombreTotalTousProduits--;
                    break;
                }
            }
        }
    }


    public static Magasin superieurMagasin(Magasin magasin1, Magasin magasin2) {
        return magasin1.getDernierIndiceEnsProd() > magasin2.getDernierIndiceEnsProd() ? magasin1 : magasin2;
    }
}
