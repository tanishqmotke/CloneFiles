package inner.Class;

public class InnerClass {

	public static void main(String[] args) {
		
	ClassOuter classouter=new ClassOuter();
	ClassOuter.ClassInner classinner= classouter.new ClassInner();
	//Syntax: OuterClassName.InnerClassName InnerClassObjectname = OuterClassObjectname.new InnerClass();
	
	
System.out.println(classouter.x);
System.out.println(classinner.y);


	
	}
	
}
class ClassOuter{
	
	
	int x=10;
	
	class ClassInner{
		
	int y=20;
		
	}
	
	
}
