package constructor;

public class ConstructorVsStatic2 {

	
	{
		System.out.println("Instance block ");
	}
	static {
		
		System.out.println("Static Block");
	}

	ConstructorVsStatic2() {
		
		  System.out.println("From default constructor");
			
		}
	
	public static void main(String [] args) {
		
		ConstructorVsStatic2 constructorvsstatic2=new ConstructorVsStatic2();
		
		ConstructorVsStatic2 ob=new ConstructorVsStatic2();
		
		
	}
	
	
}
