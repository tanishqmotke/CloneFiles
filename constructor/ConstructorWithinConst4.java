package constructor;

public class ConstructorWithinConst4 {

	ConstructorWithinConst4(){
		
		this (5);
		System.out.println("default ");

		
	}
	
	ConstructorWithinConst4(int a){
	   
		this (5 , 6);
		System.out.println("one argument "+ a);
		
	}
	
	ConstructorWithinConst4(int a ,int b){
   
	
    
	System.out.println("two argument "+ a + " " + b);	
		
	}
	
	public static void main(String[] args) {
		
		ConstructorWithinConst4 obj=new ConstructorWithinConst4();
		ConstructorWithinConst4 object=new ConstructorWithinConst4();
		
		
		

	}

}
