package _06_Method_Creation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) { 
        // Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
    	
    	Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen cevirilecek birimi girin");
       String birim=scan.next();
        
        System.out.print("Lutfen cevirilecek birimin degerini girin");
        double miktar=scan.nextDouble();
        
        cevirCan(birim,miktar);
      
    }

	private static void cevirCan(String brm, double mkt) {
		switch (brm) {
		case "saat":
			System.out.println("Girilen saatin saniye degeri: " + mkt*60*60 + " saniye");
			break;
       case "mil":
			System.out.println("Girilen milin km degeri: " + mkt*1.6+ " km");
			break;
       case "kg":
			System.out.println("Girilen kgin gram degeri: " + mkt*1000 + " gram");
			break;

		default:
			System.out.println("Gecerli bir brim giriniz!");
			break;
			
		}
		
	}
}

