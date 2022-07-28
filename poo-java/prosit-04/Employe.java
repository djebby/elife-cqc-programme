

public abstract class Employe {
    private int identifiant;
    private String nom;
    private String adresse;
    private int nbr_heures;

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNbr_heures() {
        return nbr_heures;
    }

    public void setNbr_heures(int nbr_heures) {
        this.nbr_heures = nbr_heures;
    }

    public Employe(int identifiant, String nom, String adresse, int nbr_heures) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.nbr_heures = nbr_heures;
    }

    @Override
    public String toString() {
        return this.getClass().toString().split(" ")[1] + " { " +
                "identifiant=" + identifiant +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", nbr_heures=" + nbr_heures +
                '}';
    }

    // 6. Calculer et afficher les différents salaires pour les différents employés
    public abstract void afficheSalaire();

    // -Ajouter la méthode equals dans la classe Employe qui permet de comparer les employés selon l'identifiant et le le nom
    public boolean equals(Employe employe) {
        return this.identifiant == employe.getIdentifiant() && this.nom.equals(employe.getNom());
    }
}
