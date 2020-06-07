package call.Method;

public class Method_calling {
	

	public static void main(String[] args) {
	
   Method method=new Method();
   method.method1();                          //instance method in static method
   Method.method2();                         //static method in static method
   
	}

}

class Method{
	
	int a=20;
	
	static int b=30;
	
	public void method1() {                                    //instance method
		
		
		int c=10;                                               //local variable 
		
		System.out.println("local Variable ="+c);               //local variable
		
		
		System.out.println("instance variable = " + a);  		//instance variable
		                    
		
		System.out.println("static variable = "+ Method.b); 	//static variable

		
		
	}
	
	
	public static void method2() {    								//static method
		
		
		int d=10;
		
		System.out.println("Local variable in static method = "+d);        	//local
		
		Method instance=new Method();									    //instance
		System.out.println("instance variable in static method ="+instance.a);
		
														                  		//static
		System.out.println("static variable in static method ="+ b);
		
	
		
	}
}


