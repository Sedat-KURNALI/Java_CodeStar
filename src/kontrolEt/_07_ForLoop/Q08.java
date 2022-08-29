package _07_ForLoop;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        // Kullanicidan bir String isteyin. Kullanicinin girdigi
        // String’in palindrome olup olmadigini kontrol eden bir program yazin.
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Cumle giriniz:");       
        
        String cumle = scan.next();
        String terskelime="";
      
    	for (int i = cumle.length()-1; i >= 0; i--) {  //Bu satirda cumle dondu tersine 
  			
		     terskelime+=cumle.charAt(i);
		      
    }   if (cumle.contains(terskelime)) {
		System.out.print("polindrom");
	} else {
        System.out.print("degil");
	}  
    	System.out.println();
           
        
	
	
	
	
}

}