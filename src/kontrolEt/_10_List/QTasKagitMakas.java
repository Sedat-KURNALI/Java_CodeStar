package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QTasKagitMakas {

    public static void main(String[] args) {
        // tas >makas
        // makas >kagit
        // kagit >tas

        int kullanıcıKazandı = 0 , bilgisayarKazandı=0;
        Scanner Scan=new Scanner(System.in);
    
       
        System.out.println("0-taş ,1-kağıt ,2-makas");
   
       // for(int i=0 ;i<3;i++){
        
          int num = (int)(Math.random() * 3);
          
        System.out.println("Sıra sende: ");
        
          int  tahmin=Scan.nextInt();
    if(tahmin==0 && num == 2 || tahmin==1 && num==0 || tahmin==2 && num==1){
      kullanıcıKazandı++;
    }
    if(num==0 && tahmin == 2 || num==1 && tahmin==0 || num==2 && tahmin==1){
      bilgisayarKazandı++;
    }
    //}
    
      if(kullanıcıKazandı > bilgisayarKazandı){System.out.println("bilgisayar: "+bilgisayarKazandı+" oyuncu: "+kullanıcıKazandı+" Tebrikler Kazandınız!");}
      if(kullanıcıKazandı < bilgisayarKazandı){System.out.println("bilgisayar: "+bilgisayarKazandı+" oyuncu: "+kullanıcıKazandı+" Kaybettiniz!");}
      if(kullanıcıKazandı == bilgisayarKazandı){System.out.println("bilgisayar: "+bilgisayarKazandı+" oyuncu: "+kullanıcıKazandı+" Berabere!");}
    	
    	
    	
    	
    	
    	
    	
    	
    	

    }

}
