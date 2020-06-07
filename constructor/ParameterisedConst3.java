package constructor;

public class ParameterisedConst3 {

	

	ParameterisedConst3(){
		
		System.out.println("default constructor");
		
	}
	
	
	ParameterisedConst3(String a, int z){
		
		System.out.println(a + z );
		
	}
	
	
	
	public static void main (String[] args) {

		ParameterisedConst3 obj=new ParameterisedConst3();
		ParameterisedConst3 object=new ParameterisedConst3("parameterised Constructor ",4);
		
		
		
}
}
