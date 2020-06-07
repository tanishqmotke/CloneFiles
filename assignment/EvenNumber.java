package assignment;

public class EvenNumber {

	public static void main(String[] args) {
		
	int num=6;
	
	if(num<=2) {
		
		System.out.println("Number should be greater than 2");
	}
	else {
	
	//WRONG for loop 
	/*for(int i=1; i<num; num--) {
	if(num%2==0) {
		
	System.out.println(num);
			
			
	}

		
	}	*/
	
	
	for(int i=1;i<num; i++) {
		
		
		if(i%2==0) {
			
			
			System.out.println(i);
		}
	}
	
	}
	}
	
}


