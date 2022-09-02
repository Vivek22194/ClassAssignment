import java.util.Scanner;

public class OddEven
{

	public static void main(String[] args)
	{
		String result = null; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter Your Number:");
		int num = sc.nextInt();
		
			if (num==0)
			{
				System.out.println("Sorry! Try again with another number.");
			}
			
			if(num!=0)	
			{
				result = (num%2==0) ? "The number you have entered is Even." : "The number you have entered is Odd." ;
				System.out.println(result); 
			}
		

	}

}