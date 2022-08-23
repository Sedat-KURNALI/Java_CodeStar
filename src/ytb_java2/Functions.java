package ytb_java2;

public class Functions {

	public static void main(String[] args) {
		int top1 = 7;
		int top2 = 6;
		int donenCevap = toplama(top1,top2);
		System.out.println(donenCevap);
		System.out.println(merhaba("Dilruba"));
		System.out.println(yilBul(23));
		bye();
		bye();
		System.out.println(yilBul(34));
	}

	public static int toplama(int sayi1, int sayi2) {
		int cevap;
		cevap = sayi1 + sayi2;
		return cevap;
	}
	
	public static String merhaba(String ad) {
		return "Merhaba " + ad;
	}
	
	public static String yilBul(int yas) {
		int yil = 2021 - yas;
		yil--;
		return yil + " yýlýnda doðdunuz.";
	}
	
	public static void bye() {
		System.out.println("Görüþürüz.");
	}
}
