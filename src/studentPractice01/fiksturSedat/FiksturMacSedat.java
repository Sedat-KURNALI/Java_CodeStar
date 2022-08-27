package studentPractice01.fiksturSedat;

import java.util.*;

public class FiksturMacSedat {
    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();
    static List<String> takimlar = new ArrayList<>();
    static List<Integer> takimaAtananSayi = new ArrayList<>();

    public static void main(String[] args) {
        takimDegerleriniAta();
        fiksturIcinIlkDegerAta();
        fiksturYazdir();
    }

    public static void fiksturYazdir() {
        System.out.println("Ligimizdeki Takimlarin Karsilasma Sýralari");
        System.out.println("1. YARI");
        for (int i = 0; i < takimlar.size() / 2; i++) {
            System.out.println(i + ". Hafta :");
            for (int j = 0; j < takimlar.size()/2; j++) {

            }
            System.out.printf("", i - 1, takimlar.get(i), takimlar.get(i + 1));
        }
        System.out.println("2. YARI");
        for (int i = 1; i <= takimlar.size() / 2; i++) {

        }
    }

    public static void fiksturIcinIlkDegerAta() {
        String[] siralama = new String[takimlar.size()];

        System.out.println("takimaAtananSayi = " + takimaAtananSayi);
        System.out.println("takimlar = " + takimlar);

        int num = 0;

        for (int i = 0; i < takimlar.size(); i++) {
            num = takimaAtananSayi.get(i);
            siralama[num - 1] = takimlar.get(i);
        }
        takimlar = List.of(siralama);
        System.out.println("takimlar = " + takimlar);
    }

    public static void takimDegerleriniAta() {
        System.out.print("Kac takimlik bir lig olsun : ");
        int takimSayisi = scan.nextInt();
        scan.nextLine();
        for (int i = 1; i <= takimSayisi; i++) {
            System.out.println(i + ". takimin adini yaziniz : ");
            takimlar.add(scan.nextLine());
        }
        if (takimSayisi % 2 == 1) takimlar.add("B_A_Y");
        takimSayisi = takimlar.size();
        int tmp = 0;
        for (int i = 0; i < 1; i--) {
            tmp = random.nextInt(takimSayisi) + 1;
            if (!takimaAtananSayi.contains(tmp)) {
                takimaAtananSayi.add(tmp);
            }
            if (takimaAtananSayi.size() == takimSayisi) break;
        }
    }

}
