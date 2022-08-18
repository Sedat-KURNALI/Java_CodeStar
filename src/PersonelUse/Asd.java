package PersonelUse;

import java.util.ArrayList;
import java.util.List;

public class Asd {
    public static void main(String[] args) {

        List<Kisi> liste = new ArrayList<Kisi>();

        liste.add(new Kisi("Sedat", "Kurnali", 127));
        liste.add(new Kisi("Osman", "Ali", 1999));
        System.out.println(liste.get(1));

    }
}
