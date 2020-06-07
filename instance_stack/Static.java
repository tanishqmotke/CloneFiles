package instance_stack;

public class Static {
	
	static int i =10; //inside the class and outside the method

	public static void main(String[] args) {
		System.out.println(i); 
		static1.stat1();  //static method calling another method directly
	static2 p=new static2(); //instance method 
	p.stat2();
	
	}

}

class static1 { //class static1 with method stat1
	
	static int j=20;
	 
	public static void stat1() {
		
	System.out.println(j);
		
	}
	
}

class static2 { //class static2 with method stat2
	
	int k =30;
 public void stat2() {
	 
System.out.println(k);	 
	 
 }
	
}
