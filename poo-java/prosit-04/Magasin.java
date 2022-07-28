public class Magasin {

    private int identifiant;
    private String adresse;
    private String nom;
    private int capaciteMagasin = 50;
    private ProduitAlimentaire [] ensembleProduits = new ProduitAlimentaire[capaciteMagasin];
    private int dernierIndiceEnsProd = 0;
    private Employe [] employes = new Employe[20];
    private int employesLastIndex = 0;

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

    public void setEmployes(Employe[] employes) {
        this.employes = employes;
        this.employesLastIndex = employes.length;
    }

    // 3. Afficher les caractéristiques des employés déjà créés
    public void afficherEmployees() {
        System.out.println("les caracteristiques des employes du magasin " + this.nom);
        for (int i = 0; i < this.employesLastIndex; i++) {
            System.out.println(this.employes[i].toString());
        }
    }

    // 5. Afficher tous les détails de chaque magasin (id, nom, adresse, capacité, les produits et les employés).
    public void afficherDetailsMagasin() {
        System.out.println(toString());
        afficherEmployees();
    }

    public void nbEmployeParType() {
        int responsable = 0, caissier=0, vendeur = 0;
        for (int i = 0; i < this.employesLastIndex; i++) {
            if(this.employes[i] instanceof Responsable)
                responsable++;
            else if (this.employes[i] instanceof Caissier)
                caissier++;
            else
                vendeur++;
        }
        System.out.println("le nombre des employes par type dans magasin " + this.nom);
        System.out.println("nomber des responsable est " + responsable);
        System.out.println("nomber des caissier est " + caissier);
        System.out.println("nomber des vendeur est " + vendeur);
    }

    public Magasin(int identifiant, String nom, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.nom = nom;
    }

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

    // Mettre à jour la méthode toString pour afficher aussi les employés
    @Override
    public String toString() {
        String returnedStr = "identifiant du magasin: "+this.identifiant +
                "\nnom du magasin " + this.nom +
                "\nadresse du magasin: "+this.adresse +
                "\ncapacite du magasin: "+this.capaciteMagasin + "\n" +
                "----------- Les Produits -----------";

        for (int i = 0; i < dernierIndiceEnsProd; i++){
            returnedStr += "\n" + this.ensembleProduits[i].toString()
                    + "\n-----------";
        }

        for (int i = 0; i < this.employesLastIndex; i++) {
            returnedStr += "\n" + this.employes[i].toString() + "\n-----------";
        }

        return returnedStr;
    }

    public boolean estIlExist(int id) {
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
