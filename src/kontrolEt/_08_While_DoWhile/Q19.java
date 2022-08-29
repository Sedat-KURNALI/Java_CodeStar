package _08_While_DoWhile;

import java.util.Scanner;

public class Q19 {

    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
		System.out.println("Tam kare kontrolu icin sayi giriniz");
		boolean tamKareMi=true;
		int sayi=scan.nextInt();
		
		int sayac=1;
		
		while (sayac<=sayi) {
			
			if ((sayac*sayac)==sayi) {
				System.out.println("Girilen sayi = "+sayi+" Tam Karedir");
				System.out.println(tamKareMi);
				break;
			} 
			
			
			sayac++;
			
		}
	
		if ((sayac*sayac!=sayi)) {
			System.out.println("Girilen sayi = "+sayi+" Tam Kare Degildir");
			System.out.println(!tamKareMi);
			
		}
			
		
		scan.close();







	       /*  Problem TanımıbKombinasyon Sorusu Q15 FOR Ile Cozdum 
        Verilen iki sayının kombinasyonunu bulan kodu yazınız.
        Hatırlatma C(n,r) = n! / (r!(n-r)!)
        Ekran Çıktısı
        Birinci sayıyı giriniz: 15
        Ikinci sayıyı giriniz: 4
        Kombinasyon: 1365
        Birinci sayıyı giriniz: 5
        Ikinci sayıyı giriniz: 3
        Kombinasyon: 10
      */    Scanner scan1=new Scanner(System.in);
		
		System.out.println("kombinasyonunu bulmak istediginiz  iki  sayiyi giriniz"
				+ "\n1. sayidan sonra enter 2. sayidan sonra entera basiniz ");
		int sayi1 =scan1.nextInt();
		int sayi2 =scan1.nextInt();
		
		// for loop ile cozmeye calisalim
		int faktoriyel=1;
		int faktoriyel2=1;
		int kombinasyon=0;
		for (int i =1; i <=sayi2; i++) {
			if (i<=sayi2) {
			faktoriyel*=sayi1;
			--sayi1;
			faktoriyel2*=i;
			kombinasyon=faktoriyel/faktoriyel2;
			}
	
			
		}
		System.out.println("sayi1 in faktoriyeli = "+faktoriyel);
		System.out.println("sayi2 nin faktoriyeli = "+faktoriyel2);
		System.out.println("(sayi1,sayi2)'nin kombinasyon sonucu = "+kombinasyon);


    }
}
