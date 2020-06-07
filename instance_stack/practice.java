package instance_stack;

public class practice { //class practice with a method practical1

	public static void main(String[] args) {
	practice.practical1();//static method calling direct static method
	practices res=new practices();
	res.practical2();

	}
 public static void practical1() { //method created
	 
  System.out.println("Tanishq");
	 
 }
	
}

class practices {
	
	public void practical2() {
	int i=10;
	
	System.out.println(i);	
		
	}

	
}
