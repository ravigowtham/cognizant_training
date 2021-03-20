package inheritance;

public class Animal {
 private String name;
 public Animal(String name) {
	 this.name=name;
	 
 }
 public String getName() {
	 return name;
 }
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
       void eat() {
    	   System.out.println(getName()+" is eating");
       }
       void run() {
    	   System.out.println(getName()+" is running");
       }
	}


