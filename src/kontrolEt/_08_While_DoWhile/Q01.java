package _08_While_DoWhile;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
        // verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code yazin
        // Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        // 153 = (1*1*1) + (5*5*5) + (3*3*3) gibi
		
		
		int toplam =0;
		int rakam =0;
	    int num=153;
		int numilkdeger=num;
		
		while (num>0) {
          	rakam = num%10;
			toplam+=rakam*rakam*rakam;
			num/=10;
	        
		}

		if (toplam==numilkdeger) {
			System.out.println("Girdiginiz sayi amstrong bir sayidir:  "+ toplam);
		}else {
			System.out.println(numilkdeger + " bu amstrong sayi degil");
		}
		
		
		
		


	}

}
