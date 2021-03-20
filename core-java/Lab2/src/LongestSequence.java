import java.util.*;

public class LongestSequence {

	public static void main(String[] args) {
		
		System.out.println("Enter number of Elements u want to Enter into an array");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		
		System.out.println("Enter input values into array");
		
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		String str="";
		int count=0;
		
		//long consecutive sequence length
		for(int i=0;i<arr.length-1;i++) //count=0
		{
			if(arr[i]+1==arr[i+1])
			{
				count++;
			}
			else
			{
				if(count>0)
				{
				str+=Integer.toString(count+1); 
				count=0;
				}
				count=0;
				
			}
				
		}
		//if(count>0)
			//str+=Integer.toString(count+1); 
		char max=str.charAt(0);
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)>max)
				max=str.charAt(i);
		}
		System.out.println("length of longest consecutive elements sequence is : ");
		System.out.println(max);
	}

}
