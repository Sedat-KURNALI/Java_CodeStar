package _08_While_DoWhile;

public class Q08_OCAType {
    public static void main(String[] args) {
/*
aşağıdaki kod blogunun çıktısı ne olur?
 */
        int x = 3;
        int i = 0;
        while (i < 3) { //0<3 icin badiye gir    //1<3 
            x += 1;     //3 tu 4 oldu            // 4 tu 5 oldu
            i += 1;     // 0 di 1 oldu           // 1 di iki oldu
 //donguye geri dondu  // ikinci kere dondu 3<3 kirilana kadar girdi  
            }
        System.out.println("x = " + x);
        System.out.println("i = " + i);

    }


// A) x = 3
//    i = 0

// B) x = 6
//    i = 3

// C) x = 9
//    i = 0

}
