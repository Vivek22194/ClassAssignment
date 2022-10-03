package problem6;

/*
Write a program to print the area of two rectangles having sides (4,5) and (5,8)
respectively by creating a class named 'Rectangle' with a method named 'Area'
which returns the area and length and breadth passed as parameters to its 
constructor.
*/


public class Rectangle 
{
	int length;
	int breadth;
	
	public Rectangle(int i, int j) 
	{
		length = i;
		breadth = j;
		
	}

	public int area()
	{
		
		return length*breadth ;
	}
	
	public int perimeter()
	{
		return 2*(length+breadth);
	}
	@Override
	public String toString() {
		return "length=" + length + " and breadth=" + breadth ;
	}

	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle(4,5);
		Rectangle r2 = new Rectangle(5,8);
		
		System.out.println("Area of Rectangle is " +r1.area() +" and Perimeter of ractangle is "+r1.perimeter() +" having " +r1.toString());
		System.out.println("Area of Rectangle is " +r2.area() +" and Perimeter of ractangle is "+r2.perimeter() +" having " +r2.toString());
	}
	
	
	
}
