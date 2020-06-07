package test;


//method vs Return Type
//Method vs Return Object !!!!!!


public class Test {

	public static void main(String[] args) {
		
		
       int x=10;
       int y=20;
       char c='t';
       String d="tanishq";
  
       Test test=new Test();
       System.out.println(test.instance(x));
       System.out.println(test.instance(x, d));
       System.out.println(Test.instance(x, y, c));
	}
	
	
	public int instance (int i) {
		
		return i;
		
	}
	
	public String instance (int i, String j) {
		
	System.out.println(i + " "+ j);
	
	return j;
	
	}
	
	public static char instance(int l , int m , char n) {
		
		return n;
		
	}

	
}
