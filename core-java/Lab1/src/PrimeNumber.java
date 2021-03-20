
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the number you need prime numbers");
		Scanner sc= new Scanner(System.in);
		int number= sc.nextInt();
		
		for(int i=2;i<=number;i++)
		{
			int count=0;
			for(int c=2;c<=i/2;c++)
			{
				if(i%c==0)
				{
					count++;
				}
									
			}
			if(count==0)
			{
				System.out.print(i+" ");
			}
		}
		
	}

}
