package _06_Method_Creation;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {

		/*
		 * Problem Tanımı : powerOfThree isminde bir method oluşturun. Parametre olarak
		 * int Return tipi boolean Bir tamsayı verildiğinde, 3 üssü olup olmadığını
		 * teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün. Örnek 1:
		 * Girdi: 27 Çıktı: true Açıklama: 3*3*3 =27 Sonuç= true Örnek 2: Girdi: 0
		 * Çıktı: false Örnek 3: Girdi: 9 Çıktı: true Açıklama: 3*3 = 9 Sonuç= true
		 * Örnek 4: Girdi: 45 Çıktı:: false Açıklama: 3*3*3*3 =81 Sonuç= false 45, 3ün
		 * üssü (kuvveti) değildir.
		 * 
		 * 
		 */

		int sayi = 81;
		

		powerOfThree(sayi);

	}

	private static boolean powerOfThree(int num) {
		boolean us = true;

		for (int i = 1; i <= num; i++) {

			if (num == Math.pow(3, i) ) {
				us = true;
				System.out.println(num +" "+ us);
				break;
			}else if(num != Math.pow(3, i)){
				us=false;
				System.out.println(num+ " " + us);
				break;
			}
		}
		System.out.println();

		return us;

	}

}
