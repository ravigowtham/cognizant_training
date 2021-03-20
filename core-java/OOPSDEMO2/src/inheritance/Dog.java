package inheritance;

public class Dog extends Animal{
	public Dog (String name) {
		super(name);
	}
	void bark() {
		System.out.println(getName()+" is barking");
	}

}
