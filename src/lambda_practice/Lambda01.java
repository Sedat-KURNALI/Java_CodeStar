package lambda_practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda01 {//okul projesinde listele vb lamda expression ile yapiniz

    static ArrayList<String> names = new ArrayList<>(
            Arrays.asList("Tulay", "zekeriya", "hasan", "ismail", "osman", "fatih", "Ersin", "Mevlit"));

    static List<Integer> numbers = new ArrayList<>(Arrays.asList(25, 65, -56, 55, 98, -89, 65, 55, 21, -54, 9, 35, 35, 34));

    static List<String> menu = new ArrayList<>(Arrays.asList("kusleme", "adana", "trilice", "havucdilim", "buryan",
            "kokorec", "kuzutandir", "guvec"));

    /* TASK :

     * Input olarak verilen listteki isimlerden
     * icinde �a� harfi bulunanlari silen bir code create ediniz.
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */
    public static void aHarfleriSilenGerisiniYazdiran(ArrayList<String> isimler) {
//        System.out.println(isimler.stream()//akiisa alindi
//                .map(m -> m.toLowerCase())//hepsi kucuk harffe cevrilfi
//                .filter(m -> !m.contains("a"))//a harfi olmayanlar filtrelendi
//                .collect(Collectors.toList()));//lisste atildi
//      2.yol
//        System.out.println(isimler.stream()//akiisa alindi
//                .filter(m -> !m.contains("a") && !m.contains("A"))//a harfi olmayanlar filtrelendi
//                .collect(Collectors.toList()));//lisste atildi

//3.yol
        isimler.removeIf(t -> t.contains("a") || t.contains("A"));
        System.out.println(names);
    }

    //en buyyk elemani bulun
    public static void maxElemanBul(List<Integer> sayi) {

        Optional<Integer> maxSayi =
                sayi.stream().
                        reduce(Math::max);
        System.out.println("maxSayi = " + maxSayi);
        //2.yol
        System.out.println("sayi.stream().reduce(Integer::max) = " + sayi.
                stream().
                reduce(Integer::max));//spesifik bir method cagirirsani daha hizli yani alirsinz
//        reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
//                kullan�m� yayg�nd�r pratiktir.
//        Bir Stream i�erisindeki verilerin teker teker i�lenmesidir. Teker teker i�leme s�recinde, bir �nceki ad�mda elde edilen sonu�
//        bir sonraki ad�ma girdi olarak sunulmaktad�r. Bu sayede y���lml� bir hesaplama s�reci elde edilmi� olmaktad�r.
//                reduce metodu ilk parametrede identity de�eri, ikinci parametrede ise BinaryOperator t�r�nden bir obj kullan�l�r.
//                reduce i�leminde bir �nceki hesaplanm�� de�er ile s�radaki de�er bir i�leme tabi tutulmaktad�r.
//        ��leme ba�larken bir �nceki de�er olmad��� i�in bu de�er identity parametresinde tan�mlanmaktad�r.

    }


    // Task : List'teki tum elemanlarin toplamini yazdiriniz.
    //Lambda Expression...
    public static void elemanlariTopla(List<Integer> sayilar) {
        System.out.println("sayilar.stream().reduce(0,(a,b)-> a+b) = " +
                sayilar.stream()
                        .reduce(0, (a, b) -> a + b));


        System.out.println("sayilar.stream().reduce(Integer::sum) = " + sayilar.stream().
                reduce(Integer::sum).get());//spesifik methoda daha hizlidir

    }

    // Task : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void elemanlariCarp(List<Integer> sayilar) {
        //lambda expression ile
        System.out.println("sayilar.stream().reduce(1,(a,b)-> a*b) = " +
                sayilar.stream()
                        .filter(Methodlarim::ciftElemaniBul)//method ref kullanildi kendi class imizda
                        // create ettigimiz seed methodu kulandik
                        .reduce(1, (a, b) -> a * b));

        //method referans ile
        System.out.println(sayilar.stream().filter(Methodlarim::ciftElemaniBul)
                .reduce(Math::multiplyExact));
    }

    //TODO task tek sayilarin  karesini buyukten kucuge
    public static void teklerinKareBuyuktenKucuge(List<Integer> sayi) {
        sayi.stream().//liste aaskisa alindi
                filter(t -> t % 2 == 1)//tek olan rakamlari filtreeledim
                .map(t -> t * t)//her tek sayinin  karesi alindi
                .sorted(Comparator.reverseOrder())//buyukten kucuge srialandi
                .forEach(Methodlarim::yazdir);//seed method kullanilarakl method ref ile yazdirldi

    }

    // Task : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.
    public static void alfabetikBuyukHarfTekrarsiz(List<String> yemek) {

    }

    // Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void strKarakterSayisiYazdir(List<String> yemek) {

    }

    // Task :TODO list elemanlarinin son harfine gore ters sirali print ediniz.
    public static void sonHarfeGoreTersSira(List<String> yemek) {//yukarida tanimladigim listlerden calisiacam
        yemek.stream().//
                sorted(Comparator//siralama aksiyonuna girildi
                .comparing(t -> t.toString()//her bir eleman strige cevrildi elemanin kendisi alindi
                        .charAt(t.toString().length() - 1))//son karakter i charAt ile alindi
                .reversed())////son harfe gore tersine sirlandi
                .forEach(Methodlarim::yazdir);//yazdirldi
    }

    // Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz
    // buyukten kucuge sirali  print ediniz..
    public static void karakterCiftKareBuyuktenKucuge(List<String> yemek) {


    }

    // TODO Task : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.
    public static void karakterSayiYedidenBuyuk(List<String> yemek) {
        //ilkel yontem ile
        boolean kontrol = yemek.stream().allMatch(t -> t.length() <= 7);//true gelirse if caliscak
        if (kontrol) {
            System.out.println("list elemanlari 7 ve daha az harften olusmus");
        } else System.out.println("bazi elemanlar 7 den buyuk");

        //modern yazzim java 8 in faydalari
        System.out.println(yemek.stream()//akisa alindi
                .allMatch(t -> t.length() <= 7) ?//7 den kucuk olma durumu kontrol eildi tearnary ile sart a bakildi
                "list elemanlari 7 ve daha az harften olusmus" ://true ise mesaj donderildi
                "bazi elemanlar 7 den buyuk");//false ise mesaj donderildi


    }

    //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
    //noneMatch() --> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.


    // Task : List elelmanlarinin "W" ile baslamas�n� kontrol ediniz.
    public static void basHarfiWIleBaslayan(List<String> yemek) {


    }

    // TODO Task : List elelmanlarinin "x" ile biten en az bir elema� kontrol ediniz.
    public static void xIleBitenEleman(List<String> yemek) {


    }

    // TODO Task : Karakter sayisi en buyuk elemani yazdiriniz.
    public static void karkterEnFazla(List<String> yemek) {
        //limit(1) => S�n�rland�rma demek. Bu ak���n elemanlar�ndan olu�an, uzunlu�u maxSize'dan uzun olmayacak
        // �ekilde kesilmi� bir ak�� return eder. Stream return eder.
        Stream<String> sonIsim =//limit kullandigimiz icin bu sonucu sonIsim objesine atadik
                yemek.stream().//akisa alindi
                        sorted(Comparator.//sortladik
                        comparing(t -> t.toString().length()).//sortlamayi length ine gore yaptik
                        reversed()).//tersine cevirdik yani karakter sayisi en cok olan en basa geldi
                        limit(1);//limity ile ilk elemani aldik yani liteyi ilk eleman ile siniriladik

        System.out.println(//sonIsim objesi data turu nedir -> Stream oldugu icin ben bunu arraya cevirmem gerekli
                Arrays.toString//array olanlari stringe donusturup yazdirmamizi saglar
                        (sonIsim.toArray()));//Stream tipi arraya cevrildi


    }
          /*
  TR�CK : �    Stream'ler ekrana direk yazd�r�lamaz. Stream'i toArray() ile Array'e �eviririz.
  Array'i de Arrays.toString() 'in i�ine al�p yazd�rabiliriz.
�  �r; System.out.println(Arrays.toString(***.toArray())); veya System.out.println(Arrays.asList(***.toArray()));
kullan�labilir.

   */

    //TODO Task : list elemanlarini son harfine g�re siralay�p ilk eleman hari� kalan elemanlari print ediniz.
    public static void sonHarfeGoreSiralaIlkHaricElmanlariYaz(List<String> yemek) {


    }


}
