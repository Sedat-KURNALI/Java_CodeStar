package _encapsulation;

public class AnaClass {
    public static void main(String[] args) {
        Kapsulleme k1 = new Kapsulleme();//nesnemizi oluþturduk.

        k1.setArac_marka("seat");//bilgilerimizi doldurduk.
        k1.setModel("leon");
        k1.setArac_yas(3);

        System.out.println("Arac markasi = " + k1.getArac_marka());
        System.out.println("Arac modeli = " + k1.getModel());
        System.out.println("Arac yasi = " + k1.getArac_yas());

    }
}
