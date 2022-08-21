package LambdaDenemelerim;

@FunctionalInterface
interface Lmd {
    int topla(int a, int b);
}
public class Deneme002 {
    public static void main(String[] args) {
        Lmd l = (a,b)->a+b;
        System.out.println(l.topla(6,23));
    }
}