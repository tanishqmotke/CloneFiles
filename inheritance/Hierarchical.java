package inheritance;

public class Hierarchical {

	public static void main(String[] args) {
		
    B1 ob=new B1();
	ob.m2();
	
	C1 obj= new C1();
	obj.m3();
	}

}

 class A1{
	
	void m1(){
		
		System.out.println("CLASS A");
	}
}

class B1 extends A1{
	
	void m2(){
		m1();
		System.out.println("ClASS B extends CLASS A");
	}
}

class C1 extends A1{
	
	void m3(){
		m1();
		System.out.println("CLASS C extends CLASS A");
	}
}