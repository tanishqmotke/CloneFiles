package inner.Class;


public class InnerClass2{
	
	public static void main(String []args) {
		
	Test1 test1=new Test1();
	Test1.Test2 test2=test1.new Test2();
	test2.method();
	test1.method1();
		
	}
	
	
}

class Test1{
	
	int a=10;
	public void method1() {
		System.out.println(a);
	}
	
	class Test2{
	
		
	int b=20;
	public void method() {
		
	System.out.println(b);	
	}
	}
}