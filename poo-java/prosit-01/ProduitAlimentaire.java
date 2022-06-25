import java.time.LocalDate;

public class ProduitAlimentaire {
    public int identifiant;
    public String libelle;
    public String marque;
    public float prix;

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

    // 3. Afficher les détails de chaque produit créé en implémentant une méthode afficher().
    public void afficher(){
        System.out.println("identifiant: " + this.identifiant);
        System.out.println("libelle: " + this.libelle);
        System.out.println("marque: " + this.marque);
        System.out.println("prix: " + this.prix + " TND");
    }

    // 7. Afficher les produits déjà crées avec la méthode toString(). Qu’est-ce que vous avez remarqué ?

    @Override
    public String toString() {
        return "ProduitAlimentaire{" +
                "identifiant=" + identifiant +
                ", libelle='" + libelle + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                '}';
    }

    // 8. Ajouter un attribut «date d’expiration» de type Date et affecter des dates aux produits
    // existants, et afficher le résultat.
    public LocalDate dateDexpiration;
}