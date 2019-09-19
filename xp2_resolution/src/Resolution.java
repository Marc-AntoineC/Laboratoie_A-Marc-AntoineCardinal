import java.util.Scanner;

public class Resolution {

    public static void main (String[] args) {

        //variable
        double a;
        double b;
        double c;
        double x1;
        double x2;
        double dis;
        Scanner sc = new Scanner(System.in);

        //Entrée des valeurs
        System.out.println("Entrée des valeurs...");
        System.out.print("a :" );
        a = sc.nextInt();
        System.out.print("b :" );
        b = sc.nextInt();
        System.out.print("c :" );
        c = sc.nextInt();
        System.out.println("Équation : " + a + "x2 + " + b + "x + " + c + "= 0");

        //opérations
        dis = ((Math.pow(b, 2)) - (4*a*c));
        x1 = (- b + (Math.sqrt(dis))) / (2*a);
        x2 = (- b - (Math.sqrt(dis))) / (2*a);

        //Affichage
        System.out.println("Discriminant :" + dis);
        System.out.println("x1 :" + x1);
        System.out.println("x2 :" + x2);

        sc.close();
    }
}
