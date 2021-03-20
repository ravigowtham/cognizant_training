
import java.applet.*;
import java.util.Scanner;

public class IncreasingNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		if(checkNumber(num)==true)
		
		    System.out.println("Entered number is an increasing number");
		else
			System.out.println("Entered number is not an increasing number");

				
		
	}
	private static boolean checkNumber(int n) {
		
		boolean number=false;
		while(n>0)
		{
			int lastDigit=n%10;
			n=n/10;
		if(lastDigit>=n%10)
			number=true;
		else
		{
			number=false;
		break;
		}
		}
		return number;
		
	
	}
	

}
