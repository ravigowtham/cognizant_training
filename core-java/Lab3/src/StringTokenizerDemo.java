
import java.util.*;
import java.util.StringTokenizer;
public class StringTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the line of integers seperated with ,");
		String delim=",";
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		StringTokenizer st=new StringTokenizer(input,delim);
		
		int sum=0;
		while(st.hasMoreTokens())
		{
			int num=0;
			num=Integer.parseInt(st.nextToken());
			System.out.println("Number is"+num);
			sum+=num;
			
		}
		
		System.out.println("Sum is"+sum);
		

	}

}
