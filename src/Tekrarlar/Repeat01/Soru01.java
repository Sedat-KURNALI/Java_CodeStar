package Tekrarlar.Repeat01;

import java.util.Arrays;

public class Soru01 {
    /*

    Integer olarak artan de?erler ?eklinde verilen dizinin elemanlar?n?n
    karesini al?p yine artan
    de?erlerde ekrana yazd?ran metod olu?turunuz

    ?rnek :

    Input: nums = [-4,-1,0,3,10]
    Output: [0,1,9,16,100]

     */
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] nums2 = Arrays.stream(nums).map(x -> x * x).sorted().toArray();
        nums = sortedArray(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));
    }

    private static int[] sortedArray(int[] num) {
        for (int i = 0; i < num.length; i++) {
            num[i] = num[i] * num[i];
        }
        Arrays.sort(num);
        return num;

    }

}
