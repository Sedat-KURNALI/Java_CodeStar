package lambda_deneme;

public class Utilty {
    public static boolean ciftBul(int sayi) {
        return sayi % 2 == 0;
    }

    public static boolean tekBul(int sayi) {
        return sayi % 2 == 1;
    }

    public static void yazdir(Object obj) {
        System.out.print(obj + " ");
    }
}
