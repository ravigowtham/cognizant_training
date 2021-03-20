package overloading;

public class MyMath {

	void add(int num1,int num2)
	{
		System.out.println("------int num1,int num2------");
		System.out.println("addition is:"+(num1+num2));
	}
	
	void add(int num1,float num2)
	{
		System.out.println("------int num1,float num2------");
		System.out.println("addition is:"+(num1+num2));
	}
	
	void add(float num1,int num2)
	{
		System.out.println("------float num1,int num2------");
		System.out.println("addition is:"+(num1+num2));
	}
	
	void add(float num1,float num2)
	{
		System.out.println("------float num1,float num2------");
		System.out.println("addition is:"+(num1+num2));
	}
}
