
public class ExpDemo1 {

	public static void main(String[] args) {
		
		System.out.println("----first line---");
		try {
			int a=10,b=0;
			int c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			
		}
		System.out.println("----last line-----");
	}

}
