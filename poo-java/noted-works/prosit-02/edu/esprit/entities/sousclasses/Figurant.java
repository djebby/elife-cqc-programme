package edu.esprit.entities.sousclasses;

public class Figurant {
    public int idFigurant;
    private String nomFigurant;
    String paysFigurant;

    // 4- Développer les méthodes nécessaires qui vous permettent d’accèder en lecture et écriture...
    public String getNomFigurant() { return nomFigurant; }
    public void setNomFigurant(String nomFigurant) { this.nomFigurant = nomFigurant; }

    public String getPaysFigurant() { return paysFigurant; }
    public void setPaysFigurant(String paysFigurant) { this.paysFigurant = paysFigurant; }

    public Figurant(int idFigurant, String nomFigurant, String paysFigurant) {
        this.idFigurant = idFigurant;
        this.nomFigurant = nomFigurant;
        this.paysFigurant = paysFigurant;
    }
}
