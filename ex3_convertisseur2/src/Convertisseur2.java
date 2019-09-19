import java.text.DecimalFormat;
import java.util.Scanner;

public class Convertisseur2 {

    public static void main (String[] args) {

        //variables
        double rad;
        double deg;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("####.##" );

        //Question
        System.out.print("Quel est l'angle en degrés?");
        deg = sc.nextDouble();

        //opération
        rad = deg*Math.PI/180;

        //résultat
        System.out.print("La valeur de l'angle en randian est :" + df.format(rad));

        sc.close();
    }
}
