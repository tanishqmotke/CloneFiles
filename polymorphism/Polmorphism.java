package polymorphism;

//IF THE CLASS IS FINAL THEN THE METHOD CANT BE OVERRIDE.
//EVEN IF THE CLASS IS FINAL THE VARIABLE INSIDE THE CLASS ARE NOT FINAL.


public class Polmorphism {

	public static void main(String[] args) {
		
		Parent obj=new Parent();
		obj.method1();
		obj.method2();
		
		
		Parent obj1=new Child();  // PARENT CLASS IS USED TO REFER/STORE.
		int i=obj1.i;
		System.out.println(i);
		
	}

}

 class Parent {
	
	 int i=10; //final int i=10 ; this makes the int constant 
	 //int j=30;
	
	void method1() {
		
		i++;
		System.out.println(i);
		System.out.println("PARENT CLASS METHOD");
		
	}
	
	static void method2() {
		System.out.println("STATIC METHOD IN PARENT");
		
	}
}

class Child extends Parent {
	int j=20;
	
	void method1() {
		
		System.out.println("CHILD CLASS METHOD");	
		
	}
	
	static void method2() {
		
		System.out.println("STATIC METHOD IN CHILD");
	}
		
		
	}
	
	


