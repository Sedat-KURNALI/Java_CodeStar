package Tekrarlar;

import java.util.Scanner;

public class Q002 {
    public static void main(String[] args) {
         /* TASK :
                Kullanıcıdan 5 adet sayı isteyiniz
                Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */
        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        int sayi = 0;
        for (int i = 1; i < 6; i++) {

            System.out.print(i + ". Sayiyi giriniz : ");
            sayi = scan.nextInt();

            if (sayi < 5 || sayi > 10) {         // !(5 < sayi && sayi < 10)
                toplam += sayi;
            }
        }
        System.out.println("toplam = " + toplam);
    }
}
