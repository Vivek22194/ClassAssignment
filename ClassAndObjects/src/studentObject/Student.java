package studentObject;

public class Student
{

	String name;
	int roll_no;
	String phoneNumber;
	String address;
	
	
	public static void main(String[] args)
	{
		
		Student st1 = new Student();
		st1.name = "John";
		st1.roll_no = 2;
		st1.address = "Canada";
		st1.phoneNumber = "+14164167445";
		
		Student st2 = new Student();
		st2.name = "Sam";
		st2.roll_no = 1;
		st2.address = "India";
		st2.phoneNumber = "+14374990993";
		
		
		System.out.println("Student name is " +st1.name +".");
		System.out.println("Student roll no is " +st1.roll_no +".");
		System.out.println("Student address is " +st1.address +".");
		System.out.println("Student phone number is " +st1.phoneNumber +".");
		
		System.out.println("Student name is " +st2.name +".");
		System.out.println("Student roll no is " +st2.roll_no +".");
		System.out.println("Student address is " +st2.address +".");
		System.out.println("Student phone number is " +st2.phoneNumber +".");
	}


	
	
}
