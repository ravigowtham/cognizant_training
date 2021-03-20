
import java.util.*;

public class CalculateSum3or5 {

	public static void main(String[] args) {
		
		System.out.println("Enter the number to which the sum will be calculated:");
		int num;
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		System.out.println("Sum of first  N Natural numbers divisible by 3 or 5 are: " +calculateSum(num) );
		
	}
	
	
	private static int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0||i%5==0)
			{
				sum+=i;
			}
		}
		return sum;
	}

}
