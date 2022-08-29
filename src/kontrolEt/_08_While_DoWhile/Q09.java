package _08_While_DoWhile;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {
        //  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    	Scanner scan=new Scanner(System.in);
		System.out.println("Pin kodunu giriniz : ");
        int userPin=scan.nextInt();
      
        
         int systemPin=1453;
         while (userPin!=systemPin);  {
        	 System.out.println("***** hatali giris yaptiniz!");
             System.out.println("Tekrar deneyiniz.");
              userPin=scan.nextInt();    // kullanicidan yeni giris isteyecek
        
         }
        
        System.out.println("basarili giris ...");
        
        
    }
}

