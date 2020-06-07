package keyword.This;

public class This {
	 int a=100;  //instance variable
	 int b=200;  //instance
	 int c=400;
	public  void method1(int a, int b , int c) { //local variable

		
		  System.out.println(a + b); //local variable call
		  
		  System.out.println(this.a + this.b ); //instance variable call using this keyword
		
		  System.out.println(this.c);
			}

	
	public void method2(int a, int b , int c) { //local variable

		 
		System.out.println(a + b); //local variable call
		  
		System.out.println(this.a + this.b ); //instance variable call using this keyword
		
		System.out.println(this.c);
			}
	
	
	public static void main(String[] args) {
		
		
		This t=new This();
		t.method1(10, 20 ,30); 
		t.method2(40, 50, 60);
		

	}
	
	

}
