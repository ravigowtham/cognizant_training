
import java.util.*;

public class CalculateTheDifference {

	public static void main(String[] args) {
		
		System.out.println("Enter the natural number to calculate difference:");
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		System.out.println("Difference between sum of squares and squares of the sum is:"+calculateDifference(num));
		
	}
	private static int calculateDifference(int n) {
		
		int sum=0,diff=0,squareOfSum=0,sumOfSquares=0;
				
		for(int i=1;i<=n;i++)
		{
			
			sumOfSquares += i*i;
			sum+=i;
            
            System.out.println("sum"+sum);
    		System.out.println("sum"+sumOfSquares);
                        
		}
		

		squareOfSum = sum*sum;
        diff = squareOfSum-sumOfSquares;
        
		return diff;
		
	}

}
