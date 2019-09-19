public class Geometrie {

    public static void main (String[] args) {

        //variables
        double rayon = 10;
        double sCercle;
        double hauteur = 7;
        double sCube;
        double vCube;
        double hCylindre = 5;
        double sCylindre;
        double vCylindre;
        double rCone = 3;
        double aCone;
        double sCone;
        double vCone;

        //Opérations
        sCercle = Math.PI*Math.pow(rayon, 2);
        sCube = 6*Math.pow(hauteur, 2);
        vCube = Math.pow(hauteur, 3);
        sCylindre = (2*Math.PI*rayon*hCylindre) + (2*Math.PI*Math.pow(rayon, 2)) ;
        vCylindre = (2*Math.PI*Math.pow(rayon, 2))*hCylindre;
        aCone = Math.sqrt(Math.pow(rCone, 2) + Math.pow(hauteur, 2));
        sCone = (Math.PI*rCone*aCone) + (Math.PI* Math.pow(rCone, 2));
        vCone = ((Math.PI* Math.pow(rCone, 2))*hauteur)/3;

        //Affichage
        System.out.println("Le cercle");
        System.out.println("-Rayon:" + rayon);
        System.out.println("-Surface:" + sCercle);
        System.out.println("Le cube");
        System.out.println("-Longueur:" + hauteur);
        System.out.println("-Surface:" + sCube);
        System.out.println("-Volume:" + vCube);
        System.out.println("Le cylindre");
        System.out.println("-Rayon:" + rayon);
        System.out.println("-Hauteur:" + hCylindre);
        System.out.println("-Surface:" + sCylindre);
        System.out.println("-Volume:" + vCylindre);
        System.out.println("Le cone");
        System.out.println("-Rayon:" + rCone);
        System.out.println("-Hauteur:" + hauteur);
        System.out.println("-Apothème:" + aCone);
        System.out.println("-Surface:" + sCone);
        System.out.println("-Volume:" + vCone);

    }
}
