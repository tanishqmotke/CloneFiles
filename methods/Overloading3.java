package methods;
 
public class Overloading3{
	
	public static void main(String []args) {
		int a=10;
		int b=20;
		char q='w';
		String p="tanu";
		byte v=2;
		
		Overloading3 m=new Overloading3();
		m.m1();
		m.m1(a);
		m.m1(a, b ,q ,p , v);
		
		
		
	}
	
	public void m1() {
		System.out.println("hello this is m1");
	}
	
	
	public void m1(int i) {
		
		System.out.println(i);
	
	}
	
	public void m1(int j, int k , char t , String st , byte s) {
		
		System.out.println(j +" "+k + " "+ t + " "+ st +" "+ s);

		
	}
	
	
}