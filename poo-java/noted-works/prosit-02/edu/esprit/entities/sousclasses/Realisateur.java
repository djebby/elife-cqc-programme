package edu.esprit.entities.sousclasses;

public class Realisateur {
    public int idRealisateur;
    protected String nomRealisateur;
    private double salaireRealisateur;

    // 4- Développer les méthodes nécessaires qui vous permettent d’accèder en lecture et écriture...


    public String getNomRealisateur() { return nomRealisateur; }
    public void setNomRealisateur(String nomRealisateur) { this.nomRealisateur = nomRealisateur; }

    public double getSalaireRealisateur() { return salaireRealisateur; }
    public void setSalaireRealisateur(double salaireRealisateur) { this.salaireRealisateur = salaireRealisateur; }

    public Realisateur(int idRealisateur, String nomRealisateur, double salaireRealisateur) {
        this.idRealisateur = idRealisateur;
        this.nomRealisateur = nomRealisateur;
        this.salaireRealisateur = salaireRealisateur;

        calculNouveauSalaire();
    }

    // 6- On souhaite développer une méthode calculNouveauSalaire()
    private float calculNouveauSalaire() {
        System.out.println("le salaire du realisateur lors de la creation de l'instance est : "
                + this.salaireRealisateur);
        this.salaireRealisateur += 200;
        System.out.println("le salaire  apres l'invocation de la methode est : " + this.salaireRealisateur);

        return (float) (this.salaireRealisateur);
    }
}
