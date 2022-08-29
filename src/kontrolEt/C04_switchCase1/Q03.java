package kontrolEt.C04_switchCase1;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

// Girilen bir ay numarasina gore , ayin kac gun oldugunu sayi ile yazdiriniz

       Scanner scan=new Scanner(System.in);
       System.out.println("Gununu ogrenmek istediginiz ay numarasini giriniz : ");
    	int ayNo=scan.nextInt();
    	
    	switch (ayNo) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Girdiginiz ay 31 cekiyor");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
		
			System.out.println("Girdiginiz ay 30 cekiyor");
			break;
		case 2:
			System.out.println("Yili giriniz: ");
		int yil=scan.nextInt();
		if (yil%4==0) {
			System.out.println("Subat ayi 28 ceker");
		} else {
            System.out.println("Girdiginiz ay 29 gun ceker");
		}
		System.out.println("Girdiginiz ay 31 cekiyor");
			break;

		default:
			System.out.println("Gecerli bir ayNo giriniz!");
			break;
		}
    	
    	
    	
    	
    	
    	
    }
}

