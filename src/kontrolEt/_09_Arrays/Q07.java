package _09_Arrays;

import java.util.Arrays;

public class Q07 {

    public static void main(String[] args) {
        /*
         * write a method that accepts a 2 dimensional array and finds the max value
         * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
         * Input : {{1,2,3},{4,5},{6,7,8}}
         * Output : 8
         */

          int arr[][]={{1,2,-3},{41,55},{-61,-17,80}};
    	
    	System.out.println(maxdegerbul(arr));
  
    	
    	
    	
    	
    	
    	
    }

	private static int maxdegerbul(int[][] arr) {
		int max=arr[0][0];
		for (int kat = 1; kat < arr.length; kat++) {
			for (int daire = 0; daire < arr[kat].length; daire++) {
				if (arr[kat][daire]>max) {
					max=arr[kat][daire];
				}
			}
		}
		
		
		
		
		return max;
		
	}
}
