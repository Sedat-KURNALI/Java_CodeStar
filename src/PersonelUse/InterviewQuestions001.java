package PersonelUse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InterviewQuestions001 {
    public static void main(String[] args) {
        // Java'da ArrayList'ten tekrarlanan öğeleri kaldırmak için Java Programı yazınız.
        // input : [2, 2, 3, 5, 7, 7, 11]
        // list of primes without duplicates : [2, 3, 5, 7, 11]

        List<Integer> input = new ArrayList<>(Arrays.asList(2, 5, 2, 3, 5, 7, 5, 7, 11, 6, 2, 11, 11));
        System.out.println(input);
        Collections.sort(input);
        System.out.println("Siralanmis hali");
        System.out.println(input);
        int i = 0;
        do {
            if (input.get(i) == input.get(i + 1)) {
                input.remove(i);
                i--;
            }
            i++;
        } while (i < input.size() - 1);
        System.out.println(input);

        System.out.println("Siralamasiz Yontem");

        List<Integer> arLst = new ArrayList<>(Arrays.asList(2, 2, 5, 2, 3, 5, 7, 5, 7, 11, 6, 2, 11, 11));

        System.out.println(arLst);
        for (int j = 0; j < arLst.size(); j++) {
            for (int k = j + 1; k < arLst.size(); k++) {
                if (arLst.get(j) == arLst.get(k)) {
                    arLst.remove(k);
                    k--;
                }
            }
        }
        System.out.println(arLst);
        String str1 = "elma";
        String str2 = "elmas";
        List<String> harfler1 = new ArrayList<>(Arrays.asList(str1.split("")));
        List<String> harfler2 = new ArrayList<>(Arrays.asList(str2.split("")));
        Collections.sort(harfler1);
        Collections.sort(harfler2);
        if(str1.equals(str2)){
            System.out.println("kelimler esit");
        }else if(harfler1.equals(harfler2)){
            System.out.println("kelimler anagram");
        }else {
            System.out.println("kelimler anagram degil");
        }




        List<String> hayvan = new ArrayList<>();
        hayvan.add("yilan"); // [yilan]
        hayvan.add("aslan"); // [yilan]
        hayvan.add("kedi"); // [yilan, kedi]
        hayvan.add("tavsan"); // [yilan, kedi, tavsan]
        hayvan.add("Kedi"); // [yilan, kedi]
        System.out.println(hayvan);
        Collections.sort(hayvan);
        System.out.println(hayvan);
    }
}