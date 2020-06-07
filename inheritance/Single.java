package inheritance;

class Demo1{  //If i add final keyword no child class can be created using this as parent class.
	
	
	static {
		
		System.out.println("static block of parent class");
	}
	Demo1(){
		
		System.out.println("CONSTRUCTOR OF PARENT");
		
	}
{
		
		System.out.println("instance block of parent");
	
	}
	public void method1() {
		
		System.out.println("method 1 of parent class");
	}
	public static void method2() {
		
		System.out.println("method 2");
	}
}


class Demo2 extends Demo1 {
	static {
		
		System.out.println("static block of child class");
	}
	
	Demo2(){
		
		System.out.println("CONSTRUCTOR OF CHILD");
		
	}
{	
		
		System.out.println("instance block of child");
	}
	
	public void method1() {
	
		super.method1();
    
	}
	public static void method2() {
		System.out.println("method 2 of child class");
	
	}	
}

//THIS IS SINGLE INHERITANCE WHERE EXTEND KEYWORD IS USED .
public class Single{
	
	public static void main(String args[] ) {
	
	
		new Demo2();
		
		
		
		
		
		/*
		 * Demo2 ob=new Demo2(); //AN OBJECT OF AN CHILD /SUBCLASS IS CREATED.
		 * 
		 * 
		 * System.out.println(ob.a); //1..IF WE WANT TO CALL AN VARIABLE OF PARENT CLASS
		 * WE Sysout USING OBJECT.VARIABLE
		 * 
		 * 
		 * ob.method1(); //CALLING THE METHOD OF PARENT CLASS
		 * 
		 * 
		 * 
		 * Demo2.method2();//AS THE METHOD2 IN THE PARENT CLASS IS STATIC WE CAN CALL IT
		 * DIRECTLY BY CLASSNAME.METHOD //THE CLASSNAME SHOULD BE OF THE CHILDCLASS
		 * 
		 * 
		 * 
		 * System.out.println(Demo2.b); //2. WHEN THE VARIABLE IS STATIC THEN
		 * CLASSNAME.VARIABLE
		 * 
		 * new Demo2();
		 */
	
	
	}
}



