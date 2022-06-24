import java.util.Scanner;

public class Main {
    private static int n1 = 5;
    private static int n2 = 6;
    // Partie 1 :
    public static void main(String[] args) {
        float somme = 0;
        somme = n1 + n2;
        System.out.println("Le resultat est : " + somme);
        Division();
    }
    // Partie 3:
    public static float somme (int num1, int num2) {
        return num1 + num2;
    }

    // Partie 4 :
    public static  void affichageSomme (int num) {
        System.out.println(num);
    }
    public void affichageSomme() {
        System.out.println(somme(5, 6));
    }
    // Partie 6 :
    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer le premier entiee : ");
        n1 = scan.nextInt();
        System.out.println("Entrer le deuxieme entiee : ");
        n2 = scan.nextInt();
        int somme = n1 + n2 ;
        System.out.println("Le resultat est : " + somme );
    }
    // Partie 7 :
    public static void NumberDouble(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Donner un entitee : ");
        int number = scan.nextInt();
        System.out.println("Le Double et : " + number*2);
    }

    // Partie 8 :
    public static int SaisieEntierPositif(){
        Scanner scan = new Scanner(System.in);
        int number;
        do {
            System.out.println("Saisie un entier positif : ");
            number = scan.nextInt();
        } while(number < 0);
        return number;
    }

    // Partie 9 :
    public static float Division(float num1, float num2) {
        return num1/num2;
    }
    public static int DifferentDeZero() {
        Scanner scan = new Scanner(System.in);

        int entier;
        do {
            System.out.println("Saisie un entier different de zero : ");
            entier = scan.nextInt();
        } while(entier == 0);

        return entier;
    }
    public static float Division() {
        int num1 = DifferentDeZero();
        int num2 = DifferentDeZero();
        return num1/num2;
    }
}