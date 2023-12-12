public class TablicaTypow {
    public static void main(String[] args) {
        int[] tablicaInt = new int[5];

        tablicaInt[0] = 10;
        tablicaInt[1] = 20;
        tablicaInt[2] = 30;
        tablicaInt[3] = 40;
        tablicaInt[4] = 50;

        for (int i = 0; i < tablicaInt.length; i++) {
            System.out.println("Element " + i + ": " + tablicaInt[i]);
        }
        double[] tablicaDouble = { 1.5, 2.5, 3.5, 4.5, 5.5 };

        for (int i = 0; i < tablicaDouble.length; i++) {
            System.out.println("Element " + i + ": " + tablicaDouble[i]);
        }
    }
}