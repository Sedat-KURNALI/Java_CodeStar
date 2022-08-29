package _08_While_DoWhile;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {

        //TODO STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazınız.

    	Scanner scan=new Scanner(System.in);
		
       String systemPin="Gul ben gulunce sende gul";
       int girisHakki=3;
       while (true) {
		System.out.println("Pin code giriniz: ");
		String userPin=scan.nextLine();
		if (userPin.equals(systemPin)) {
			System.out.println("Gayet basarili");
			break;
		}else {
			System.out.println("Hatali giris yaptiniz");
			girisHakki--;
			System.out.println("Kalan deneme hakkiniz : " + girisHakki);
			if (girisHakki==0) {
				System.out.println("Giris hakki kalmadi dobrowski");
				break;
				
			}
		}
		
		
		
	}
        
        
    	
    	
    	
    	


    }


}
