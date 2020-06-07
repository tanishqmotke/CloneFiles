package methods;


//In this program , I am going to learn methods with return type.
public class MethodReturn {
	

	
	public static void main(String[] args) {
  // int l=10;
   int b=20;
   int c=30;
   int d=40;
   char e='d';
	MethodReturn method4=new MethodReturn();
	
	//char s=method4.instance(5,10,'t');
	//System.out.println(s);
	//System.out.println(method4.instance(5,10, 't'));
	//System.out.println(method4.instance( , i));
	
	//String st=
	System.out.println(method4.instance(b, c, d, e));

	
	}
	
	
	public int instance () { 
		
	System.out.println("6");
    return 10 ;
	
	}
	
	public char instance (int i, int j , char k ) {
		
		// 20  30 
	   System.out.println(j  + " " + i );
		return k ;
	}
	
	public String instance( int l,int m , int n ,char o) { //temporary 
		//20 30 40 d
		String b="tanishq";
		System.out.println(m +" "+ l +" "+ n +" "+ o);
		return b;
	}
	


}