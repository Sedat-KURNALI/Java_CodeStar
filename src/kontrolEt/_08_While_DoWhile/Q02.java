package _08_While_DoWhile;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// indexi tek sayi olan karakterleri yazdiran bir code create ediniz
		
		
	@SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);
	System.out.println("E bir cumle giresen: ");
	String cumle=scan.nextLine();
	int index=0;
		do {
			if (index%2==1) {
				System.out.print(cumle.charAt(index)+" ");
			}
			index++;
		} while (index<cumle.length());
		
	
		
		
		
		
		
		
		

	}

}
