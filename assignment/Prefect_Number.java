package assignment;

public class Prefect_Number {

	public static void main(String[] args) {
		// 1 2 3 divides 6.ALso 1+2+3 =6 . Therefore 6 is a prefect number.
		
	
		
		
	int sum=0;
	int n=6;
	for(int i=1; i<n; i++) {  //gets i=1
		
		if(n%i==0) {    //if i get remainder 0
			
			sum=sum+i; 
			          //then add it with sum
		
		
		}
	}
	
	System.out.println(sum);
		
		if(sum==n) {
			
			System.out.println("prefect");
		
		}else {
			
			
			System.out.println("not prefect");
			}
		
		}
		
		
	} 
		

	


