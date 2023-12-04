public class App {
    public static void main(String[] args) throws Exception {

        //a
        addera(14, 34);
        addera(1212, 333);

        //b
        System.out.println("\n");
        minus(14, 34);
        minus(1212, 333);

        //c
        System.out.println("\n");
        omkretsCirkel(9);
        omkretsCirkel(33);

        //d
        System.out.println("\n");
        ritaLinje(5);

        //e
        System.out.println("\n");
        ritaRektangel(4, 5);
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

    //d
    static void ritaLinje(int längd)
    {
        for (int i=0; i<längd; i++)
        {
            System.out.print("-");
        }
    }

    //e
    static void ritaRektangel(int höjd, int bredd)
    {

        for (int i=0; i<höjd; i++)
        {
            for (int i2=0; i2<bredd; i2++)
            {
                System.out.print("*");
            }
            System.out.println(); //ny rad
        }
    }
}
