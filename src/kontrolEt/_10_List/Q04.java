package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Bir ogretmenden girmek istedigi kadar notu aliniz, ve
        // ortalamayi gecen ogrenci sayisini bulunuz.
    	
    	 Scanner scan=new Scanner (System.in);
    	 System.out.println("kac not girecen");
    	 int notsayisi=scan.nextInt(); //kac not girecegini bastan soyluyor fazlasini girmesine engel olalim
    	 int sayac=0;
    	 List<Integer> listNotlar = new ArrayList<>();//boyut belli degil o yuzden list
    	 int ogrNot=0;
    	 while (sayac<notsayisi ) {
    		 System.out.print("not gir :  ");
    		 ogrNot=scan.nextInt();
    		 listNotlar.add(ogrNot);
    		  sayac++;                               }
    	 System.out.println(listNotlar);
    	 int toplam=0;
    	 for (int i = 0; i < listNotlar.size(); i++) {
    		 toplam+=listNotlar.get(i);
    	}System.out.println(toplam);
    	
    	 double ortalama=toplam/listNotlar.size(); 
    	
    	 System.out.println(ortalama);
    	 
    	
    	List<Integer>gecenlerListe=new ArrayList<>();
    	 int gecenler=0;
    	 for (int i = 0; i < listNotlar.size(); i++) {
    		 if (listNotlar.get(i)>ortalama) {//getirdigi, her bir i ortalamadan buyuk mu kontrol et
    			 gecenlerListe.add(listNotlar.get(i)) ;
    			 // buyukse gecenler int birer birer  artir
    			gecenler++;		
    }   		 
    }  
    	 System.out.println("girilen not sayisi : " + listNotlar.size());
    	 System.out.println("ortalamayi gecen kac not var : " + gecenler);
    	 System.out.println("ortalamayi gecen  not : " + gecenlerListe);
		
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	



    }
}
