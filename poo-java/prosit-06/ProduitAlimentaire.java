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

    // 7. On voulait interdire, l’ajout d’un produit ayant un prix négatif,
    public void setPrix(float prix) throws PrixNegatifException {
        if(prix > 0)
            this.prix = prix;
        else
            throw new PrixNegatifException("prix ne doit pas etre negatif");
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

    public ProduitAlimentaire(int identifiant, String libelle, String marque, float prix) throws PrixNegatifException {
        if(prix <= 0) throw new PrixNegatifException("prix ne doit pas etre negatif");
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

    public boolean comparer(ProduitAlimentaire produitAlimentaire) {
        if( produitAlimentaire.identifiant == this.identifiant &&
                produitAlimentaire.libelle == this.libelle &&
                produitAlimentaire.prix == this.prix  ) {
            return true;
        }
        return false;
    }

    public static boolean comparer(ProduitAlimentaire produitAlimentaire01, ProduitAlimentaire produitAlimentaire02) {
        if( produitAlimentaire01.identifiant == produitAlimentaire02.identifiant &&
                produitAlimentaire01.libelle == produitAlimentaire02.libelle &&
                produitAlimentaire01.prix == produitAlimentaire02.prix  ) {
            return true;
        }
        return false;
    }
}
