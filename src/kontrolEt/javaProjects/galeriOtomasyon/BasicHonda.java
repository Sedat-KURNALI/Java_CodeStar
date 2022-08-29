
package javaProjects.galeriOtomasyon;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
Bir class olusturunuz adi Honda olsun
icerisinde 3 instance variable olsun 
protected String make = "Honda";
protected String model = "Accord";
protected int year = 2012;
Sonra 3 tane String return tipinden method olusturunuz
arabaMarkasi
arabaModeli
arabaYili
Son olarak bir oject olusturup method lari main method da print ediniz 
*/
public class BasicHonda extends Araba implements DisAraba, IcAraba {
    protected String marka = "Honda";
    protected String model = "Accord";
    protected int year = 2012;
    static Map<Integer, String> hondaMap = new HashMap<>();
    //static IcAraba(Integer) icarabalist=new BasicHonda<>();
    static Scanner scan = new Scanner(System.in);
    static BasicHonda ozellikler=new BasicHonda();
    static int aracSecim=0;
    public BasicHonda() {
    }
    public static void main(String[] args) {
        aracMenu();
    }
    private static void aracMenu() {
        
        hondaMap.put(100, "Honda, Civic,Beyaz,Benzinli,2000\n");
        hondaMap.put(101, "Honda, CR-V, Siyah,Benzinli,2600\n");
        hondaMap.put(102, "Honda, Jazz,Kirmizi,Diesel,2800\n");
        hondaMap.put(103, "Honda, Accord,Fume, Diesel,2200\n");
        hondaMap.computeIfAbsent(104, v->"tofas, sahin, lpg,1600\n" );//olmadigi icin ekliyor
        hondaMap.computeIfAbsent(105, v->"renault, broadway,mavi,dizel,1200\n" );//olmadigi icin ekliyor
        hondaMap.computeIfAbsent(106, v->"renault, flash,buzmavisi,dizel,1800\n" );//olmadigi icin ekliyor
        if (hondaMap.containsKey(aracSecim)) {
            hondaMap.remove(aracSecim);             
        }
        
        
        System.out.println("agam galeriye hosgeldin hangi arabayi almak istersin \n"
                + "1-==> arac Listesi\n2--->arac sil\n3-->satin alma" + "\n4-->cikis");
        int secim = scan.nextInt();
        switch (secim) {
        case 1:
            Listeleme();
            break;
        case 2:
         aracSilme();
            break;
        case 3:
        satinAlma();
            break;      
        case 4:
            cikis();
            break;
        default:
            System.out.println("Yanlis Secim Yaptiniz Tekrar Deneyiniz");
            aracMenu();
            break;
        }
    }
    private static void cikis() {
        System.out.println("yine bekleriz agam... ");
        
    }
    private static void satinAlma() {
       // System.out.println("basichonda satin alma calisti "+hondaMap);
        System.out.println("hangi araci almak istiyorsun 100-103 arasi sec");
        aracSecim=scan.nextInt();
        switch (aracSecim) {
        case 100:
            System.out.println("sectigin arac : " + hondaMap.get(aracSecim));
            break;
        case 101:
            System.out.println("sectigin arac : " + hondaMap.get(aracSecim));
            break;
        case 102:
            System.out.println("sectigin arac : " + hondaMap.get(aracSecim));
            break;
        case 103:
            System.out.println("sectigin arac : " + hondaMap.get(aracSecim));
            break;
        default:
            System.out.println("agam o arac bizde yok");
            break;          
        }
        
        ozellikler.direksiyon();
        
    }
    public static void aracSilme() {
        System.out.println("silinen aractan sonra listemiz :  "+hondaMap);
      
        System.out.println("yine bekleriz agam devamsa 1 tamamsa 2 ye bas");
        int devamMi=scan.nextInt();
        while (devamMi!=1 && devamMi!=2) {
            System.out.println("agam bir veya iki sec");
            devamMi=scan.nextInt();
        }
        switch (devamMi) {
        case 1:
            aracMenu();
            break;
case 2:
            cikis();
            break;
        default:
            System.out.println("agam 1 veya 2 sec");
            break;
        }
        
    }
    public static void Listeleme() {
     
        System.out.println("arac listemiz :  "+hondaMap);
        aracMenu();
        
        
    }
    @Override
    public void direksiyon() {//bu method icaraba'da idi buraya otomatik olusturuldu
        System.out.println("icaraba en babaysa ben basichonda cocugum ve override ederim");
System.out.println("basichonda direksiyonumuz fonksiyoneldir");
ozellikler.koltuk();
    }
    @Override
    public void koltuk() {//bu method icaraba'da idi buraya otomatik olusturuldu
        System.out.println("basichonda koltuklari deri kaplamalidir");
        ozellikler.klima();
    }
    @Override
    public void klima() {
        System.out.println("basichonda'da klima manuel'dir");
ozellikler.kapi();
    }
    @Override
    public void kapi() {
        System.out.println("basichonda'larimiz 5 kapilidir");
        ozellikler.move();
    }
    @Override
    public void move() {
        System.out.println("basichonda spor modu yoktur");
odeme();
    }
    public static void odeme() {
        System.out.println("agam odemeye hosgeldin odeyecegin fiyat : "+DisAraba.price);
        aracSilme();
        
        
    }
}





