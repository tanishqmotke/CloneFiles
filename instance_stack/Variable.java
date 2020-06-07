package instance_stack;


public class Variable {
  public static void main(String[]args) {//main method  main method is static method
sample1 re=new sample1(); //class_name object = new class_name();
re.samp3(); //object.method();
re.samp4();//object.method();
sample1.samp1();
sample1.samp2();

  }
}

class sample1 { //class 
	int i=10;   //instance variable
	int j=20;   //instance variable
	static int k=30; //static variable
	static int l=40;  //static variable
 
	public static void samp1() { // static method
	 System.out.println(k);	
	
	}
	
	public static void samp2() { //static method
		
	System.out.println(l);

	}
	
	
	public void samp3() {  //instance method 
		
	System.out.println(i);	
	}
	
	
	public void samp4() { //instance method
		
	System.out.println(j);	
	}
}