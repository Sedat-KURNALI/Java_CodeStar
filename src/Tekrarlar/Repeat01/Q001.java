package Tekrarlar.Repeat01;

import java.util.Arrays;
import java.util.Scanner;

public class Q001 {

    public static void main(String[] args) {
        /*
		 * Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram durumunu belirleyen  Java kodunu yazınız.
			isAnagram("listen", "Silent") ==> true
		 */
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Anagram icin 1. degeri giriniz : ");
        String str1 = input.nextLine();

        System.out.print("Lutfen Anagram icin 2. degeri giriniz : ");
        String str2 = input.nextLine();

        boolean kontrol = isAnagram(str1, str2);
        if (kontrol) {
            System.out.println("Anagramdir");
        } else {
            System.out.println("Anagram degiller");
        }

    }

    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase().replace(" ", "");
        str2 = str2.toLowerCase().replace(" ", "");

        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (str1.equals(str2)) {
            System.out.println("Giridiginiz kelimeler esittir");
        } else if (arr1.length != arr2.length) {
            return false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (!arr1[i].equals(arr2[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
