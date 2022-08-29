package _06_Method_Creation;

import java.util.Scanner;

public class Q06 {
	public static void main(String[] args) {
		/*
		 * Problem tanimi : Bir String icindeki tum karakterleri en fazla bir kez
		 * yazdiran parametreli bir method yaziniz. Test Data: input: "aabbcccccddddaaa"
		 * output: abcd
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("bir metin giriniz");
		String metin = scan.nextLine().toUpperCase();
		harfYazdir(metin);
	}
	private static void harfYazdir(String metin) {
		String bulunanharfler = "";

		String harfler = "ABCDEFGHIJKLMNOPRSTUVYZWQX";
		for (int i = 0; i < metin.length(); i++) {
			if (metin.contains(harfler.substring(i, i + 1))) {
				bulunanharfler += harfler.substring(i, i + 1);
			}

		}
		System.out.print("buldugum harf : " + bulunanharfler);
		System.out.println("");

	}
}