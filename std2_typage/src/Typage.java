public class Typage {

    public static void main (String[] args) {

        //variables
        int var1 = 10;
        float var2 = 6/5;
        char var3 = 10;

        //Conversion 1
        String var1String = Integer.toString(var1);
        System.out.println("Opération 1 : " + var1String);

        //Conversion 2
        boolean var1boolean = (var1 == 10);
        System.out.println("Opération 2 : " + var1boolean);
        //Impossible de convertir un int en boolean

        //Conversion 3
        int var2int = Math.round(var2);
        System.out.println("Opération 3 : " + var2int);

        //Conversion 4
        String var2String = Float.toString(var2int);
        System.out.println("Opération 4 : " + var2String);

        //Conversion 5
        int var3int = Character.getNumericValue(var3);
        System.out.println("Opération 5 : " + var3int);

    }
}
