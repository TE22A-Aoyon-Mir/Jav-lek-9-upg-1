public class App {
    public static void main(String[] args) throws Exception {
        
        //a
        addera(14, 34);
        addera(1212, 333);

        //b
        minus(14, 34);
        minus(1212, 333);

        //c
        omkretsCirkel(9);
        omkretsCirkel(33);
    }

    //a
    static int addera(int tal1, int tal2)
    {
        int summa = tal1+tal2;
        System.out.println(tal1+" + "+tal2+" = "+summa);
        return summa;
    }

    //b
    static int minus(int tal1, int tal2)
    {
        int summa = tal1-tal2;
        System.out.println(tal1+" - "+tal2+" = "+summa);
        return summa;
    }

    //c
    static double omkretsCirkel(double radie)
    {
        double omkrets = radie*2*3.14;
        System.out.println(radie+" * 2 * 3.14 = "+omkrets);
        return omkrets;
    }
}
