package polymorphism;

//WHY DO WE HOLD THE OBJECT OF CHILD CLASS IN THE REFERENCE OF PARENT CLASS.

public class ChildObjectParentReference {

	public static void main(String[] args) {
		
		Parent1 obj2=new Child1();
		obj2.m1();					//here at compile time the compiler checks parent class method 
									//But at runtime child class method is created because object of child class is created.
		//obj2.m2();  //METHOD M2() IS UNDEFINED IN PARENT1
					//BECAUSE IT DOESNT EXISTS.
		
		 
		Child1 b=(Child1)obj2; //this is called type casting ..from parent type to child type but it is giving me an error so i need a variable to hold the value of type 
		
		b.m2(); 	

	}

}

class Parent1{
	
	void m1() {
		System.out.println("instance method m1 of parent class");
	}
	
}

class Child1 extends Parent1 {
	
	@Override
	void m1() {
		System.out.println("instance method m1 of child class");
	}
	
	void m2() {
		System.out.println("instance method m2 of child class");
	}
	
}