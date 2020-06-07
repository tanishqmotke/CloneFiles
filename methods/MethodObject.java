package methods;

public class MethodObject {

	public static void main(String[] args) {
		
		Employee em=new Employee();
		
		Students st=new Students();
		
		
		
		MethodObject methodObject=new MethodObject();
		
		methodObject.method(em , st);
		methodObject.method(new Employee(), new Students());
		
		//method2.instance(n); 
		//method2.instance(5);
	}
	
	public void method(Employee e , Students s ) {  // this method expecting 2 parameters . 
													//One of class Employee type and other of class student type
													//i.e we have given the class name and temp variable of type

													//of that class.Ex: Employee e, Students s 
													//Just like int i or float j or char z
		System.out.println("method1");
	}

}

 


