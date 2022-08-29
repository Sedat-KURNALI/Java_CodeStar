package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek elemanlarini ayri diziye bir metodda atayarak
        // main de yazdırınız.
   	
    	     Scanner scan=new Scanner(System.in);
    	     System.out.println("6 tane sayi giriniz: ");
    	     int arr[]=new int[6];     
    	    for (int i = 0; i < arr.length; i++) {
				System.out.println("Sirayla sayilari giriniz: ");
				 arr[i]=scan.nextInt();			
			}
    	    	 
    	  System.out.println("sayilar : " + Arrays.toString(arr));
    	      	  
    	  tekeleman(arr);
 System.out.println("Tek elemanlarin bulundugu tekli liste " + tekeleman(arr));
    }

	private static List<Integer> tekeleman(int[] arr) {
		
		List<Integer> tekeleman=new ArrayList<>();
		
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2!=0) {
				tekeleman.add(arr[i]);
			}
		
		}
		
		return tekeleman;	
	}

	

}
