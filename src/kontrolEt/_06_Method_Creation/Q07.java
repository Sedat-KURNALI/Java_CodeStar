package _06_Method_Creation;

import java.util.Scanner;

public class Q07 {public static void main(String[] args) {
    /*
        reverseString isminde bir method olusturun.
        Bu method bir String'i parametre olarak alsin.
        Ve bu method, girilen String'i tersten yazsin.
        Terste yazilmis halini yazdiriniz.

        orn: String = "Java'yi Seviyorum."
        Print: .muroyiveS iy'avaJ
         */
     // Scanner scan=new Scanner(System.in);
	 // System.out.println("Lutfen bir cumle giriniz");
     // scan.nextLine();
	  
	
	
	
	  String cumle="Hallo World!";                           
	  
	  
	   reverseString(cumle);
 
}

      private static void reverseString(String cumle) {
    	  for (int i = cumle.length()-1; i >= 0; i--) {  //Bu satirda cumle dondu tersine 
  			System.out.print(cumle.substring(i,i+1));  // donen cumleyi 0. indeksten itibaren yazdirdi
  		}
	
}
}
