package Hastane_projesi;

import java.util.Scanner;

public class Hastalar {
    static Scanner scan = new Scanner(System.in);

    public static void hastaEkrani() {
        String tercih = "";
        System.out.println("=========== CodeStar Hastanesi =============\n" +
                "=====   Bilgi Otomasyon Programi   ======\n" +
                "=====   Hasta Bilgileri Ekrani   ======\n" +

                "\t   1 - Hasta Bilgileri Listele\n" +// icinde kimlige gore listeleme olacak
                "\t   2 - Hasta Kayit Ekrani\n" +// icinde hastaSilme hastaEkleme  gibi metodlari cagiracak
                "\t   3 - Tahlil Ekrani\n" +  // Yapin asamasinda"
                "\t   4 -   \n" +  // Yapin asamasinda

                "\t   Q - Exit\n");
        System.out.print("Lutfen secim yapiniz: ");
        tercih = scan.nextLine();
        switch (tercih) {
            case "1":
                //
                hastaEkrani();
                break;
            case "2":
                //
                hastaEkrani();
                break;
            case "3":
                tahlilEkrani();
                hastaEkrani();
                break;
            case "4":
                //
                hastaEkrani();
                break;
            case "q":
            case "Q":
                break;
            default:
                hastaEkrani();
                break;
        }


    }

    private static void tahlilEkrani() {
        System.out.println("YAPIM ASAMASINDA");
    }
}
