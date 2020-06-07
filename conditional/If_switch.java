package conditional;

public class If_switch {
	
	
	static int i=10;
	static int x=20;
	
	public static void main(String[] args) {
		
		
		if (i==10) {   //type 1
			
			System.out.println("value is 10");
		}
		else {
			System.out.println("false");
		}
			
		
		if(x==20) { //type 2
			
			System.out.println("value is 20");
			
		
		}
		
		switch(i) {
		
		
		default:
			System.out.println("default");
			break;
			
			
		}
      switch(i) {
		
		case 5:
			System.out.println("value is 10 ");
			break;
			
		case 8+2:
			System.out.println("value is 20");
			break;
		
			
			
		}
     /* switch(i) {
		
		case 5+5:
			System.out.println("value is 10 ");
			break;
			
		case 8+2:
			System.out.println("value is 20");
			break;
			
		default:
			System.out.println("default");
			break;
			
			
		}*/
      switch(i) {
		
		case 5:
			System.out.println("value is 10 ");
			break;
			
		case 8+2:
			System.out.println("value is 20");
			break;
			
		default:
			System.out.println("default");
			break;
			
			
		}
      int a=10;
     
      switch(a) {
      
 
      case 1:
    	  System.out.println("value is 10");
    	  break;
    	  
      case 2:
    	  System.out.println("value is 10");
    	  break;
    	  
      default:
    	  System.out.println("value is 10");
    	  break;
    	  
   
		
			
		}
      
      switch(x) {
      
      case 1:
      case 2:
      case 3:
      case 4:
    	  System.out.println("quarter 1");
      case 5:
      case 6:
      case 7:
      case 8:
    	  System.out.println("quarter 2");
      case 9:
      case 10:
      case 11:
      case 12:
    	  System.out.println("quarter 3");
    	  break;
    
      }
      
		
	}

}
