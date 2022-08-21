package ytb_java3.accessmodifiers;

public class ErisimTest {

	public static void main(String[] args) {
		
		Test testObjesi = new Test();
		
		System.out.println("Erisebildigim degiskenler : " +
		testObjesi.duz + " " + testObjesi.herkese + " " + testObjesi.korumali);

		System.out.println("Gizli :" + testObjesi.getGizli());
	}

}
