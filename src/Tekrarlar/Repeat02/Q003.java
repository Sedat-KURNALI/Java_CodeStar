package Tekrarlar.Repeat02;

import java.util.Scanner;

public class Q003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayiyi giriniz : ");

        int sayi = scan.nextInt();

        int basamak = ("" + sayi).length();

        System.out.println(basamak);

    }
}
