package constructor;

public class DefaultConstructor1 {
	
	
   DefaultConstructor1() {
	
	  System.out.println("From default constructor");
		
	}

	public static void main(String[] args) {
		
		method1();
		
	}
	
	public static void method1() {
		
	System.out.println(new DefaultConstructor1() ); //no name object 
	
	DefaultConstructor1 defaultconstructor1=new DefaultConstructor1();   //named object
	System.out.println(defaultconstructor1);  
	
	
			
			
	}
	

}
