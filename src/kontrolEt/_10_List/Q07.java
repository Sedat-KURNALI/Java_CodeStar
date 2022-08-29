package _10_List;

import java.util.ArrayList;
import java.util.Arrays;

public class Q07 {

	public static void main(String[] args) {
		/*
		ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */
		/*int arr[] = { 1, 2, 3, 4 };
        int arryeni[]=new int[4];
        for (int i =arr.length-1; i>=0 ; i++) {
			arryeni[i]=arr[arr.length-1-i];
		}

		System.out.println("Tersten olusan yeni arrayim: " + arryeni);*/
		
		/*
        ayna check sorusu:
         input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
         output : verilen array simetriktir
         */
        //int arr[] = { 1, 2, 3, 4};
        /*int yeniarr[]=new int[4];
       for (int i = arr.length-1; i >= 0; i--) {
           yeniarr[i]=arr[arr.length-1-i];
          
    }
       System.out.println("yeni arr : " + Arrays.toString(yeniarr));
       int yepyeniarr[]=new int[arr.length+yeniarr.length];
       List<Integer> list= new ArrayList<>();
       for (Integer w : arr) {
           list.add(w);
        
    }
       for (Integer y : yeniarr) {
           list.add(y);
        
    }
       System.out.println("liste olarak : " + list);*/
        
        ArrayList<Integer> yepyeniarr= new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4, 3, 2, 1));
       String esitMi="";
       for (int i = 0; i < yepyeniarr.size(); i++) {
           if (yepyeniarr.get(i)==yepyeniarr.get(yepyeniarr.size()-1-i)) {
              esitMi="simetrik" ;
            
        } else {
            esitMi="simetrik degil";
        }
    }
       System.out.println(esitMi);
       
       
       
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}