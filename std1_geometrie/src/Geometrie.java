public class Geometrie {

    public static void main (String[] args) {

        //variables
        double rayon = 10;
        double scercle;
        double hauteur = 7;
        double scube;
        double vcube;
        double hcylindre = 5;
        double scylindre;
        double vcylindre;
        double rcone = 3;
        double acone;
        double scone;
        double vcone;

        //Opérations
        scercle = Math.PI*Math.pow(rayon, 2);
        scube = 6*Math.pow(hauteur, 2);
        vcube = Math.pow(hauteur, 3);
        scylindre = (2*Math.PI*rayon*hcylindre) + (2*Math.PI*Math.pow(rayon, 2)) ;
        vcylindre = (2*Math.PI*Math.pow(rayon, 2))*hcylindre;
        acone = Math.sqrt(Math.pow(rcone, 2) + Math.pow(hauteur, 2));
        scone = (Math.PI*rcone*acone) + (Math.PI* Math.pow(rcone, 2));
        vcone = ((Math.PI* Math.pow(rcone, 2))*hauteur)/3;

        //Affichage
        System.out.println("Le cercle");
        System.out.println("-Rayon:" + rayon);
        System.out.println("-Surface:" + scercle);
        System.out.println("Le cube");
        System.out.println("-Longueur:" + hauteur);
        System.out.println("-Surface:" + scube);
        System.out.println("-Volume:" + vcube);
        System.out.println("Le cylindre");
        System.out.println("-Rayon:" + rayon);
        System.out.println("-Hauteur:" + hcylindre);
        System.out.println("-Surface:" + scylindre);
        System.out.println("-Volume:" + vcylindre);
        System.out.println("Le cone");
        System.out.println("-Rayon:" + rcone);
        System.out.println("-Hauteur:" + hauteur);
        System.out.println("-Apothème:" + acone);
        System.out.println("-Surface:" + scone);
        System.out.println("-Volume:" + vcone);

    }
}
