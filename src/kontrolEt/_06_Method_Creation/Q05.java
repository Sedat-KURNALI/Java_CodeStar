package _06_Method_Creation;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
         /*
        Problem tanimi :
        Bir String icinde kac kelime oldugunu yazdiran bir method yaziniz.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */

    	Scanner scan=new Scanner(System.in);
    	System.out.println("Bir cumle girin: ");
    	String cumle=scan.nextLine();
    	
    	kacKelimevar(cumle);
 	
       
    }

	private static void kacKelimevar(String cumle) {
		int kelimeSayaci=0;
		for (int i = 0; i < cumle.length(); i++) {
			String kelime=cumle.substring(i, i+1);	
			if (kelime.equals(" ")) {
				kelimeSayaci++;
			}
		}
			System.out.println("Girdiginiz cumledeki kelime sayisi: " + (kelimeSayaci+1));
	
	}
}
