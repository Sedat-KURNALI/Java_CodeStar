package ytb_java2;

import java.util.Scanner;

public class YourLuck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner okuyucu = new Scanner(System.in);
		System.out.println("Ýsminiz nedir?");
		String isim = okuyucu.next();
		System.out.println("Merhaba, " + isim);
		System.out.println("Yaþýnýz kaç?");
		int yas = okuyucu.nextInt();
		System.out.println("Þanslý sayýnýz :");
		
		int harfSayisi = isim.length();

		int sansliSayi = 0;

		if(yas<15) {
			
			sansliSayi = (harfSayisi * yas) % 10;
			
		}else if(yas<20){
			
			sansliSayi = (yas *yas - harfSayisi) % 10;
			
		}else if(yas<40){
			
			sansliSayi = (harfSayisi - yas) % 10;
			
		}else if(yas<60) {
			
			sansliSayi = (yas + harfSayisi) % 10;
			
		}else {
			
			sansliSayi = (harfSayisi * 5 - yas) % 10;
			//fjfjfjfj
		}
		
		if(sansliSayi < 0)
			sansliSayi = sansliSayi * -1;
		
		
		System.out.println(sansliSayi);
		
	}

}
