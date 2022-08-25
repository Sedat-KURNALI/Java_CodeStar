package lambda_deneme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Methods {

    static ArrayList<String> names = new ArrayList<>(
            Arrays.asList("Tulay", "zekeriya", "hasan", "ismail", "osman", "fatih", "Ersin", "Mevlit"));

    static List<Integer> numbers = new ArrayList<>(Arrays.asList(25, 65, -56, 55, 98, -89, 65, 55, 21, -54, 9, 35, 35, 34));

    static List<String> menu = new ArrayList<>(Arrays.asList("kusleme", "adana", "trilice", "havucdilim", "buryan",
            "kokorec", "kuzutandir", "guvec"));

    // 1. Yol : Icinde a harfi bulunanlari silen code methodunu yaziniz
    public static void aHarfleriniSil01(ArrayList<String> isimler) {
        ArrayList<String> yeniListe = new ArrayList<>();
        yeniListe = (ArrayList<String>) isimler.stream()
                .map(m -> m.toLowerCase())
                .filter(t -> !t.contains("a"))
                .collect(Collectors.toList());
        System.out.println(yeniListe);
    }

    // 2. Yol : Icinde a harfi bulunanlari silen code methodunu yaziniz
    public static void aHarfleriniSil02(ArrayList<String> isimler) {
        System.out.println(isimler.stream()
                .map(m -> m.toLowerCase())
                .filter(t -> !t.contains("a"))
                .collect(Collectors.toList()));
    }
    // 3. Yol : Icinde a harfi bulunanlari silen code methodunu yaziniz

    public static void aHarfleriniSil03(ArrayList<String> isimler) {
        System.out.println(isimler.stream()
                .filter(t -> !t.contains("a") && !t.contains("A"))
                .collect(Collectors.toList()));
    }
    // 4. Yol : Icinde a harfi bulunanlari silen code methodunu yaziniz

    public static void aHarfleriniSil04(ArrayList<String> isimler) {
        isimler.removeIf(n -> (n.contains("a") || (n.contains("A"))));
        System.out.println(isimler);
    }

    // 1. Yol : En buyuk elemani bulan method yazin
    public static void enBuyukElemaniBul01(List<Integer> sayi) {
        System.out.println(sayi.stream().reduce(Math::max).get());
    }

    // 2. Yol : En buyuk elemani bulan method yazin
    public static void enBuyukElemaniBul02(List<Integer> sayi) {
        System.out.println(sayi.stream().reduce(Integer::max).get());
    }

    // 3. Yol : En buyuk elemani bulan method yazin
    public static void enBuyukElemaniBul03(List<Integer> sayi) {
        //  sayi.stream().sorted().;
    }

    // 1. Yol : Elemanlarin toplamini bulan method yazin
    public static void elemanlariTopla01(List<Integer> sayi) {
        System.out.println(sayi.stream().reduce(0, (a, b) -> a + b));
    }

    // 2. Yol : Elemanlarin toplamini bulan method yazin
    public static void elemanlariTopla02(List<Integer> sayi) {
        System.out.println(sayi.stream().reduce(Integer::sum).get());
    }

    // 3. Yol : Elemanlarin toplamini bulan method yazin
    public static void elemanlariTopla03(List<Integer> sayi) {
        //   System.out.println(sayi.stream().reduce(Math::).get());
    }

    // 1. Yol : Cift elemanlarin carpimini bulan method yazin
    public static void ciftElemanlarinCarpimi01(List<Integer> sayi) {
        System.out.println(sayi.stream().filter(c -> c % 2 == 0).reduce(1, (a, b) -> a * b));
    }

    // 2. Yol : Cift elemanlarin carpimini bulan method yazin
    public static void ciftElemanlarinCarpimi02(List<Integer> sayi) {
        System.out.println(sayi.stream().filter(Utilty::ciftBul).reduce(1, (a, b) -> a * b));
    }

    // 3. Yol : Cift elemanlarin carpimini bulan method yazin
    public static void ciftElemanlarinCarpimi03(List<Integer> sayi) {
        System.out.println(sayi.stream().filter(Utilty::ciftBul).reduce(Math::multiplyExact).get());
    }



}
