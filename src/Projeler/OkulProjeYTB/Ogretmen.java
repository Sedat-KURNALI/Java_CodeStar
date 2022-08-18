package Projeler.OkulProjeYTB;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmen {

    static Map<String, String> ogretmenlerMap = new HashMap<>();
    static Scanner scan = new Scanner(System.in);

    public static void geciciOgretmenEkle() {
        ogretmenlerMap.put("12345678910", "Ali, Can, 1980, Bilisim");
        ogretmenlerMap.put("12345678911", "Veli, Yanik, 1978, Matematik");
        ogretmenlerMap.put("12345678912", "Zeynep, Elican, 2000, Cografya");
        ogretmenlerMap.put("12345678913", "Hasan, Kaya, 1998, Fizik");
        ogretmenlerMap.put("12345678914", "Kamil, Hayati, 1996, Matematik");
        ogretmenlerMap.put("12345678915", "Ahmet, Kaya, 1950, Muzik");

    }

    public static void ogretmenMenu() throws InterruptedException {
        String tercih = "";
        do {
            System.out.println("=========== YAZICIOGLU KOLEJI =============\n" +
                    "===========   OGRETMEN MENU   =============\n" +
                    "\n" +
                    "\t   1 - Ogretmenler Listesini Yazdir\n" +
                    "\t   2 - Soyisminden Ogretmen Bulma\n" +
                    "\t   3 - Branstan Ogretmen Bulma\n" +
                    "\t   4 - Bilgilerini Girerek Ogretmen Ekleme\n" +
                    "\t   5 - Kimlik No Ile Kayit Silme\n" +
                    "\t   A - Ana Menu\n" +
                    "\t   Q - Exit\n");
            tercih = scan.nextLine();
            switch (tercih) {
                case "1":
                    // 1 - Ogretmenler Listesini Yazdir
                    ogretmenListesiYazdir();
                    ogretmenMenu();
                    break;
                case "2":
                    //2 - Soyisminden Ogretmen Bulma
                    soyismindenOgretmenBulma();
                    ogretmenMenu();
                    break;
                case "3":
                    //3 - Branstan Ogretmen Bulma
                    branstanOgretmenBulma();
                    ogretmenMenu();
                    break;
                case "4":
                    //4 - Bilgilerini Girerek Ogretmen Ekleme
                    ogretmenEkleme();
                    ogretmenMenu();
                    break;
                case "5":
                    //5 - Kimlik No Ile Kayit Silme
                    kimlikIleOgretmenSilme();
                    ogretmenMenu();
                    break;
                case "A":
                case "a":
                    //A - Ana Menu
                    System.out.println("Ana Menuye Yonlendiriliyor \n");
                    Thread.sleep(5000);
                    Depo.anaMenu();
                    break;
                case "q":
                case "Q":
                    //Q - Exit
                    break;
                default:
                    ogretmenMenu();
                    break;
            }
        } while (tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();

    }

    public static void kimlikIleOgretmenSilme() {
        System.out.println("Silinecek ogretmenin kimligini giriniz :");

        String silinecekOgretmenKimlik = scan.nextLine();
        String silinecekValue = ogretmenlerMap.get(silinecekOgretmenKimlik);
        if (silinecekValue == null) {
            System.out.println("Boyle Kimlik Yok");
        } else {
            System.out.println("=========== YAZICIOGLU KOLEJI =============\n" +
                    "========    SILINECEK OGRETMEN    ==========\n" +
                    "T.C Kimlik      Adi       Soyadi     D.Tarihi      Bransi\n" +
                    "----------    --------   ---------   --------     ----------");

            String[] eachValueArr = silinecekValue.split(", ");

            System.out.printf("%-14s %-10s %-12s %-10s %-10s \n", silinecekOgretmenKimlik, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3]);
            ogretmenlerMap.remove(silinecekOgretmenKimlik);
        }
    }

    public static void ogretmenEkleme() {
        System.out.print("T.C Kimlik No: ");
        String kimlikNo = scan.nextLine();

        System.out.print("Adi: ");
        String adi = scan.nextLine();

        System.out.print("Soyadi: ");
        String soyadi = scan.nextLine();

        System.out.print("D.Terihi: ");
        String dogTarihi = scan.nextLine();

        System.out.print("Bransi: ");
        String bransi = scan.nextLine();

        String ekleOgretmen = adi + ", " + soyadi + ", " + dogTarihi + ", " + bransi;
        ogretmenlerMap.put(kimlikNo, ekleOgretmen);

    }

    public static void branstanOgretmenBulma() throws InterruptedException {
        System.out.print("Aranacak Bransi Giriniz : ");
        String brans = scan.nextLine();

        Set<Map.Entry<String, String>> ogretmenlerEntrySet = ogretmenlerMap.entrySet();
        System.out.println("=========== YAZICIOGLU KOLEJI =============\n" +
                "========  OGRETMEN ARAMA BRANSA GORE  ==========\n" +
                "T.C Kimlik      Adi       Soyadi     D.Tarihi      Bransi\n" +
                "----------    --------   ---------   --------     ----------");
        int varMi = 1;
        for (Map.Entry<String, String> each : ogretmenlerEntrySet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArr = eachValue.split(", ");
            if (brans.equalsIgnoreCase(eachValueArr[3])) {
                System.out.printf("%-14s %-10s %-12s %-10s %-10s \n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3]);
                varMi = 0;
            }
        }
        if (varMi == 1) {
            System.out.println("Aradiginiz Bransta Ogretmen Bulunamadi");
        }
        Thread.sleep(5000);
    }

    public static void soyismindenOgretmenBulma() throws InterruptedException {
        System.out.print("Aranacak Ogretmenin Soyismini Giriniz : ");
        String soyisim = scan.nextLine();

        Set<Map.Entry<String, String>> ogretmenlerEntrySet = ogretmenlerMap.entrySet();
        System.out.println("=========== YAZICIOGLU KOLEJI =============\n" +
                "========  OGRETMEN ARAMA SOYISIM ILE  ==========\n" +
                "T.C Kimlik      Adi       Soyadi     D.Tarihi      Bransi\n" +
                "----------    --------   ---------   --------     ----------");
        int varMi = 1;
        for (Map.Entry<String, String> each : ogretmenlerEntrySet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArr = eachValue.split(", ");
            if (soyisim.equalsIgnoreCase(eachValueArr[1])) {
                System.out.printf("%-14s %-10s %-12s %-10s %-10s \n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3]);
                varMi = 0;
            }
        }
        if (varMi == 1) {
            System.out.println("Aradiginiz Soyisinde Ogretmen Bulunamadi");
        }
        Thread.sleep(5000);
    }

    public static void ogretmenListesiYazdir() throws InterruptedException {

        Set<Map.Entry<String, String>> ogretmenlerEntrySet = ogretmenlerMap.entrySet();
        System.out.println("=========== YAZICIOGLU KOLEJI =============\n" +
                "===========  OGRETMEN LISTESI   =============\n" +
                "T.C Kimlik      Adi       Soyadi     D.Tarihi      Bransi\n" +
                "----------    --------   ---------   --------     ----------");

        for (Map.Entry<String, String> each : ogretmenlerEntrySet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArr = eachValue.split(", ");
            System.out.printf("%-14s %-10s %-12s %-10s %-10s \n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3]);
        }
        Thread.sleep(5000);

    }
}
