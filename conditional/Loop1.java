/*package conditional;

public class Loop1 {
	
	 static int i =10;
	 int j= 10;

public static void main(String[] args) {
	
	
	Loop2 loop2=new Loop2();
	loop2.in();
	loop2.s();
	
}

}

class Loop2{
	
	Loop1 a = new Loop1();
	Loop1 b = new Loop1();
	
	public void in() {
		System.out.println("static a "+Loop1.i);
		System.out.println("instance a "+a.j);
		System.out.println("static b "+Loop1.i);
		System.out.println("instance b "+b.j);
		Loop1.i +=2;
		b.j +=2;
		System.out.println();
		System.out.println("static a "+Loop1.i);
		System.out.println("instance a "+a.j);
		System.out.println("static b "+Loop1.i);
		System.out.println("instance b"+b.j);
	   }
		public void s() {
			System.out.println();
			System.out.println("static a "+Loop1.i);
			System.out.println("instance a "+a.j);
			System.out.println("static b"+Loop1.i);
			System.out.println("instance b"+b.j);
		}

  
	}*/