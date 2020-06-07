package superKeyword;
public class ParentConstructor {


	public static void main(String[] args) {
	
		new Child2();

	}

}

class Parent1{
	
	Parent1(int a , String t){
		
		System.out.println("this is parent default constructor");
		System.out.println(a + t);
	}
	
}

class Child2 extends Parent1{
	
	Child2(){
		
		super(10 ,"Tanishq");
		System.out.println("this is child default constructor");
		
	
		
	}
		
		
	}


