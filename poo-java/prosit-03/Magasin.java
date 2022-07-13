package tn.tuniprob.gestionmagasin;

public class Magasin {
    private int identifiant;
    private String adresse;
    private int capaciteMagasin = 50;
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

    // 3) Modifier la méthode « ajouterProduit » afin d’ajouter un produit donné une seule fois
    public void ajouterNouveauProduit(ProduitAlimentaire produitAlimentaire) {
	  if( dernierIndiceEnsProd < 50 && !estIlExist(produitAlimentaire.getIdentifiant()) ) {
		this.ensembleProduits[dernierIndiceEnsProd++] = produitAlimentaire;
        	nombreTotalTousProduits++;
	  } else {
	  	System.out.println("taille depasse ou produit existe deja");
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

    // 2) Ajouter une autre méthode qui sert à chercher un produit dans un magasin
    public boolean estIlExist(int id){
        for (int i = 0; i < dernierIndiceEnsProd; i++) {
            if(this.ensembleProduits[i].getIdentifiant() == id)
                return true;
        }
        return false;
    }

    // 4) Ajouter une méthode qui permet de supprimer un produit du magasin
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

    // 5) Créer une méthode qui retourne le magasin ayant un nombre supérieur de produits entre deux magasins
    public static Magasin superieurMagasin(Magasin magasin1, Magasin magasin2) {
        return magasin1.getDernierIndiceEnsProd() > magasin2.getDernierIndiceEnsProd() ? magasin1 : magasin2;
    }
}




































