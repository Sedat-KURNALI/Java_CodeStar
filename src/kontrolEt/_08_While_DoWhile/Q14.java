package _08_While_DoWhile;

import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {
        /*  Problem Tanımı
        Verilen bir sayının faktöriyelini özyineli (recursive) olarak
        hespalayan fonksiyonu yazınız.

        Örnek Ekran Çıktıları
        Bir sayi giriniz: 6
        Faktöriyeli: 720

        Bir sayı giriniz: 3
        Faktöriyeli 6
     */
      Scanner scan=new Scanner(System.in);
      System.out.println("Bir sayi giriniz: ");
    	int sayi=scan.nextInt();
    	
    	int faktoriyel=1; //carpmaya aldigimiz icin 1 dedik etkisiz olsun diye
		while(sayi>0) {
			 faktoriyel*=sayi;
    	sayi--;
		}
    	
    	System.out.println("Faktoriyel " + faktoriyel);
    	
    	
    	
    	
    	
    	
    	
    	

    }
}


