package superKeyword;
//IN THIS WE ARE GOING TO STUDY HOW CONSTRUCTOR WORKS IN INHERITANCE USING SUPER KEYWORD


class Parent3{
	
	Parent3(){
		
		
		System.out.println(" 1.PARENT CLASS CONSTRUCTOR");
		
	}
	
	Parent3(int a){
		
		System.out.println("1. PARENT CLASS PARAMETER "+ a);
		
		
	}

	static void m1() {
		System.out.println("1 .PARENT CLASS");
		
	}

	void m2() {
	
	System.out.println("1 .INSTANCE PARENT CLASS");
}

}

public class SuperConst extends Parent3 {
	
	SuperConst(){
		
		
		//super();
		System.out.println("2. CHILD CLASS CONSTRUCTOR");
		
		
	}
	
	SuperConst(int a){
		
		 this();
		//super(a);
		System.out.println("2. CHILD CLASS PARAMETER "+  a);
		
	}
	
	static void m1() {

		System.out.println("2. CHILD CLASS");
		
	}
	void m2() {

		super.m2();
		System.out.println("2. INSTANCE CHILD CLASS");
	}
	
	void m3() {
		
		m2();
		
		
	}

	public static void main(String[] args) {
	
		
		new SuperConst();
		System.out.println("");
		m1();
		System.out.println("");
		new SuperConst().m3();
		System.out.println("");
		new SuperConst(10);
	}

}
