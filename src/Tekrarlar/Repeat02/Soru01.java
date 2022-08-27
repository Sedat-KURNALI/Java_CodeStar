package Tekrarlar.Repeat02;

public class Soru01 {
    public static void main(String[] args) {
        String name = "JAVA COK GUZEL KARDESIM";
        System.out.println(name);
        System.out.println(reverse(name));
    }

    public static String reverse(String name) {
        String tmp = name;
        for (int i = 0; i < name.length() / 2; i++) {
            tmp = tmp.substring(0,i) +
                    tmp.substring(tmp.length() - 1 - i, tmp.length() - i) +
                    tmp.substring(i + 1, tmp.length() - 1 - i) +
                    tmp.substring(i, i + 1)+
                    tmp.substring( tmp.length()-i);
           //System.out.println(tmp);
        }
        return tmp;
    }
}
