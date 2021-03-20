package encapsulation;

public class Dog {
 private String name;
 private int age;
  public void setName(String name)
  {
	  this.name=name;
  }
 
  public void setAge(int age)
  {
	  if(age<1)
	  {
		  throw new RunTimeException(" Negative age is not allowed");
	  }
	  this.age=age;
  }
 
 
 
 void eat() {
	 System.out.println(name+" is eating :"+age);
 }
 void run() {
	 System.out.println(name+" is running :"+age);

 }
}
