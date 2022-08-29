package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
	// kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	// ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	// java programi yazin
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Arrayin boyutunu giriniz");
        int arrBoyut=scan.nextInt();
		int arr[]=new int[arrBoyut];  //deklare ettik
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Arrayin " + (i+1) + ". elemanini giriniz: ");
	        arr[i]=scan.nextInt(); // buraya kadar assign ettik
		
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Girdiginiz arrayin max - min eleman degeri : "+ (arr[arrBoyut-1] - arr[0]));
	}

}
