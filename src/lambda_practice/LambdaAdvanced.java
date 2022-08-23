package lambda_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LambdaAdvanced {
    //multi arrayleri cevirirken flapMap kullaniriz yapilis sekli iki turludur
//1) lamda kullanarak
// Arrays.stream(arr).flatMap(t->Arrays.stream(t))
//2) method ile
// Arrays.stream(arr).flatMap(Arrays::stream)
// BU SEKLIDE ARTIK TUM STREAM METHODLARI KULLANILABILIR

    public static void main(String[] args) {
         /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm
        elemanlarý bir
        listeye kopyalayan ve harf sýrasýna göre yazdýran bir METHOD yazýnýz.
        Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
         */
        String[][] arr = {{"Ali", "Veli", "Ayse"}, {"Hasan", "Can"}, {"Suzan"}};




        /* TASK :
   Bir integer list oluþturunuz ve bu list’deki tum sayýlarýn karesinin
   toplamýný bulan code create ediniz.
    */
        List<Integer> numbers = new ArrayList<>(Arrays.asList(9, 4));

        System.out.println(numbers.stream().map(t -> t * t).reduce(0, (y, g) -> y + g));

        System.out.println(numbers.stream().mapToInt(t -> t * t).sum());


    }


}



