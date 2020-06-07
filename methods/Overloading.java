package methods;

//in this program, I have learned the concept of method overloading.

public class Overloading {

	public static void main(String[] args) {
	
		
		int n=6;
		int m=7;
		int o=8;
	    char a='t';
	    String st="Tanu";
		Overloading method2=new Overloading();
		method2.instance();
		method2.instance(n); 
		method2.instance(5);
		method2.instance(m,o);
		method2.instance(a);
		method2.instance(st);
		method2.instance(a, st, n);
        method2.instance(st, a, n);
        
	}
	//method overloading 
	
	
	public void instance() { //zero argument 
		
		System.out.println("Static method -Method 1");
	}
	
    public void instance(int i) {  //except one argument only
		
		System.out.println(i); 
	}
	
	public void instance(int i,int j) { //except two argument only
		
		System.out.println(i +" "+ j);
	}
	
	public void instance(char a) {
		System.out.println(a);
	}
	
	public void instance(String st) {
		
		System.out.println(st);
	}
	
	public void instance(char a, String st , int i) {
		
		
		System.out.println(a+" "+ st +" "+ i);
	}
	

	public void instance(String st , char a, int i) {
		
		
		System.out.println(a+" "+ st +" "+ i);
	}
	

}


 class Method3 {
	

		public void instance() { //zero argument 
			
			System.out.println("Static method -Method 1");
		}
		
	    public void instance(int i) {  //except one argument only
			
			System.out.println(i); 
		}
		
		public void instance(int i,int j) { //except two argument only
			
			System.out.println(i +" "+ j);
		}
		
		public void instance(char a) {
			System.out.println(a);
		}
		
		public void instance(String st) {
			
			System.out.println(st);
		}
		
		public void instance(char a, String st , int i) {
			
			
			System.out.println(a+" "+ st +" "+ i);
		}
		

		public void instance(String st , char a, int i) {
			
			
			System.out.println(a+" "+ st +" "+ i);
		}
 }
 
 
		
	



