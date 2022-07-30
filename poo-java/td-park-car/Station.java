import java.util.Arrays;

// 3- Créer la classe Station
public class Station {
    private int id;
    private String nom;
    private Vehicule [] ensembleVehicules = new Vehicule[10];
    private int ensembleVehLastIndex = 0;

    // 3) a- Créer 2 constructeurs...
    public Station() {
    }

    public Station(int id, String nom, Vehicule[] ensembleVehicules) {
        this.id = id;
        this.nom = nom;
        this.ensembleVehicules = ensembleVehicules;
        this.ensembleVehLastIndex += ensembleVehicules.length;
    }

    // 3) b- Implémenter la méthode ajouterVehicule
    public void ajouterVehicule(Vehicule vehicule) {

        if(this.ensembleVehLastIndex < 10) {
            this.ensembleVehicules[ensembleVehLastIndex++] = vehicule;
        }else {
            System.out.println("pas de place disponible...");
        }
    }

    // 3) c- Implémenter la méthode toString
    @Override
    public String toString() {
        return "Station{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", ensembleVehicules=" + Arrays.toString(ensembleVehicules) +
                '}';
    }

    // 3) d- Implémenter la méthode nbrVoitureEssence
    public int nbrVoitureEssence() {
        int result = 0;
        for (int i = 0; i < this.ensembleVehLastIndex; i++) {
            if(this.ensembleVehicules[i] instanceof Voiture &&
                    this.ensembleVehicules[i].getTypeDeCarburant().equals("essence"))
                result++;
        }
        return result;
    }

    // 3) e- Implémenter la méthode nbrVoitureNoire
    public int nbrVoitureNoire() {
        int result = 0;
        for (int i = 0; i < this.ensembleVehLastIndex; i++) {
            if(this.ensembleVehicules[i] instanceof Voiture)
                if(((Voiture) this.ensembleVehicules[i]).getCouleur().equals("noire"))
                    result++;
        }
        return result;
    }
}
