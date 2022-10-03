package getterSetter;

import java.util.Scanner;
public class Area
{
	  int length;
	  int breadth;
	
	void setDim(int l, int b)
	{
		length = l;
		breadth = b;
		
	}
	
	int getArea()
	{
		return length*breadth;
	}
	
	
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int length,breadth;
		System.out.println("Eneter length: ");
		length = sc.nextInt();	
		
		System.out.println("Eneter breadth: ");
		breadth = sc.nextInt();
		
		Area a = new Area();
		
		a.setDim(length, breadth);
		
		System.out.println("Area of rectangle is: " +a.getArea());
	}

}
