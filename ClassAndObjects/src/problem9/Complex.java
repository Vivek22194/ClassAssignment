package problem9;

/*
Print the sum, difference and product of two complex numbers by creating 
a class named 'Complex' with separate methods for each operation whose
real and imaginary parts are entered by user.
*/

import java.util.Scanner;
public class Complex 
{
	int real;
	int imag;
	
	public Complex(int i,int j)
	{
		real = i;
		imag = j;
	}
	
	public static Complex add(Complex a, Complex b)
	{
		return new Complex((a.real+b.real),(a.imag+b.imag));
	}
	
	public static Complex diff(Complex a, Complex b)
	{
		return new Complex((a.real-b.real),(a.imag-b.imag));
	}
	
	public static Complex product(Complex a, Complex b)
	{
		return new Complex(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
	}
	
	public void printComplex()
	{
		if(real==0 && imag!=0)
		{
			System.out.println(imag +"i");
		}
		
		else if(real!=0 && imag==0)
		{
			System.out.println(real);
		}
		
		else
		{
			System.out.println(real +"+" +"("  +imag +"i" +")");
		}
		
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter real part 1: ");
		int real = sc.nextInt();
		System.out.println("Enter imaginary part 1: ");
		int imag = sc.nextInt();
		Complex c = new Complex(real, imag);
		
		System.out.println("Enter real part 2: ");
		int real2 = sc.nextInt();
		System.out.println("Enter imaginary part 2: ");
		int imag2 = sc.nextInt();
		Complex d = new Complex(real2,imag2);
		
		Complex e = Complex.add(c, d);
		Complex f = Complex.diff(c, d);
		Complex g = Complex.product(c, d);
		
		e.printComplex();
		f.printComplex();
		g.printComplex();
		
		sc.close();
	}
	
}
