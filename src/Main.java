public class Main {

    public static int Faktorial(int angka) {
        if (angka < 0) {
            throw new IllegalArgumentException("Angka harus non-negatif.");
        } else if (angka == 0 || angka == 1) {
            return 1;
        } else {
            int x = 1;
            for (int i = angka; i > 0; i--) {
                x *= i;
            }
            return x;
        }

    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");

        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");

        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");


    }
}