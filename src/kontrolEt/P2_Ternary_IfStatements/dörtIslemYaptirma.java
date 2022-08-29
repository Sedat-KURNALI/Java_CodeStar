package kontrolEt.P2_Ternary_IfStatements;

import java.util.Scanner;

public class dörtIslemYaptirma {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */

		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen bir sayi giriniz");
		double sayi1=scan.nextDouble();
		System.out.println("Lutfen ikinci bir sayi giriniz");
		double sayi2=scan.nextDouble();
		System.out.println("Toplama islemi icin -> 1  \ncikarma islemi icin -> 2 \ncarpma islemi icin -> 3  \nbolme islemi icin  -> 4");
			int islem=scan.nextInt();	
		                    
		if (islem==1) {
			System.out.println("Girdiginiz sayilarin toplami :" + (sayi1+sayi2));
		}
		else if (islem==2) {
			System.out.println("Girdiginiz sayilarin farki :" + (sayi1-sayi2));
		}
		else if (islem==3) {
			System.out.println("Girdiginiz sayilarin carpimi: " + (sayi1*sayi2));
		}
		else if (islem==4) {
			System.out.println("Girdiginiz sayilarin orani :" + (sayi1/sayi2));
		}
		else {
			System.out.println("Lutfen gecerli bir sayi giriniz");
		}
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
