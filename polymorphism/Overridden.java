package polymorphism;

public class Overridden {

	public static void main(String[] args) {
		
//     Animal obj=new Dog();
//     obj.sound();
//     obj.legs();
     
     Animal a=new Animal();
     Dog d=new Dog();
     Fish f=new Fish();
     Cat c=new Cat();
     
     Animal ref;
     
     ref=d;
     
     d.sound();
     d.legs();
     System.out.println(" ");
     ref=c;
     
     c.sound();
     c.legs();
     System.out.println(" ");
     
 
     System.out.println(" ");
     
     ref=f;
     f.sound();
     f.legs();
     
	}

}

class Animal{
	
 void sound() {

	 
 }
 void legs() {
	 
	System.out.println("Number of legs");
 }
	

}

class Dog extends Animal{
	
	void sound() {
		 
		System.out.println("DOG BARKS");
		 
	 }
	 void legs() {
		 
		 System.out.println("4 LEGS");
		 
	 }
	
}


class Fish extends Animal{
	
	void sound() {
		 System.out.println("FISH BLA BLA");
		 
	 }
	
	
}

class Cat extends Animal{
	
	void sound() {
		System.out.println("CAT MEOW");

	}
	void legs() {
		 System.out.println("4 LEGS");
		 
	 }
	
}