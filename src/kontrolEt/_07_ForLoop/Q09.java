package _07_ForLoop;

public class Q09 {

    public static void main(String[] args) {
        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10
        // Yuaridaki carpim tablosunu 10 a kadar ekrana yazdiriniz.


       for (int satir = 1; satir <= 10 ; satir++) {
		for (int sutun = 1; sutun <=satir; ) {
			System.out.print(sutun+"x"+satir+" = "+ (sutun*satir));
			break;
		}
		System.out.println();
	}

    }
}
