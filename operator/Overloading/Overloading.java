package operator.Overloading;

public class Overloading {

	int a=10;
	int b=30;
	String s="tanishq";
	String t="Motke";
	public static void main(String[] args) {
		
    Overloading overloading=new Overloading();
    System.out.println(overloading.a + overloading.b); //int +int (Addition)
    System.out.println(overloading.s+ overloading.t);  //String + String (Concatenation)
    System.out.println(overloading.a+ overloading.s); //int + String 
    System.out.println(overloading.s+ overloading.a); //String+int
    System.out.println(overloading.a+ overloading.s+overloading.b);//int +String +int
    System.out.println(overloading.s+ overloading.a+overloading.t);//String+int+String
    System.out.println(overloading.a+ overloading.b+overloading.s);//Int+int+String
    System.out.println(overloading.a+" "+overloading.b);
    

    
   
	}

}
