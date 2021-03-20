import java.util.Scanner;
public class DuplicateValues {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		//to take user input of length of an array
		System.out.print("Enter the number of items:");
	    final int num=sc.nextInt();
		
		//to take user input of elements of array
		System.out.print("Enter the elements of array(seperated by space)");
		int [] arr=new int[num];
		for(int in=0;in<arr.length;in++) {
			arr[in]=sc.nextInt();
		
	}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==(arr[j]))
				{
					System.out.println("Duplicate products are :" +arr[i]);
				}
			}
		}

	}
}
