package inheritance;

public class SingleInheritance {
	
	

	public static void main(String[] args) {
	
   C obj=new C();
   obj.method3();
		
	}

}

class A {
	
	void method1() {
		
		System.out.println("Class A");
	}
}

class B extends A{
	
	void method2() {
		method1();
		System.out.println("Class B ");
	}
}

class C extends B{
	void method3() {
		method2();
		System.out.println("Class C");
	}
}