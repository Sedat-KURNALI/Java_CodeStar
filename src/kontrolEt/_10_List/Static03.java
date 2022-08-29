package _10_List;

public class Static03 {
	

	int num1 = 12;

	static int num2 = 22;	

	public static void main(String[] args) {

		Static03 obj = new Static03();

		obj.artirma();

		obj.artirma();

    }

     public void artirma() {

		num1++;

		System.out.println(num1);

	}

}
