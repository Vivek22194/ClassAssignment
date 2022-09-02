import java.util.Scanner;
public class Student {

	public static void main(String[] args)
	{
		int total = 0;
		float avg = 0;
		float percent = 0;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter Total marks of the Exam: ");
		int tmark = sc.nextInt();
		
		System.out.println("Enter marks obtained in Maths: ");
		int math = sc.nextInt();
		
		System.out.println("Enter marks obtained in Science: ");
		int sci = sc.nextInt();
		
		System.out.println("Enter marks obtained in English: ");
		int eng = sc.nextInt();
		
		System.out.println("\n--------------------------------");
		
		total = math+sci+eng;
		System.out.println("Total marks in 3 Subject: " +total );

		avg = total/3;
		System.out.println("Average marks in 3 Subject: " +avg);
		
		percent = (total*100)/(tmark*3);
		System.out.println("Percentage of the Student: " +percent +"%");
		
	}

}

