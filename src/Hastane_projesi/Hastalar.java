package Hastane_projesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Hastalar {
    static Map<String, String> hastalarMap = new HashMap<>();
    static Scanner scan = new Scanner(System.in);

    public static void geciciHastaEkle() {
        hastalarMap.put("12345678910", "Ali, Can, 1980, Adana");
        hastalarMap.put("12345678911", "Veli, Yanik, 1978, Sivas");
        hastalarMap.put("12345678912", "Zeynep, Elican, 2000, Isparta");
        hastalarMap.put("12345678913", "Hasan, Kaya, 1998, Zonguldak");
        hastalarMap.put("12345678914", "Kamil, Hayati, 1996, Kocaeli");
        hastalarMap.put("12345678915", "Ahmet, Kaya, 1950, Diyarbakir");

    }

    public static void hastaEkrani() throws InterruptedException {
        String tercih = "";
        System.out.println("=========== CodeStar Hastanesi =============\n" +
                "=====   Bilgi Otomasyon Programi   ======\n" +
                "=====   Hasta Bilgileri Ekrani   ======\n" +

                "\t   1 - Hasta Bilgileri Listele\n" +// icinde kimlige gore listeleme olacak
                "\t   2 - Hasta Kayit Ekrani\n" +// icinde hastaSilme hastaEkleme  gibi metodlari cagiracak
                "\t   3 - Tahlil Ekrani\n" +  // Yapin asamasinda"

                "\t   Q - Exit\n");
        System.out.print("Lutfen secim yapiniz: ");
        tercih = scan.nextLine();
        switch (tercih) {
            case "1":
                //Hasta Bilgileri Listele
                hastaBilgileriListele();
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

            case "q":
            case "Q":
                break;
            default:
                hastaEkrani();
                break;
        }


    }

    public static void hastaBilgileriListele() throws InterruptedException {
        Set<Map.Entry<String, String>> hastaBilgiEntry = hastalarMap.entrySet();
        String[] hastaBilgi;
        String tcKimlik = "";
        System.out.print("Listelemek istediginiz hastanin TC.Kimlik Nosunu giriniz: ");
        String ara = scan.nextLine();
        int k = 0;
        for (Map.Entry<String, String> w : hastaBilgiEntry) {
            hastaBilgi = w.getValue().split(", ");
            tcKimlik = w.getKey();
            if (ara.equals(tcKimlik)) {
                System.out.println(tcKimlik + " " + hastaBilgi[0] + " " + hastaBilgi[1] + " " + hastaBilgi[2] + " " + hastaBilgi[3]);
                k = 1;
            }
        }
        if (k == 0) System.out.println("Bu kimlikte kisi yok");
        Thread.sleep(5000);

    }

    public static void tahlilEkrani() {
        System.out.println("YAPIM ASAMASINDA");
    }
    public static void hastaKayit() throws InterruptedException {
        System.out.println("TC kimlik no");
        String tcNo = scan.nextLine();

        System.out.println("Isim");
        String isim = scan.nextLine();

        System.out.println("Soyisim");
        String soyisim = scan.nextLine();

        System.out.println("Dogum yili");
        String dogumYili = scan.nextLine();

        System.out.println("Memleket");
        String memleket = scan.nextLine();

        String eklenecekValue = isim + ", " + soyisim + ", " + dogumYili + ", " + memleket;

        hastalarMap.put(tcNo, eklenecekValue);

        System.out.println("Hasta bilgi ekranina yonlendiriliyorsunuz");

        Thread.sleep(3000);
    }

}
