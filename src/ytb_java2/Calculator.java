package ytb_java2;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner okuyucu = new Scanner(System.in);
		System.out.println("Hesap makineme ho�geldiniz.");
		System.out.println("Hesaplamak istedi�iniz 2 say�y� giriniz :");
		int sayiBir = okuyucu.nextInt();
		int sayiIki = okuyucu.nextInt();
		System.out.println("Hangi i�lemi yapmak istersiniz? (*,/,-,+)");
		char islem = okuyucu.next().charAt(0);
		int sonuc;
		switch(islem) {
		
		case '+':
				sonuc = sayiBir + sayiIki;
				System.out.println(sayiBir + " + " + sayiIki + " = " +sonuc);
				break;
			
		case '-':
				sonuc = sayiBir - sayiIki;
				System.out.println(sayiBir + " - " + sayiIki + " = " +sonuc);
				break;
			
		case '*':
				sonuc = sayiBir * sayiIki;
				System.out.println(sayiBir + " * " + sayiIki + " = " +sonuc);
				break;
		case '/': 
				sonuc = sayiBir / sayiIki;
				System.out.println(sayiBir + " / " + sayiIki + " = " +sonuc);
				break;
				
		default : System.out.println("�arpma,b�lme,��karma "
				+ "veya toplama i�lemi se�iniz.");
		}
		okuyucu.close();
		
	}

}
