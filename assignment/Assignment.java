package assignment;

import java.util.Scanner;


public class Assignment{
	
	public static void main(String []args){
String StudentName;
String Section;
int RollNo;
System.out.println("1.StudentName 2.RollNo 3.Section");
		Scanner s=new Scanner(System.in);
		StudentName=s.nextLine();
		Section=s.nextLine();
		RollNo=s.nextInt();
		Section=s.nextLine();
		Student student=new Student();
		student.set(StudentName, RollNo, Section);
		student.get();
		
	}
}

class Student{
	
	private String StudentName;
	private int RollNo;
	private String Section;
 
 public void set(String Name,int RollNo, String Section) {
	 
	 this.StudentName=Name;
	 this.RollNo=RollNo;
	 this.Section=Section;
 }
 public void get() {
	 System.out.println("Student Name"+StudentName+"Roll No"+RollNo+"Section"+Section);
 }

}
