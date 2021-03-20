

import java.util.*;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		System.out.println("Enter the nth number");
		Scanner sc = new Scanner(System.in);
		int number= sc.nextInt();
		 series(number);
		//System.out.println("Fibonacci series :"+fib);
	}
	
	private static void series(int num) {
		int fib1=1,fib2=1;
		System.out.print(fib1+" ");
		System.out.print(fib2+" ");

		for(int i=0;i<=num-3;i++)
		{
			int fib3=fib1+fib2;
			System.out.print(fib3+" ");
			fib1=fib2;
			fib2=fib3;
		}
	}
}
