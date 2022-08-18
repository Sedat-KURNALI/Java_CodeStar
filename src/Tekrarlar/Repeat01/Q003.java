package Tekrarlar.Repeat01;

import java.util.ArrayList;

public class Q003 {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ard???k array elemanlar?n toplam?n? hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        System.out.println(ardisikTopla(arr));
    }

    private static ArrayList<Integer> ardisikTopla(int[] arr) {
        ArrayList<Integer> toplananSayilarList = new ArrayList<>();

        int toplam = 0;
        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (sayac == arr.length) {
                    break;
                }
                toplam += arr[sayac];
                sayac++;
            }
            if (toplam != 0) toplananSayilarList.add(toplam);
            toplam = 0;
        }
        return toplananSayilarList;
    }
}