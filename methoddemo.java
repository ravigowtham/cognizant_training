class methoddemo{
public static void show(){
System.out.println("Show Method");
}
public static int add(int num1,int num2){
//System.out.println("Show Method");
return num1+num2;
}

public static void main(String[]args){
//System.out.println("hello from java");
show();
show();
show();
int result=add(10,20);
System.out.println("Addition is "+ result);
}
}