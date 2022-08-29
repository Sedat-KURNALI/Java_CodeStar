package _10_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q02 {

    public static void main(String[] args) {
     //2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tum elemanları bir
     //listeye kopyalayan ve harf sirasina gore yazdiran bir METHOD yazınız.
     //Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
     //   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

    	
    	String isim[][]= {{"Ali","Veli","Ayse"},{"Hasan", "Can"}, {"Suzan"}};
    	List<String> list=new ArrayList<>();
    	for (int kat = 0; kat < isim.length; kat++) {
			for (int daire = 0; daire < isim[kat].length; daire++) {
				list.add(isim[kat][daire]); // girilen katin dairesi list eklendi
			}
		}
    	
    	
    	System.out.println("ilk liste :" + list);
    	 Collections.sort(list);
    	System.out.println("siralamdan sonraki liste : " +list);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	

    }

}
