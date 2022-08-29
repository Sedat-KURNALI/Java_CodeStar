package kontrolEt.P2_Ternary_IfStatements;

import java.util.Scanner;

public class sayiyiKullanma {

	public static void main(String[] args) {
		//Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen bir sayi giriniz ");
		int sayi=scan.nextInt();
		
		System.out.println("********** ternary cozum *********");
		
		String result=(sayi>=0)?((sayi<10)? ("Rakam"):("Pozitif ayi")): ("Negatif Sayi");
		System.out.println(result);
		
		System.out.println("********if cozumu*********");
		if (sayi>=0) {
             if (sayi<10) {
                System.out.println("rakam");
            }else {
                System.out.println("pozitif sayi");
            } 
        }  else {
			System.out.println("Negatif Sayi");    
        }
        
		
		scan.close();		
		
		

	}

}
