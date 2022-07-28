public class Caissier extends Employe {
    private int numeroDeCaisse;

    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }

    public void setNumeroDeCaisse(int numeroDeCaisse) {
        this.numeroDeCaisse = numeroDeCaisse;
    }

    public Caissier(int identifiant, String nom, String adresse, int nbr_heures, int numeroDeCaisse) {
        super(identifiant, nom, adresse, nbr_heures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    // 6. Calculer et afficher les différents salaires
    @Override
    public void afficheSalaire() {
        double salaire = .0;

        if(getNbr_heures() > 180)
            salaire = (5.0 * 180.0) + (getNbr_heures() - 180 ) * 5.75;
        else salaire = getNbr_heures() * 5.0;

        System.out.println(getNom() + " salaire : " + salaire);
    }
}
