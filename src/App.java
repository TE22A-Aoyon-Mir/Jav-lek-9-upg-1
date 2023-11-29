public class App {
    public static void main(String[] args) throws Exception {
        
        //a
        int sum = addera(14, 34);
        System.out.println("14 + 34 = "+sum);
        sum = addera(1212, 333);
        System.out.println("1212 + 333 = "+sum);
    }
    static int addera(int tal1, int tal2)
    {
        int summa = tal1+tal2;
        return summa;
    }
}
