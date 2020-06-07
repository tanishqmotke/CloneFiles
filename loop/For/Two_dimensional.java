package loop.For;

public class Two_dimensional {
	
	public static void main(String[]args) {
	
	//dataType [] ArrayName = {ArrayItems}
	
		int[] x= {10,20,30,40,50};	
	
		
		
		for(int i:x ) {
			
			
			System.out.println("\n"+i);
		
		}
		
		int[][] y= {{1,2,3,4} ,{12,42,53}}; //two_dimensional array
		
	    for(int[] j1:y) {
	    	
	    	for(int j2:j1) {
	    		
	    		
	    		System.out.println("\n"+j2);
	    		
	    	}
    	
	    	
	    }
		
	}
}


