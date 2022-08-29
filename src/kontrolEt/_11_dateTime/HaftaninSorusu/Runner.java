package _11_dateTime.HaftaninSorusu;



    import java.util.ArrayList;
	import java.util.Scanner;

	public class Runner {

	  public static void main(String[] args) {
	   @SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	  String islem;
	
	  
	  Resgistration userReg = new Resgistration();
	 ArrayList<User> register = null;
	boolean cikilsinMi = false;
	
	
	while (!cikilsinMi) {
	
		 System.out.println("lutfen \n " +
	     "Kisi eklemek icin-->1" +
	   "\n Kisi listelemek icin--2\n " +
	  "sansli kisi bulmak icin-->3\n " +
	 "cikis icin-->4");
	islem = scan.next();
	switch (islem) {
	case "1":
	register = (ArrayList<User>) userReg.register();
	break;
	case "2":
	                	
	userReg.listele(register);
	break;
	case "3":
	userReg.printHappyUsers(register);
	 break;
	  case "4":
	 cikilsinMi = true;
	 break;
	   default:
     System.out.println("hatali veri girdiniz");   
	 break;
	}	
	}      

	
	
}
}