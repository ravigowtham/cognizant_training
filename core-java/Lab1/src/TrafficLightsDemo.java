
import java.util.*;

public class TrafficLightsDemo {

	public static void main(String[] args) {
		
		System.out.println("Select one of the three lights ");
		System.out.println("1.Red");
		System.out.println("2.Yellow");
		System.out.println("3.Green");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1 : System.out.println("Stop");
		 		break;
		 
		case 2 : System.out.println("Ready");
        		break;
        
		case 3 : System.out.println("Go");
				break;
		 
		}
	  }
		
	}


