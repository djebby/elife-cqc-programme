public class Vendeur extends Employe {
    private double tauxDeVente;

    public double getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(int tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    public Vendeur(int identifiant, String nom, String adresse, int nbr_heures, int tauxDeVente) {
        super(identifiant, nom, adresse, nbr_heures);
        this.tauxDeVente = tauxDeVente;
    }

    // 6. Calculer et afficher les différents salaires
    @Override
    public void afficheSalaire() {
        double salaire = 450 * (this.tauxDeVente / 100.0);
        System.out.println(getNom() + " salaire : " + salaire);
    }

}
