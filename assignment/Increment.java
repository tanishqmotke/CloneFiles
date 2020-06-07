package assignment;

public class Increment {

	public static void main(String[] args) {
		
		int a=20, b=31;
			
			
			a++;		//20
			++b;         // 21 32
			
			System.out.println("a="+a+"\tb="+b);    //21  32
			System.out.println("a="+(a++)+"\tb="+(++b));  //21 33
			System.out.println("a="+a+"\tb="+b);     // 22  33
			System.out.println("a="+(a--)+"\tb="+(--b)); // 21  32....
			System.out.println("a="+(a++)+"\tb="+(b++)); // 21  32
			System.out.println("a="+a+"\tb="+b); //22 33
			a=a+5;
			System.out.println("a="+a); //27
			
			a/=5;                       
			System.out.println("a="+a); //5..


	}

}
