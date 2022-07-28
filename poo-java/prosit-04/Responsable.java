public class Responsable extends Employe {
    private int prime;

    public int getPrime() {
        return prime;
    }

    public void setPrime(int prime) {
        this.prime = prime;
    }

    public Responsable(int identifiant, String nom, String adresse, int nbr_heures, int prime) {
        super(identifiant, nom, adresse, nbr_heures);
        this.prime = prime;
    }

    // 6. Calculer et afficher les différents salaires
    @Override
    public void afficheSalaire() {
        double salaire = .0;

        if(getNbr_heures() > 160)
            salaire = 1600.0 + (getNbr_heures() - 160.0) * 12.0;
        else salaire = getNbr_heures() * 10.0;

        System.out.println(getNom() + " salaire : " + salaire);
    }
}
