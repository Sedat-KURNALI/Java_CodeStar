package Tekrarlar.Repeat01;

import java.util.Arrays;

public class Soru05 {

    /*   5.SORU :
       Verilen bir integer dizisinde, i?indeki s?f?rlar?n hepsini dizinin en sonuna ta??yan ve
       di?er de?erlerinde s?ralamas?n? bozmdan olu?an diziyi ekrana bast?ran bir metod olu?turunuz
       ?rnek :
       Input: nums = [0,1,0,3,12]
       Output: [1,3,12,0,0]
    */
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 0, 3, 0, 0, 12};

        System.out.println("1. Yontem ikinci bir Array ile ");
        System.out.println(Arrays.toString(sifirlariArraydaOtele1(nums)));

        System.out.println("2. Yontem tek bir Array ile ");
        System.out.println(Arrays.toString(sifirlariArraydaOtele2(nums)));

    }

    public static int[] sifirlariArraydaOtele1(int[] nums) {
        int[] yedek = new int[nums.length];
        int sayac = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                yedek[sayac] = nums[i];
                sayac++;
            }
        }
        return yedek;
    }

    public static int[] sifirlariArraydaOtele2(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == 0) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
            }
        }
        return nums;
    }
}
