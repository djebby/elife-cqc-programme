import java.time.LocalDate;

public class ProduitAlimentaire {
    private int identifiant;
    private String libelle;
    private String marque;
    private float prix;

    private LocalDate dateDexpiration;


    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        if(prix > 0)
            this.prix = prix;
    }

    public void setDateDexpiration(LocalDate dateDexpiration) {
        this.dateDexpiration = dateDexpiration;
    }

    public LocalDate getDateDexpiration() {
        return dateDexpiration;
    }

    public ProduitAlimentaire() {
    }

    public ProduitAlimentaire(int identifiant, String libelle, String marque) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
    }

    public ProduitAlimentaire(int identifiant, String libelle, String marque, float prix) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }
    public void afficher(){
        System.out.println("identifiant: " + this.identifiant);
        System.out.println("libelle: " + this.libelle);
        System.out.println("marque: " + this.marque);
        System.out.println("prix: " + this.prix + " TND");
    }

    @Override
    public String toString() {
        return "identifiant=" + identifiant +
                "\nlibelle=" + libelle +
                "\nmarque=" + marque +
                "\nprix=" + prix + " TND";
    }

    // 1) a. méthode « comparer » prend un seul produit en paramètre return boolean
    public boolean comparer(ProduitAlimentaire produitAlimentaire) {
        if( produitAlimentaire.identifiant == this.identifiant &&
                produitAlimentaire.libelle == this.libelle &&
                produitAlimentaire.prix == this.prix  ) {
            return true;
        }
        return false;
    }

    // 1) b. méthode « comparer » prend deux produits en paramètre
    public static boolean comparer(ProduitAlimentaire produitAlimentaire01, ProduitAlimentaire produitAlimentaire02) {
        if( produitAlimentaire01.identifiant == produitAlimentaire02.identifiant &&
                produitAlimentaire01.libelle == produitAlimentaire02.libelle &&
                produitAlimentaire01.prix == produitAlimentaire02.prix  ) {
            return true;
        }
        return false;
    }
}