package _08_While_DoWhile;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        // Kullanicidan 5 sayi isteyiniz, bu sayilardan en buyugunu bularak yazdırınız.

    	Scanner scan=new Scanner(System.in);
    	
    	int enBuyuksayi=0;
    	int count=0;
    	
    	while (count<5) {
    		System.out.println("sayi giriniz");
    		int sayi=scan.nextInt();
    		if (sayi>enBuyuksayi) {
				enBuyuksayi=sayi;
				
		
			}
    		count++;
		}
    	System.out.println("En buyuk sayi : " + enBuyuksayi);
    	
    	
    	
    	
    }
}


