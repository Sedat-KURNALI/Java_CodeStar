package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QFibonacci {
     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Lutfen fibonaccisine kadar gidilmek uzere sinir degeri giriniz : ");
    	
        if (scan.hasNextInt()) {
			int sinir =scan.nextInt();
    	
    	List<Integer>fibonacci=new ArrayList<>();
    	
    	fibonacci.add(1);
    	fibonacci.add(1);
    	
    	int sayi=0;
    	
    	while(sayi<sinir) {
    		sayi=fibonacci.get(fibonacci.size()-2)+fibonacci.get(fibonacci.size()-1);
    		fibonacci.add(sayi);
    		
    	}
    	
    	System.out.println(fibonacci); 
    	
    	
    	fibonacci.remove(fibonacci.size()-1);
    	System.out.println(fibonacci); 
    	
		} else {
      System.out.println("Hatali giris");
		}
    }
}
