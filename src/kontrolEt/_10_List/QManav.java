package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QManav {
	static List<String> urunListesi =new ArrayList<>();
	static List<Double> urunFiyatlari =new ArrayList<>();
	static double toplanOdenecekTutar;
		public static void main(String[] args) {
			/*
			 * Basit bir 5 ürünlü manav alisveris programi yaziniz.
			 *
			 * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor. 
			 * 2. Adim : Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari
			 *           goster, istiyorsa tekrar urun sectir. Bu islemi alisverisi bitirmek isteyene kadar tekrarla. 
			 * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle. 
			 * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
			 */
			Scanner scan = new Scanner(System.in);
			int tercih = 0;
			
			for (int i = 0; i < 100000; i++) {
				menuGoster();
				tercih = scan.nextInt();
				switch (tercih) {
				case 1:
					urunSec(urunListesi.get(0),urunFiyatlari.get(0));
					break;
				case 2:
					urunSec(urunListesi.get(1),urunFiyatlari.get(1));
					break;
				case 3:
					urunSec(urunListesi.get(2),urunFiyatlari.get(2));
					break;
				case 4:
					urunSec(urunListesi.get(3),urunFiyatlari.get(3));
					break;
				case 5:
					urunSec(urunListesi.get(4),urunFiyatlari.get(4));
					break;default:
					System.out.println("Yanlış Seçim yaptınız.");
					menuGoster();
					break;}}}
		
		
		
		
		private static void urunSec(String urunAdi, Double double1)
		{System.out.println("Kaç kilo istiyorsuz?");
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			int kacKilo= scan.nextInt();
			toplanOdenecekTutar+=double1*kacKilo;
			System.out.println("**********************************************");
			System.out.println("Poşetleriniz Hazır, şuan toplam odemeniz " + toplanOdenecekTutar );
			System.out.println("**********************************************");
			
			int secim =-1;
			System.out.println("Alışverişe devam etmek için 1'e, çıkış yapmak için 0'a basınız.");
			secim = scan.nextInt();
			
			if(secim==1) {
				menuGoster();
			}else if(secim==0) {
				System.out.println("Teşekkürler, birdaha bekleriz...");
				System.exit(0);
			}
}			private static void menuGoster() {
			Scanner scan = new Scanner(System.in);
			System.out.println("****Şen Kardeşler Manava Hoşgeldiniz.*****");
			System.out.println("	    ***Ürün Listesi***	");
			System.out.println("1-) Patates --> Kg (8 TL) ");
			System.out.println("2-) Domates --> Kg (7 TL) ");
			System.out.println("3-) Soğan --> Kg (12 TL) ");
			System.out.println("4-) Havuç --> Kg (14 TL) ");
			System.out.println("5-) Sarımsak --> Kg (25 TL) ");
			System.out.println("Almak istediğiniz ürünü seçiniz...");
			
		//	return tercih;​

	}
}
