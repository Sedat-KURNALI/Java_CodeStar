package _10_List;

import java.util.ArrayList;
import java.util.List;

public class Q10 {
    /*
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     */
    public static void main(String[] args) {


        int arr[]= { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7,} ;  
        //3, 5+1, 2+7+9, 2+3+5+7
        List<Integer> list=new ArrayList<>();
        int toplam=0;
     
        for (int i = 0; i < arr.length; i++) {
           list.add(arr[i]);
           i++;
           toplam=arr[i]+arr[i+1];
           list.add(toplam);
           i+=2;
           toplam=arr[i]+arr[i+1]+arr[i+2];
           list.add(toplam);
           i+=3;
           toplam=arr[i]+arr[i+1]+arr[i+2]+arr[i+3];
           list.add(toplam);
           break;
           
       }
        
        System.out.println(list);
        
 	
    	
    }
}
