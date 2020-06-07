package superKeyword;

public class ParentClassVariable {


	public static void main(String[] args) {
		
		int a=40;
		int b=40;

		
	new Child().add(30, 30); //no name object 
	System.out.println();
	Child ob=new Child(); //named object
	ob.add(a,b);
	
	

	}

}

class Parent{
	int i=10;
	int j=10;
}

class Child extends Parent{
	
	int i=20;
	int j=20;
	
	void add(int i , int j) {
	
		System.out.println(i+j);
		System.out.println(this.i+this.j);
		System.out.println(super.i+super.j);
		
		
		
	}
}

