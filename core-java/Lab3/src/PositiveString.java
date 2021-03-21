import java.util.Scanner;

public class PositiveString {

	
	static boolean flag=true;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 System.out.println("Enter the string to check positive or not");
		 Scanner sc=new Scanner(System.in);
		 String st=sc.nextLine();
			
			
				
			
			if(checkPositive(st)==true)
			{
				System.out.println("Entered string is positive string");
			}
			if(checkPositive(st)==false)
			{
				System.out.println("Entered string is negative string");
			}

	}
	private static boolean checkPositive(String pst) {
		
		 int value1=(int)pst.charAt(0);

		for(int i=0;i<pst.length();i++) {
			
			int	value2=(int)pst.charAt(i);
			if(value2<value1)
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
	

	}

