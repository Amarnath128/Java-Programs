package LabProgrm6;
import java.util.Scanner;
//Interface
interface Area 
{
	double Compute(double a, double b);
}

//Rectangle Class
class Rectangle implements Area
{
	public double Compute(double l, double b)
	{
		return (l*b);
	}
}

//Triangle class
class Triangle implements Area
{
	public double Compute(double b, double h)
	{
		return (b*h/2);
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length");
		double l=sc.nextDouble();
		System.out.println("Enter Breadth");
		double b=sc.nextDouble();
		System.out.println("Enter Height");
		double h=sc.nextDouble();
		
		Rectangle rect = new Rectangle();
		double RArea = rect.Compute(l, b);
		System.out.println("The area of the Rectangle is "+RArea);
		
		Triangle tri = new Triangle();
		double TArea = tri.Compute(b, h);
		System.out.println("The area of the triangle is "+TArea);
	}

}