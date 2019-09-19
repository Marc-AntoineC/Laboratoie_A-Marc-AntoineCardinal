import java.util.Scanner;

public class Pythagore {

    public static void main (String[] args) {

        //variables
        double a;
        double b;
        double pythagoros;
        Scanner sc = new Scanner(System.in);

        //Questions utilisateurs
        System.out.print( "Quel est la valeur du côté A ?");
        a = sc.nextInt();
        System.out.print( "Quel est la valeur du côté B ?");
        b = sc.nextInt();

        //Opération
        pythagoros = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        //résultat
        System.out.print("La valeur de l'hypothénuse est :" + pythagoros);

        sc.close();
    }
}
