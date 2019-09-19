import java.util.Scanner;

public class ExperienceVerte {

    public static void main (String[] args) {

        //Variables
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int k1;
        int k2;
        int k3;
        int co2;
        Scanner sc = new Scanner(System.in);

        //Entrée des données
        System.out.println("Entrée des quantités...");
        System.out.print("A  : ");
        a = sc.nextInt();
        System.out.print("B  : ");
        b = sc.nextInt();
        System.out.print("C  : ");
        c = sc.nextInt();
        System.out.print("D  : ");
        d = sc.nextInt();
        System.out.print("E  : ");
        e = sc.nextInt();
        System.out.print("F  : ");
        f = sc.nextInt();
        co2 = 0;

        //Début
        System.out.println ("A_0{" + a + "} B_0{" + b + "} C_0{" + c + "} D_0{" + d + "} E_0{" + e
                + "} F_0{" + f + "} CO2_0{" + co2 + "}");

        //Opération r1
        System.out.println("R1 : 2A + 4C > 3D + CO2 ");
        k1 = Math.min( a/2, c/4 );
        System.out.println("k : " + k1);
        System.out.println("R1 : " + k1*2 + "A + " + k1*4 + "C > " + k1*3 + "D + " + k1 + "CO2");

        //Restants r1
        a = a - (k1*2);
        c = c - (k1*4);
        d = d + (k1*3);
        co2 = co2 + k1;
        System.out.println ("A_1{" + a + "} B_1{" + b + "} C_1{" + c + "} D_1{" + d + "} E_1{" + e
                + "} F_1{" + f + "} CO2_1{" + co2 + "}");

        //Opération r2
        System.out.println("R2 : B + 2C + E > 4F + 4CO2 ");
        k2 = Math.min(Math.min(b,(c/2)), (e) );
        System.out.println("k : " + k2);
        System.out.println("R2 : " + k2 + "B + " + k2*2 + "C + " + k2 + "E > " + k2*4 + "F + " + k2*4 + "CO2");

        //Restants r2
        b = b - k2;
        c = c - (k2*2);
        e = e - k2;
        f = f + (k2*4);
        co2 = co2 + (k2*4);
        System.out.println ("A_2{" + a + "} B_2{" + b + "} C_2{" + c + "} D_2{" + d + "} E_2{" + e
                + "} F_2{" + f + "} CO2_2{" + co2 + "}");

        //Opération r3
        System.out.println("R3 : A/2 + 4F > B + 4E + CO2 ");
        k3 = Math.min( a*2, f/4 );
        System.out.println("k : " + k3);
        System.out.println("R3 : " + k3/2 + "A + " + k3*4 + "F > " + k3 + "B + " + k3*4 + "E + " + k3 + "CO2");

        //Restants r3
        a = a - (k3/2);
        f = f - (k3*4);
        b = b + k3;
        e = e + (k3*4);
        co2 = co2 + k3;
        System.out.println ("A_3{" + a + "} B_3{" + b + "} C_3{" + c + "} D_3{" + d + "} E_3{" + e
                + "} F_3{" + f + "} CO2_3{" + co2 + "}");

        sc.close();
    }
}
