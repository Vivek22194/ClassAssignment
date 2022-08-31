import java.util.Scanner;
public class Student {

	public static void main(String[] args)
	{
		int total = 0;
		int avg = 0;
		int parcent = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter marks obtained in Maths: ");
		int math = sc.nextInt();
		
		System.out.println("Enter marks obtained in Science: ");
		int sci = sc.nextInt();
		
		System.out.println("Enter marks obtained in English: ");
		int eng = sc.nextInt();
		
		total = math+sci+eng;
		System.out.println("Total marks in 3 Subject: " +total);

		avg = total/3;
		System.out.println("Average marks in 3 Subject: " +avg);
		
		parcent = (total*100)/150;
		System.out.println("Parcentage of the Student: " +parcent +"%");
		
	}

}

