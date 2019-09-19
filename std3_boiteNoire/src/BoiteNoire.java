import java.text.DecimalFormat;

public class BoiteNoire {

    public static void main (String[] args) {

        //variables
        double mVolSphere = 3517;
        double poidsSphere;
        double rayonSphere = 2.15;
        double volumeSphere;
        double mVolSubstanceIsolation = 13545.88;
        double poidsSubstanceIsolation;
        double volumeSubstanceIsolation;
        double quantiteSubstanceIsolation;
        double poidsBoite = 375;
        double volumeBoite = 125;
        double poidsTotal;
        DecimalFormat df = new DecimalFormat("####.##" );

        //opérations
        volumeSphere = (4* Math.PI* Math.pow(rayonSphere, 3))/3;
        poidsSphere = volumeSphere*mVolSphere;
        volumeSubstanceIsolation = volumeBoite - volumeSphere;
        poidsSubstanceIsolation = volumeSubstanceIsolation*mVolSubstanceIsolation;
        quantiteSubstanceIsolation = volumeSubstanceIsolation*1000;
        poidsTotal= poidsBoite + poidsSphere + poidsSubstanceIsolation;

        // Affichage du rapport d'informations
        System.out.println("-------------------------------------------");
        System.out.println("-RAPPORT D'INFORMATIONS");
        System.out.println("  Sphere");
        System.out.println("   * Masse volumique : " + mVolSphere + " kg/m3");
        System.out.println("   * Poids : " + df.format(poidsSphere) + " kg");
        System.out.println("   * Rayon : " + rayonSphere + " m");
        System.out.println("   * Volume : " + df.format(volumeSphere) + " m3");
        System.out.println("  Substance isolante");
        System.out.println("   * Masse volumique : " + mVolSubstanceIsolation + " kg/m3");
        System.out.println("   * Poids : " + df.format(poidsSubstanceIsolation) + " kg");
        System.out.println("   * Volume : " + df.format(volumeSubstanceIsolation) + " m3");
        System.out.println("   * Quantite: " + df.format(quantiteSubstanceIsolation) + " l");
        System.out.println("  Boite noire");
        System.out.println("   * Poids : " + poidsBoite+ " kg");
        System.out.println("   * Volume : " + volumeBoite + " m3");
        System.out.println("   * Poids total : " + df.format(poidsTotal) + " kg");
        System.out.println("-------------------------------------------");

    }
}
