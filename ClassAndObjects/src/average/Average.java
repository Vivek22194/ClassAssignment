package average;

/*

Print the average of three numbers entered by user by creating a class named
'Average' having a method to calculate and print the average.
*/


import java.util.Scanner;
public class Average 
{
	int n1;
	int n2;
	int n3;
	
	public int getAverage(int i, int j, int k)
	{
		n1 = i;
		n2 = j;
		n3 = k;
		
		return (n1+n2+n3)/3;
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter 3 numbers : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		Average a = new Average();
		
		System.out.println("Average of the numbers is " +a.getAverage(n1, n2, n3));
		sc.close();
	}
}
