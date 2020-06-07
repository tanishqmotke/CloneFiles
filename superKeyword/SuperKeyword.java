package superKeyword;

//IN THIS WE ARE GOING TO STUDY THE USE OF SUPER KEYWORD TO ACCESS THE VARIABLE OF PARENT CLASS
class p1{
	
	int i=10;
	int j=10;
	
	
}

public class SuperKeyword extends p1{
	
	int i=20;
	int j=20;

	void add(int i, int j) {
		System.out.println(i+j);
		System.out.println(this.i+this.j);
		System.out.println(super.i+super.j);
		
		
		
	}
	
	
	
	public static void main(String[] args) {
	
	 new SuperKeyword().add(100,100);
		
	}

}



