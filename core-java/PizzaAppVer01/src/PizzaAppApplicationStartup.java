import javax.swing.JOptionPane;

public class PizzaAppApplicationStartup {
	private static String pizzaName;
	private static String  size;
	private static String crust;
	private static int  price;
	private static String toppings;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pizName = JOptionPane.showInputDialog("Choose Pizza Name : [Veg Extravaganza, FarmHouse ]");
		String pizSize = JOptionPane.showInputDialog("Choose pizza Size [Medium, Regular]");
		String pizCrust = JOptionPane.showInputDialog("Choose pizza Crust [New Hannd Tosted]");

		orderPizza(pizName,pizSize, pizCrust);
		displayPizzaOrder();
		}
	
	private static void orderPizza(String pName,String pSize,String pCrust) {
		
		pizzaName =  pName;
		size = pSize;
		crust = pCrust;
		
		if(pizzaName.equals(PizzaConstants.VEG_EXTRAVAGANZA_PIZZA) 
				&& pSize.equals(PizzaConstants.SIZE_MEDIUM) 
				&& pCrust.equals(PizzaConstants.CRUST_NEW_HAND_TOASTED)) {
			price=PizzaConstants.PRICE_VEG_EXTRAVAGANZA;
			toppings=PizzaConstants.TOPPINGS_VEG_EXTRAVAGANZA;
		}
		
		if(pizzaName.equals(PizzaConstants.FARMHOUSE_PIZZA) 
				&& pSize.equals(PizzaConstants.SIZE_REGULARE) 
				&& pCrust.equals(PizzaConstants.CRUST_NEW_HAND_TOASTED)) {
			price=PizzaConstants.PRICE_FARMHOUSE;
			toppings=PizzaConstants.TOPPING_FARMHOUSE;
	}
	}
		
		
	private static void displayPizzaOrder() {
		System.out.println("----Pizza Details---");
		System.out.println("Pizza Name:"+pizzaName);
		System.out.println("Size:"+size);
		System.out.println("Crust:"+crust);
		System.out.println("Price:"+price);
		System.out.println("Toppings:"+toppings);
		

	}

}
