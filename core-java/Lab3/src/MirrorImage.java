import java.util.*;
public class MirrorImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the string to print the mirror image");
		Scanner sc=new Scanner (System.in);
		String st=sc.next();
		System.out.println("Mirror image is:"+getImage(st));
	}
	
	private static String getImage(String pst)
	{
		StringBuffer sb=new StringBuffer(pst);
		return pst+"|"+sb.reverse();
	}

}
