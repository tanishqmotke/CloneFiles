package methods;


//In this program i am going to see how a method returns object.
public class MethodVsReturnObject {

	public Demo1 method1() {
		
		
	Demo1 demo1=new Demo1();

	System.out.println("demo 1 class");
	return demo1;
	
		
	}
	
	public Demo2 method2() {
		
	
		System.out.println("demo 2 class");
		
		return new Demo2();
		
	}
	
	
	public static void main(String[] args) {
		
		MethodVsReturnObject ob=new MethodVsReturnObject();
		
	    //System.out.println(ob.method1());
	    
	    Demo1 x=ob.method1();
	    System.out.println(x);
	    
	    Demo2 y=ob.method2();
	    System.out.println(y);
	 
		
	}
	
	
}

class Demo1{
	

	
}

class Demo2{
	
	
}
