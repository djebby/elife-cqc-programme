// 1- Créer la classe Vehicule
public class Vehicule {
    private int id;
    private String marque;
    private String typeDeCarburant;

    // 1) a. - un constructeur paramétré
    public Vehicule(int id, String marque, String typeDeCarburant) {
        this.id = id;
        this.marque = marque;
        this.typeDeCarburant = typeDeCarburant;
    }

    // 1) b. les méthodes Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getTypeDeCarburant() {
        return typeDeCarburant;
    }

    public void setTypeDeCarburant(String typeDeCarburant) {
        this.typeDeCarburant = typeDeCarburant;
    }

    // 1) c. la méthode toString
    @Override
    public String toString() {
        return "Vehicule { " +
                "id=" + id +
                ", marque='" + marque + '\'' +
                ", typeDeCarburant='" + typeDeCarburant + '\'' +
                '}';
    }

    // 1) d. la méthode equals
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Vehicule) {
            if(this.id == ((Vehicule) obj).id && this.marque.equals(((Vehicule) obj).marque) ) {
                return true;
            }
        }
        return false;
    }

}
































