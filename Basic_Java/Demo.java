package Basic_Java;

public class Demo {
	
	
public static void main (String[] args){
Demo1.method1();
Demoo2 s=new Demoo2();
s.method();
}
}


class Demo1{
int j=10;


public static void method1(){

}
}

class Demoo2 {
Demo1 n=new Demo1();
int r=n.j;

public void method(){
	System.out.println(r);
}
	
}
