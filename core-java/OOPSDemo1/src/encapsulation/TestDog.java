package encapsulation;

public class TestDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog1=null;//Reference Creation
		dog1=new Dog();//Object Creation
		/*dog1.name="tommy";
		dog1.age=5;
		dog1.eat();
		dog1.run();*/
		dog1.setName("tommy");
		dog1.setAge(0);
		dog1.eat();
		dog1.run();
		
		/*Dog dog2=null;//Reference Creation
		dog2=new Dog();//Object Creation
		dog2.name="tinku";
		dog2.age=10;1
		dog2.eat();
		dog2.run();*/
	}

}
