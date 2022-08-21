package LambdaDenemelerim;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Deneme003 {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(2);
        sayilar.add(5);
        sayilar.add(8);
        sayilar.add(9);
        System.out.println(sayilar);


        List<Integer> ikiKat = new ArrayList<>();
        sayilar.forEach(p -> ikiKat.add(p * 2));

        System.out.println(ikiKat);

        List<Integer> lm = sayilar.stream().map(p -> p + 2).collect(Collectors.toList());
        System.out.println(lm);

        List<Integer> lf = sayilar.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
        System.out.println(lf);

        int a = sayilar.stream().reduce(0, (p, u) -> p + u);
        System.out.println(a);

    }
}
