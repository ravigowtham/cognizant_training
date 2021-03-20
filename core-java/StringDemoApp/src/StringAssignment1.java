
public class StringAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello My Dear Friends";
		String result="";
		int i,n=0;
		i=str.length();
		char d;
		int []a= new int[i];
		for( i=0;i<str.length();i++)
		{
		    d=str.charAt(i);
			
				if(d==' ')
				{
				System.out.println("index"+i);
					a[n]=i;
					n+=1;

				}
				
			
		}
		for(int k=n,j=n-1;;k--)
		{
			result=str.chatAt();
		}
		
	}

}
