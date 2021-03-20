
import java.util.*;

public class SpecificValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of items:");
	    final int num=sc.nextInt();
		
		//to take user input of elements of array
		System.out.print("Enter the elements of array(seperated by space)");
		int [] arr=new int[num];
		for(int in=0;in<arr.length;in++) {
			arr[in]=sc.nextInt();
		}
		
		 System.out.print("Enter the value to be checked:");
	      int valueToCheck=sc.nextInt();
	      
	      for(int i = 0; i<arr.length; i++){
		         if(valueToCheck == arr[i]){
		            System.out.println("Array contains the given element");
		         }
		         else
		        	 System.out.println("Array do not contains the given element");
	      }
		
	}

}
