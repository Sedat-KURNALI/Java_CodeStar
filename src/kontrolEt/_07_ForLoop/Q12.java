package _07_ForLoop;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

    /*  Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */

        /* Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin 
         * ve girilen rakama gore 
        asagidaki sekli cizdirin
        *
        * *
        * * *
        * * * *
*/
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen pozitif bir rakam giriniz : ");
        int num=scan.nextInt();
        
        for (int i = 1; i <= num; i++) {
            
            for (int j = 1; j <= i; j++) {
                
                System.out.print("* ");
                
            }
            System.out.println("");
            scan.close();
        }
        
        
    }
}
