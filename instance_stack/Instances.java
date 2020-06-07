package instance_stack;

public class Instances {
	public static void main(String[]args) {

System.out.println("tanishq");
Practical o=new Practical();
	o.method3();
	o.method4();
    Practical.method1();
	Practical.method2();

}
	
}
class Practical{
	//instance variable
	 int num1=10;
	 int num2=20;
	//static variable 
	 static int num3=30;
	 static int num4=40;
	
	//static method
	public static void method1() {
		System.out.println(num3);
		
	}
	//static method
	public static int method2() {
		System.out.println(num4);
		return 0;
	}
	
	//instance method
	public void method3() {
	 System.out.println(num1);
		
		
	}
	//instance method
	public int method4() {
		System.out.println(num2);
	 return 0;
		
	}
	}