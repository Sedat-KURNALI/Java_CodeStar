package _09_Arrays;

public class Q04 {

	public static void main(String[] args) {
		/*
		 *  verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
		 * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
		 * int istenenToplam=9;
		 */
		int arr1[]= {5,7,-6,4,2,15,3,8,1};
		int istenenToplam=5;
		for (int i = 0; i < arr1.length; i++) { // arr kontrolu i nin bir tur atmasi icin j nin ilk turunu tamamlamasi lazim
		for (int j = i+1; j < arr1.length; j++) {  // sorunun tricki j bitene kadar i ayni kaliyor
			if (arr1[i]+ arr1[j]== istenenToplam) { 
				System.out.println(arr1[i] + " ile " + arr1[j] + " Toplami " + istenenToplam);
			}
		}	
		}
		
		
		
		
	}

}
