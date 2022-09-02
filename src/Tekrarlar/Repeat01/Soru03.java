package Tekrarlar.Repeat01;

import java.util.Scanner;

public class Soru03 {
    /*
        Kullanicidan 2 sayi girmesini isteyecegiz, girilen bu degerlerden biri saati digeri de dakikayi temsil edecek.
        bize akrep ile yelkovan arasindaki kucuk aciyi hesaplayip degeri acisal olarak donduren metodu yaziniz
        Ornek :
        input : hour : 12,  minutes : 30
        Output: 165
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Saatin Akrep ve Yelkovan arasindaki farkini bulmak için saat ve dakikayi ayrý ayrý giriniz!");

        System.out.print("Lutfen Saati Giriniz : ");
        double hour = scan.nextDouble();

        System.out.print("Lutfen Dakikayi Giriniz : ");
        double minutes = scan.nextDouble();

        System.out.println("Akrep ile Yelkovan arasindaki aci farki : " + aciAkrepYelkovanFarki(hour, minutes));
    }

    public static double aciAkrepYelkovanFarki(double hour, double minutes) {
        hour %= 12;
        double minuteAngle = 6 * minutes;
        double hourAngle = hour * 30 + 0.5 * minutes;
        double angle = Math.abs(minuteAngle - hourAngle);
        if (angle > 180) angle = 360 - angle;
        return angle;
    }
}



