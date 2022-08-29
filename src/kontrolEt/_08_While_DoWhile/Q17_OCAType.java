package _08_While_DoWhile;

public class Q17_OCAType {

    /*
aşağıdaki kod bloğunun çıktısı ne olur?
 */
    public static void main(String[] args) {

        int i = 3;
        while (i < 6) {//3<6 asagida bir artar yukari devam eder 
            System.out.println(i);
            i += 1;// syso asagida olsaydi once artirir sonra yazdirir
            //o yuzden 4, 5, 6 olur sadece
            
        }

    }
}

// A) 3
//    4
//    5
//    6

// B) 3
//    4
//    5

// C) 1
//    2
//    3
//    4
//    5
