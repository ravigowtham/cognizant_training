

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of items");
		final int num=sc.nextInt();
		int [] items=new int[num];
		
		System.out.println("Enter the elements of an array");
		for(int i=0;i<items.length;i++)
			items[i]=sc.nextInt();
		Arrays.sort(items);
		System.out.println("Second smallest element in an array: "+getSecondSmallest(items));
		
		
	}
	public static int getSecondSmallest(int arr[])
	{
		int secondSmallest=0,firstSmallest=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=firstSmallest)
			{
				secondSmallest=arr[i];
				break;
			}
		}
		return secondSmallest;
	}

}
