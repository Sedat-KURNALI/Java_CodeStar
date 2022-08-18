package Tekrarlar.Repeat01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q002 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("tavsan");
        list.add("horoz");
        list.add("hindi");
        list.add("ordek");

        String str = "";

        String arr[] = list.toArray(new String[0]);

        System.out.println(arr.length); // 2
        str = arr[2];
        System.out.println(str);
        System.out.println(Arrays.toString(arr)); // [tavsan,horoz]

        Object arr2[] = list.toArray();
        System.out.println(arr2.length); // 2

        str = arr2[1].toString();

        System.out.println(str);
        System.out.println(Arrays.toString(arr2)); // [tavsan,horoz]


    }
}
