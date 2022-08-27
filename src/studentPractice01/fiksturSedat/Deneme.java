package studentPractice01.fiksturSedat;

import java.util.*;

public class Deneme {
    static Random random = new Random();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kac takimlik bir lig olsun : ");

        int takimSayisi = 12;

        List<Integer> sayi = new ArrayList<>();
        int tmp = 0;
        for (int i = 0; i < 5; i--) {
            tmp = random.nextInt(takimSayisi)+1;

            if(!sayi.contains(tmp)){
                sayi.add(tmp);
            }
            if (sayi.size() == takimSayisi) break;
        }
        System.out.println(sayi);
    }
}
