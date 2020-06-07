package abstraction;

//Abstract class
abstract class Animal {
	 int i;

	
public abstract void animalSound();
// Regular method

public void sleep() {
 System.out.println("Zzz");
}
}

//Subclass (inherit from Animal)
class Pig extends Animal {
	
	
public void animalSound() {
 // The body of animalSound() is provided here
	
	i=10;
	super.sleep();
 System.out.println("The pig says: wee wee");
 
}
}

public class abstractionconcept {
	
public static void main(String[] args) {
	
 new Pig().animalSound();
}
}
