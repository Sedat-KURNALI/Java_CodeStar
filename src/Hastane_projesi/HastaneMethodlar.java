package Hastane_projesi;

import java.util.Scanner;

public class HastaneMethodlar {
    static Scanner scan = new Scanner(System.in);

    public static void anaEkran() throws InterruptedException {
        String tercih = "";
        System.out.println("=========== CodeStar Hastanesi =============\n" +
                "=====   Bilgi Otomasyon Programi   ======\n" +

                "\t   1 - Hastalar\n" +
                "\t   2 - Poliklinik\n" +
                "\t   3 - Acil Servis\n" +

                "\t   Q - Exit\n");
        System.out.print("Lutfen secim yapiniz: ");
        tercih = scan.nextLine();
        switch (tercih) {
            case "1":
                // 1 - Hastalar
                Hastalar.hastaEkrani();
                anaEkran();
                break;

            case "2":
                // 2 - Poliklinik
                anaEkran();
                break;
            case "3":
                // 3 - Acil Servis
                anaEkran();
                break;
            case "q":
            case "Q":
                break;
            default:
                anaEkran();
                break;
        }
    }


    public static void ugurlama() {


    }
}
