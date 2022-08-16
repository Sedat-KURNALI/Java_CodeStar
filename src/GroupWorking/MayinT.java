package GroupWorking;

import java.util.Arrays;
import java.util.Random;

public class MayinT {

    public static void main(String[] args) {
        Random random = new Random();
        int mine[][] = new int[9][9];
        // System.out.println(Arrays.deepToString(mine));
        int yer = 0;
        for (int i = 0; i < 28; i++) {
            yer = random.nextInt(81);
            if (yer != 0) {

                if ((yer / 9) < 9 && (yer % 9) < 9) mine[yer / 9][yer % 9] = 1;

            } else mine[0][0] = 1;
        }
        System.out.println();

        System.out.println("    1  2  3  4  5  6  7  8  9");
        int i = 1;
        for (int[] arr : mine) {
            System.out.print(i + "\t");
            ++i;
            //    System.out.println(Arrays.toString(arr));
            for (int sayi : arr) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int[] arr : mine) {
            //    System.out.println(Arrays.toString(arr));
            for (int sayi : arr) {
                System.out.print(sayi + "  ");
            }
            System.out.println();
        }
    }


}
