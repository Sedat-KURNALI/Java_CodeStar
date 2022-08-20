package Tekrarlar.Repeat01;

import java.util.Arrays;

public class Soru02 {
    /*
        Bir array , integer bir "k" de?eri ve e?ik de?eri olarakda integer "thereshold" de?eri verilecek, "k" boyutunda
        ve elemanlar?n?n ortalamas? e?ik de?erinden b?y?k veya ona e?it olan ka? adet alt-dizilerin oldu?unu ve
        bu alt dizileri ekrana yazd?ran bir metod olu?turunuz.
        Not: yeni olu?acak elemanlar, ilk diziden se?ilirken arka arkaya s?ral? gelmeli.
        ?rnek :
        Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold(esik) = 4
        Output: 3
    */
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 5, 5, 5, 8};
        int k = 3;
        int threshold = 4;
        System.out.println(numOfSubArrays(arr, k, threshold));
    }

    public static int numOfSubArrays(int[] arr, int k, int threshold) {
        int[] arr2 = new int[k];
        int sum = 0;
        int count = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            System.arraycopy(arr, i, arr2, 0, k);
            for (int j = 0; j < k; j++) {
                sum += arr2[j];
            }
            if (sum / k >= threshold) {
                count++;
                System.out.println(Arrays.toString(arr2));
            }
            sum = 0;
        }
        return count;
    }
}


