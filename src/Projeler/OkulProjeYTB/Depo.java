package Projeler.OkulProjeYTB;

import java.util.Scanner;

public class Depo {

    static Scanner scan = new Scanner(System.in);

    public static void anaMenu() throws InterruptedException {
        String tercih = "";
        do {
            System.out.println("=========== YAZICIOGLU KOLEJI =============\n" +
                    "===========      ANA MENU     =============\n" +
                    "\n" +
                    "\t   1 - Okul Bilgileri Goruntule\n" +
                    "\t   2 - Ogretmen Menu\n" +
                    "\t   3 - Ogrenci Menu\n" +
                    "\t   Q - Exit\n");
            System.out.println("Lutfen Menuden tercihinizi yapiniz");
            tercih = scan.nextLine();
            switch (tercih) {
                case "1":
                    //1 - Okul Bilgileri Goruntule
                    Depo.okulBilgileriniYazdir();
                    break;
                case "2":
                    //2 - Ogretmen Menu
                    Ogretmen.ogretmenMenu();
                    break;
                case "3":
                    //3 - Ogrenci Menu
                    break;
                case "q":
                case "Q":
                    //Q - Exit
                    break;
                default:
                    System.out.println("Lutfen gecerli tercih giriniz ");
            }

        } while (!tercih.equalsIgnoreCase("q"));

        Depo.projeDurdur();
    }

    private static void okulBilgileriniYazdir() throws InterruptedException {

        System.out.println("=========== YAZICIOGLU KOLEJI =============" +
                "\n\t Adres : " + Okul.adres +
                "\n\t Telefon : " + Okul.tel);
        Thread.sleep(5000);
    }

    public static void projeDurdur() {
        System.out.println("Programdan Ciktiniz - Iyi Gunler");
    }


}
