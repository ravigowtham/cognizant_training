
import java.util.*;


public class PowerOfTwo {

	public static void main(String[] args) {
		
		System.out.println("Enter the number to check power of 2 or not");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(checkNumber(num)==true)
		{
			System.out.println("Entered number is power of 2");
		}
		else
		{
			System.out.println("Entered number is not a power of 2");

		}
		
	}
	private static boolean checkNumber(int n) {
		
		return (n>0)&& ((n & (n-1))==0);
		
	}

}
