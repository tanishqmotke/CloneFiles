package methods;

public class ReturnSameClassObject {
	
	
	public ReturnSameClassObject method1() {

		return new ReturnSameClassObject();
		
	}

	
	public ReturnSameClassObject method2() {
		
		return this;
		
	}
	
	
	
	public static void main(String[] args) {
		
		ReturnSameClassObject ob=new ReturnSameClassObject();
		System.out.println(ob.method1()); 
		//When I SOP the ob.method i get the address of the object
		System.out.println(ob.method2());
		
		//Where else when i assign an variable to it i get the address of the variable not the object.
		ReturnSameClassObject x= ob.method1();
		System.out.println(x);
	
		
	}

}
