package _10_List;

import java.util.ArrayList;
import java.util.List;

public class QAsalSayi {

  

	/*
    100 den kucuk asal sayilari yazdiran bir program yaziniz
     */
    public static void main(String[] args) {
    	 List<Integer>asalSayi=new ArrayList<>();
         int sayac = 0;
         for(int sayi=2;sayi<=100;sayi++)
         {
             int kontrol = 0;
             for (int i = 2; i < sayi; i++)
             {
                if (sayi % i == 0)
                 {
                     kontrol = 1;// bolunuyorsa kodu kir
                   
                     break;
                 } 
             }
                 
             if(kontrol==0)
             {
                       //bolunmuyorsa asal sayi
                   asalSayi.add(sayi);
                 sayac++; 
             }
         }
         System.out.println(asalSayi);
         







    }
}
