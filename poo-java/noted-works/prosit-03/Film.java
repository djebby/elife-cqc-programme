// 2. Créer la classe Film...
public class Film {

    private int identifiant;
    private String libelle;
    private int duree;
    private double budget;

    private int nb_acteurs_max = 30;
    private Acteur[] acteurs = new Acteur[nb_acteurs_max];

    // 6. La minstere de la culture souhaite connaitre le nombre des acteurs...
    // a. nb_acteurs : déterminer le nombre des acteurs par film
    private int nb_acteurs = 0;
    // b. nb_tous_acteurs : déterminer le nombre des acteurs de tous les films...
    private static int nb_tous_acteurs = 0;

    public void setActeurs(Acteur[] acteurs) {
        if(acteurs.length < nb_acteurs_max) {
            this.acteurs = acteurs;
            nb_acteurs += acteurs.length;
            nb_tous_acteurs += nb_acteurs;
        }
        else
            System.out.println("nombre maximal des acteurs depasser");
    }

    public int getNb_acteurs() {
        return nb_acteurs;
    }

    public static int getNb_tous_acteurs() {
        return nb_tous_acteurs;
    }

    public Film(int identifiant, String libelle) {
        this.identifiant = identifiant;
        this.libelle = libelle;
    }

    public Film(int identifiant, String libelle, int duree) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.duree = duree;
    }

    public Film(int identifiant, String libelle, int duree, double budget) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.duree = duree;
        this.budget = budget;
    }
}