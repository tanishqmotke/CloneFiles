package superKeyword;

public class ParentClassMethod {
	
	public static void method1() {
		
		System.out.println("parent class method");
	}

	public static void main(String[] args) {
	
		new Child1().method2();

	}

}

class Child1 extends ParentClassMethod {
	
	public void method2() {
		System.out.println("child class method");
		
		
		super.method1();
	}
	
	
	
	
}