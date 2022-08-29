package _07_ForLoop;

public class Q17 {

    public static void main(String[] args) {

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6       seklini konsola yazdiriniz.

        
        
    	 
         for (int satir = 0; 5>=satir; satir++) {
            for (int i = 1; i <= satir; i++) {
                System.out.printf(" ");
            }
            for (int sutun = satir+1; sutun<=6; sutun++) {
                System.out.print(sutun+" ");
            }System.out.println();
    	
    	
    	
    	}
    	
    	
    	
    	/*for (int satir1 = 1; satir1 <=6; satir1++) {
			System.out.print(satir1+" ");
	       
			
		}
    	System.out.println();
    	System.out.print(" "+"2 "+"3 "+"4 "+"5 "+"6");
    	System.out.println();
    	System.out.print("  "+"3 "+"4 "+"5 "+"6");
    	System.out.println();
    	System.out.print("   "+"4 "+"5 "+"6");
    	System.out.println();
    	System.out.print("    "+"5 "+"6");
    	System.out.println();
    	System.out.print("     "+"6");  */
    
}

}
