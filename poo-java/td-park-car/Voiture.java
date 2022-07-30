// 2- Créer la classe Voiture...
public class Voiture extends Vehicule {
    private String couleur;

    public String getCouleur() {
        return couleur;
    }

    public Voiture(int id, String marque, String typeDeCarburant, String couleur) {
        super(id, marque, typeDeCarburant);
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "Voiture { " +
                "id=" + getId() +
                ", marque='" + getMarque() + '\'' +
                ", typeDeCarburant='" + getTypeDeCarburant() + '\'' +
                "couleur='" + couleur + '\'' +
                '}';
    }
}
