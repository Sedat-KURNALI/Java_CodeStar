package Tekrarlar.Repeat01;

public class Soru03 {
    /*
        3.SORU :
        Kullanicidan 2 sayi girmesini isteyecegiz, girilen bu degerlerden biri saati digeri de dakikayi temsil edecek.
        bize akrep ile yelkovan arasindaki kucuk aciyi hesaplayip degeri acisal olarak donduren metodu yaziniz
        Ornek :
        input : hour : 12,  minutes : 30
        Output: 165
     */
    public static void main(String[] args) {
        double hour = 3;
        double minutes = 10;

        System.out.println("Akrep ile Yelkovan arasindaki aci farki : " + aciAkrepYelkovanFarki(hour, minutes));

    }

    public static double aciAkrepYelkovanFarki(double hour, double minutes) {
        double aci = 0;
        double dakikaAcisi = 0;
        double saatAcisi = 0;

        if (hour > 11) hour -= 12;
        dakikaAcisi = 6 * minutes;
        saatAcisi = hour * 30 + 0.5 * minutes;
        aci = dakikaAcisi - saatAcisi;
        if (aci < 0) aci *= -1;
        if (aci > 180) aci = 360 - aci;
        return aci;
    }
}