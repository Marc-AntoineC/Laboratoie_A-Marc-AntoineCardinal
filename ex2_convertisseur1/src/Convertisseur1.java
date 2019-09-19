import java.util.Scanner;

public class Convertisseur1 {

    public static void main (String[] args) {

        //Variables
        double rad;
        double deg;
        Scanner sc = new Scanner(System.in);

        //Question
        System.out.print("Quel est l'angle en radian?");
        rad = sc.nextDouble();

        //opération
        deg = rad/Math.PI*180;

        //résultat
        System.out.print("La valeur de l'angle en degrés est :" + deg);

        sc.close();
    }
}
