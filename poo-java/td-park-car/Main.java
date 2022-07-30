public class Main {

    public static void main(String[] args) {
        Voiture voiture1 = new Voiture(10, "mazda", "essence", "noire");
        Voiture voiture2 = new Voiture(13, "ford", "pasence", "noire");

        Vehicule [] listofVeh = {voiture1, voiture2};
        Station station = new Station(101, "station011", listofVeh);

        System.out.println(station.toString()); // il faut afficher : Station{id=101, nom='station011', ensembleVehicules=[Voiture { id=10, marque='mazda', typeDeCarburant='essence'couleur='noire'}, Voiture { id=13, marque='ford', typeDeCarburant='pasence'couleur='noire'}]}
        System.out.println(station.nbrVoitureEssence()); // il faut : 1
        System.out.println(station.nbrVoitureNoire()); // il faut : 2
        System.out.println(voiture1.equals(voiture1)); // il faut : true
        System.out.println(voiture1.equals(voiture2)); // il faut : false
    }
}


