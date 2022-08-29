package _08_While_DoWhile;

import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {
    	// Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.
        
        
        Scanner scan=new  Scanner (System.in);
        
        char karakter = 0;
        char dogruGiris='x';
        
        
        while(karakter!=dogruGiris) {
        System.out.println("bir karakter giriniz");   
        karakter=scan.next().toLowerCase().charAt(0);
        if(karakter==dogruGiris) {  
            System.out.println("Program bitti");
            
        }else {
             System.out.println("Program çalışıyor");


        
		
          
        }}


    }
}
