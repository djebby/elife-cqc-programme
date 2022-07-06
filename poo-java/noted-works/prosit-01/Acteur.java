public class Acteur {
    private int identifiant;
    private String nom;
    private int age;
    private String domaineArtistique;

    public void setIdentifiant(int identifiant) { this.identifiant = identifiant; }
    public void setNom(String nom) { this.nom = nom; }
    public void setAge(int age) { this.age = age; }
    public void setDomaineArtistique(String domaineArtistique) { this.domaineArtistique = domaineArtistique; }

    public Acteur(){};
    public Acteur(int identifiant, String nom) {
        this.identifiant = identifiant;
        this.nom = nom;
    }
    public Acteur(int identifiant, String nom, String domaineArtistique) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.domaineArtistique = domaineArtistique;
    }
    public Acteur(int identifiant, String nom, String domaineArtistique, int age) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.domaineArtistique = domaineArtistique;
        this.age = age;
    }

    // 3. Afficher les détails de chaque Acteur...
    public void afficher() {
        if(this.identifiant != 0)
            System.out.println("identifiant d'act(eu)r(ice): " + this.identifiant);
        if(this.nom != null)
            System.out.println("nom d'act(eu)r(ice): " + this.nom);
        if(this.age != 0)
            System.out.println("age d'act(eu)r(ice): " + this.age);
        if(this.domaineArtistique != null)
            System.out.println("domaine artistique d'act(eu)r(ice): " + this.domaineArtistique);
    }

    // 7. Attribuer aux acteurs le salaire qui doit égale ou suppérieur à 1000DT
    private float salaire;
    public void setSalaire(float salaire) {
        if(salaire >= 1000) this.salaire = salaire;
        else System.out.println("le salaire doit egale ou supperieur a 1000DT");
    }
}