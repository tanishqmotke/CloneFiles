package constructor;

public class Test {
	
	
	{
		
	System.out.println("instance");	//instance block
		
	}
	static {
		
		System.out.println("static"); //static block
	}
	
	Test(){  //default constructor
	  this(5,'z');	
		System.out.println("default Constructor"); 
		
	}
	
	Test(int a ,char b){  //parameterised constructor
		
		System.out.println("two argument "+  a + " "+ b );
	}
	
	
	public static void main(String[] args) {
		 Test ob=new Test();
		 
		 Test ob1=new Test(4,'t'); //parameterised 

		 System.out.println(new Test()); //no name object
	}

}
