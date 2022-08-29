package kontrolEt._13_stringBuilder;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
		/*
		Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I 
	        It is not a palindrome"

		 */
    	
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Bir metintos giriniz : ");
    	String metin=scan.nextLine();
    	StringBuilder sb=new StringBuilder(metin );// scan.nextLine() da yazabilirdik metnin yerine
    	//sb.append(metin); de diyebilirdirk.
    	
    	String tersMetintos=sb.reverse().toString();  // burada metincoin var metin zinciri demek
    	
    	if (tersMetintos.equalsIgnoreCase(metin)) {
			System.out.println(tersMetintos + " girilen  metin palindrome ifadedir");
		}else {
			System.out.println(tersMetintos + " girilen  metin palindrome ifade degilkine");
		}

    }

}
