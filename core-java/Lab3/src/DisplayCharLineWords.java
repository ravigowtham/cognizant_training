
import java.util.*;


public class DisplayCharLineWords {

		
		 public static void main(String[] args)
			{
			 
			 System.out.println("Enter the sentences");
			 Scanner sc=new Scanner(System.in);
			 String st=sc.nextLine();
				
			 int ch=0,words=0,lines=0;
				
				for(int i=0;i<st.length();i++) {
					
					if(st.charAt(i)=='.') {
						lines++;
					}
					if (st.charAt(i) ==' ') {
						words++;
					}
					if (st.charAt(i)!=' ') {
						ch++;
					}
				}
				System.out.println(st.length());
				 System.out.println("Number of lines : "+lines);
		         System.out.println("Number of words : "+words);
		         System.out.println("Number of characters : "+ch);
			}   
	}


