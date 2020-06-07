package loop.For;

class For_loop {

	public static void main(String []args) {
		For.method1();
		Each.method2();
		Each2.method3();
		Each3.method4();
		Each4.method5();
		//Each5.method6();
		}
		
	}
class For{
	
	static public void method1() {
		
		for(int x=0;x<5;x++) {
			System.out.println(x);
		
		}
		System.out.println("");
	}
}


class Each{
	
	static public void method2() {
		System.out.println("one dimensional array");
		int[] x  = { 10, 20, 30, 40 };
		for (int x1 : x) {
			System.out.println(x1);
		}
		System.out.println("");

	}
}

class Each2{
	
	static public void method3() {
		System.out.println("two dimensional array");

		int[][] x = { { 10, 20, 30, 40 }, { 50, 60 } };

		for (int[] x1 : x) {

			for (int x2 : x1) {

				System.out.println(x2);
				

			}
			
		}
		System.out.println("");

	}
}

class Each3{
	
	static public void method4() {
		int[] x= {10,20,30,40};
		int total=1;
		for(int x1:x) {
			total=x1+total;
			}
		
		System.out.println("total="+total);
		System.out.println("");
	}
}


class Each4{
	
	static public void method5(){
		String s= "tanishq sankalp pooja kshitij ";
		//String s1="sanjiv";
		
	System.out.println(s);
	
	
	String[] x= {"tanishq","motke","raj","aqsa","lalit","kalpana"};
	int[] y= {1,2,3,4,5}; 
	
	for(int i = 0; i<x.length; i++) {
	
		System.out.println(x[i]);
		
		
		
	}
	
	for(int i : y){
		
		
		System.out.println("\n"+i);
		
	
	}
	}
		
		
	}


/*class Each5{
	
	static public void method6() {
		
		for () {
			
			System.out.println("hello");
		}
		
	}
}*/
