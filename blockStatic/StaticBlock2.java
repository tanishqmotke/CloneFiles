package blockStatic;

public class StaticBlock2 {
	
	
	static {
		
		System.out.println("this is static block 2");
	}
	

	public static void main(String[] args) throws ClassNotFoundException {
		
		
		Class.forName("StaticBlock3");

	}

}

class StaticBlock3{
	
	static {
		
		System.out.println("this is static block 3");
	}
	
	
	
}