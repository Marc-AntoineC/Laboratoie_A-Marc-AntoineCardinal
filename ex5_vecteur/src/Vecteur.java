import java.util.Scanner;

public class Vecteur {

    public static void main (String[] args) {

        //valeurs
        double xa;
        double ya;
        double za;
        double xb;
        double yb;
        double zb;
        double distance;
        Scanner sc = new Scanner(System.in);

        //Questions A
        System.out.println("Quel sont les coordonnées du point A");

        System.out.print("xa :");
        xa = sc.nextDouble();
        System.out.print("ya :");
        ya = sc.nextDouble();
        System.out.print("za :");
        za = sc.nextDouble();

        //Affichage coordonnées A
        System.out.println("Le point A (" + xa + "," + ya +"," + za + ")");

        //Questions B
        System.out.println("Quel sont les coordonnées du point B");

        System.out.print("xb :");
        xb = sc.nextDouble();
        System.out.print("yb :");
        yb = sc.nextDouble();
        System.out.print("zb :");
        zb = sc.nextDouble();

        //Affichage coordonnées A
        System.out.println("Le point B (" + xb + "," + yb +"," + zb + ")");

        //opération
        distance = Math.sqrt((Math.pow(xb - xa, 2)) + (Math.pow(yb - ya, 2)) + (Math.pow(zb - za, 2)) );

        //Affichage distance
        System.out.print("La distance est :" + distance);

        sc.close();
    }
}
