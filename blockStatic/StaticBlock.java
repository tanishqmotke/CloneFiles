package blockStatic;

public class StaticBlock {
	
	static int a;
	int k;
	
	static {
	  
		StaticBlock ob=new StaticBlock();
	   ob.k=10;
	   System.out.println("static block k"+" "+ ob.k);
	   a=100;
	   System.out.println("static block a"+" "+a);
		
	}

	public static void main(String[] args) {
		StaticBlock obj=new StaticBlock();
		System.out.println( "main() k "+ " "+ obj.k);
		System.out.println("main () a "+" "+a);
		
	}

}
 