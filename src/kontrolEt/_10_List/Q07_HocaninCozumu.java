package _10_List;

public class Q07_HocaninCozumu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {1,2,3,4,7,4,3,2,1};
      boolean simetrik=false;
      for (int i = 0; i < arr.length/2; i++) {
	   if (arr[i]==arr[arr.length-1-i]) {
		     simetrik=true;	
		  
	 }
	   else {
		simetrik=false;
		break;
	 }
    }System.out.println(simetrik);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
