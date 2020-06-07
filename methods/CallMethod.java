package methods;



public class CallMethod {//scope started
	 
	   public static void main(String[]args){//main method scope started

	   System.out.println("tanishq");
	   System.out.println("Sanjiv");
	   System.out.println("Motke");
	   CallMethod call=new CallMethod();      
	   call.method1();
	  
	   // method1();

	//main method scope ended

	}

	public void method1(){
	   
	System.out.println("Method1");
	 method2();

	}

	public void method2(){
	 
	System.out.println("method2");

	}
	//scope ended 
	}
