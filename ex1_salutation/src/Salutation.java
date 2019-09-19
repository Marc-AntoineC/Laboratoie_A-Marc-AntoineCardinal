import java.util.Scanner;

public class Salutation {

    public static void main (String[] args) {

        //Variables
        String nom;
        Scanner sc = new Scanner (System.in);

        //Question utilisateur
        System.out.print("Quel est votre nom ?");
        nom = sc.next();

        //Affichage
        System.out.print("Bonjour " + nom);

        sc.close();
    }
}
