package _10_List;


	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
	import java.util.Scanner;
	public class Market {
	    static ArrayList<String> gunler = new ArrayList<String>(
	            Arrays.asList("Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"));
	    static ArrayList<Integer> gunlukKazanclar = new ArrayList<>();
	    static ArrayList<String> ortamaninUstuKarliGunler = new ArrayList<>();
	    static ArrayList<String> ortamaninAltiKarliGunler = new ArrayList<>();
	    static int toplamKazanc = 0;
	    static int haftalikOrtalamaKazanc = 0;
	    public static void main(String[] args) {
	        /*
	         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.++
	         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.++
	         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.++
	         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.++
	         *
	         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
	         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
	         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
	         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
	         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
	         *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
	         *           ortalama kazançtan yüksekse o günleri return yap.
	         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
	         *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
	         *           ortalama kazançtan aşağıysa o günleri return yap.
	         */
	        Scanner scan = new Scanner(System.in);
	        
	        for (int i = 0; i < gunler.size(); i++) {
	            System.out.println(gunler.get(i)+" günki kazancinizi giriniz.");
	            int kazanc = scan.nextInt();
	            gunlukKazanclar.add(kazanc);
	            toplamKazanc+=kazanc;
	        }
	        
	        System.out.println("Menü");
	        System.out.println("1-) ortalama kazanc");
	        System.out.println("2-) ortalamanin üstünde karlı günler");
	        System.out.println("3-) ortalamanin altinda karlı günler");
	        System.out.println("Seçiminizi yapınız.");
	        int secim = scan.nextInt();
	        
	        
	        switch (secim) {
	        case 1:
	            haftalikOrtalamaKazanc();
	            break;
	        case 2:
	            ortalamaninUstundeSatisOlanGunler();
	            break;
	        case 3:
	            ortalamaninAltindaSatisOlanGunler();
	            break;
	        default:
	            System.out.println("Yanlış değer giriniz.");
	            break;
	        }
	        
	    }
	    private static void ortalamaninAltindaSatisOlanGunler() {
	        for (int i = 0; i < gunlukKazanclar.size(); i++) {
	            if (gunlukKazanclar.get(i) < toplamKazanc / gunler.size()) {
	                ortamaninAltiKarliGunler.add(gunler.get(i));
	            }
	        }
	        System.out.println(" Ortalamanin altında karli olduğunuz günler -->" + ortamaninAltiKarliGunler);
	    }
	    private static void ortalamaninUstundeSatisOlanGunler() {
	        for (int i = 0; i < gunlukKazanclar.size(); i++) {
	            if (gunlukKazanclar.get(i) > toplamKazanc / gunler.size()) {
	                ortamaninUstuKarliGunler.add(gunler.get(i));
	            }
	        }
	        System.out.println(" Ortalamanin üstü karli olduğunuz günler -->" + ortamaninUstuKarliGunler);
	    }
	    private static void haftalikOrtalamaKazanc() {
	        haftalikOrtalamaKazanc = toplamKazanc / gunler.size();
	        System.out.println("Haftalık ortalama kazancınız --> " + haftalikOrtalamaKazanc);
	    }
	}


