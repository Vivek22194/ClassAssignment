package trianglePerimeterAndArea;

public class Triangle 
{
	int side1;
	int side2;
	int side3;
	
	public Triangle(int i, int j, int k) {
		side1 = i;
		side2 = j;
		side3 = k;
	}

	public double getArea()
	{ 	
		
		double s= (side1+side2+side3)/2.0;
		return Math.pow((s*(s-side1)*(s-side2)*(s-side3)),.5);
	}

	public double getPerimeter()
	{
		return (side1+side2+side3)/2.0;
	}
	public static void main(String[] args) 
	{
		Triangle t = new Triangle(5,4,7);
		
		
		System.out.println(t.getArea());
		
		System.out.println(t.getPerimeter());

	}


}
