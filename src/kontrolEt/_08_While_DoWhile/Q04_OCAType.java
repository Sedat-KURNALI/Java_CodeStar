package _08_While_DoWhile;

public class Q04_OCAType {
    public static void main(String[] args) {

        int num = 10;
        do {                 //10  bosluk   9
            System.out.print(num-- + " " + num);
        } while (num == 0);  // buraya geldi false old gordu kod kirildi
        /*                    sadece yukaridaki ilk i yazdirdi
         * // What is the result?
         * A) 9876543210
         * B) 9
         * C) 421
         * D) 9 10
         * E) Nothing is printed
         * F) 10 9
         */
        
        
    }



}
