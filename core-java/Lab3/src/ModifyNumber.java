import java.util.*;
import java.lang.Math;
public class ModifyNumber {
	static String lastDigit;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number1=sc.nextInt();
		System.out.println("The modified number is "+modifyNumber(number1) +lastDigit);
	}
    private static int modifyNumber(int n)
    {
    	String str=Integer.toString(n);
    	int output=0;
	lastDigit = Integer.toString(n%10);    
	    
    	for(int i=0;i<str.length()-1;i++)
    	{
    		int diff=str.charAt(i)-str.charAt(i+1);
    		output=output*10+Math.abs(diff);
	}
    	return output;
		
	}

}
