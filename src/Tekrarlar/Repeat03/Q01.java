package Tekrarlar.Repeat03;

public class Q01 {
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("One Two Three Four Five");

        System.out.println(sb.indexOf("Two"));
        System.out.println(sb.reverse().indexOf("Two"));
    }
}
