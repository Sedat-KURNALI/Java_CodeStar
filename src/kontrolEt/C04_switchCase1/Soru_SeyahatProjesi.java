package kontrolEt.C04_switchCase1;

import java.util.Scanner;

public class Soru_SeyahatProjesi {

    public static void main(String[] args, Object koln, Object frankfurt) {
    	/*  bulundugunuz yerden, bir yere yolculuk edeceksiniz.
        1. Koln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyati hesabi = Her 20 Km basina 5 euro. orn: 
        (100 km yol. Bilet parasi  (100/20)* 5 =25 euro
        todo iPUCU:  toplamTutar, islem, FrankfurtKm, KmBirimFiyat   
        gibi sabit veri tipleri olusturabilirsiniz. islemlerde direkt bunlari cagirabilirsiniz.
    	 iLK OLARAK;
        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---
                 Koln : 80 KM ---       (20 KM basina 5 euro bilet parasi alinmaktadir..)    yazisi gelsin.
          1.    Frankfurt veya Koln olarak bir giris yapin. 
                (Girdiginiz sehrin harfleri , girildikten sonra buyuk hale gelsin.
                todo    Frankfurt girildiyse,
                  orn: girdi= Frankfurt
                        case=FRANKFURT:
                       Rota = Frankfurt yazdirin.
                       Frankfurt km hesabi islemi yapin.
                       son olarak konsolda: Frankfurt 15 Euro         yazsin.
                       todo  case: KoLN ise
                       "Rota = Koln" yazdirin.
                       km hesabina gore islemi yapiniz.
       son olarak konsolda:  Koln   20 Euro             yazsin.
       2.  Sistem bize "Kac kisilik bilet istiyorsunuz? (Max 2 kisilik olabilir):   "   sorusunu sorsun.
       case:1  ise
        " 1 kisilik " yazdirin. (1 kisilik secerseniz bir islem yapmaniza gerek kalmaz, bilet ucreti yukarida coktan belirlenmis olur.)
        case:2 ise
        "2 kisilik " yazdirin
        2 kisi icin bilet fiyatini hesaplayin.
        todo  Son olarak yolculugunuzu check edin;
        konsolda orn:   Frankfurt  - 2 Kisilik    yazsin.
        1.Bakiyemi belirtin.
        2.Toplam Tutari belirtin.
        3.double paraUstu olusturun ve hesaplayin.
        4.Double para ustunu yazdirin.        */
    	
    	
		Scanner scan=new Scanner(System.in);
    	System.out.println("Hosgeldiniz:) Iyi yolculuklar dileriz");
    	System.out.println("Yolculuk nere hemserim: " +"\n1-Köln"+ "\n2-Frankfurt");
    	int islem=scan.nextInt();
		
    	
    
		MezarTurizm(frankfurt, koln);
        
  
	}



	private static void MezarTurizm(Object frankfurt, Object koln) {
		Scanner scan=new Scanner(System.in);
		int islem1=scan.nextInt();
		
		switch (islem1) {
		case 1:
		System.out.println("Rota Köln");
		System.out.println("Kac kisi gidiyorsunuz(Max iki kisi gidebilirsiniz!): ");
		int kisi=scan.nextInt();
		System.out.println("Kac km yapmayi planliyorsunuz: ");
		double kmKoln=scan.nextDouble();
		
			if (kisi>0) {
			System.out.println("Yolculuk tutari Köln : " + (kmKoln/20)*5 + "€");
			
		}else if (kisi<3) {
			System.out.println("Yolculuk tutari Köln 2 kisi icin : " + (kmKoln/20)*5 + "€");
		
		}else {
			System.out.println("Gitmiceniz mi? Gecerli bir deger giriniz lutfen... ");
		}		
			break;

		case 2:
		System.out.println("Rota Frankfurt");
		System.out.println("Kac kisi gidiyorsunuz(Max iki kisi gidebilirsiniz!): ");
		int kisif=scan.nextInt();
		System.out.println("Kac km yapmayi planliyorsunuz: ");
		double kmFrank=scan.nextDouble();
			if (kisif>0) {
			System.out.println("Yolculuk tutari Frankfurt : " + (kmFrank/20)*5 + "€");
			
		}else if (kisif<3) {
			System.out.println("Yolculuk tutari Frankfurt 2 kisi icin : " + (kmFrank/20)*5 + "€");
		
		}else {
			System.out.println("Gitmiceniz mi? Gecerli bir deger giriniz lutfen... ");
		}

			break;

		}	  
        

	}}
		
		
	



	
		


