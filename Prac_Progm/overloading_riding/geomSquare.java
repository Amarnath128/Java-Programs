package overloading_riding;

public class geomSquare {

//Program to demonstrate Method Overloading

	void calcArea(float a)			
	{
		float area = a * a;
		System.out.println("The Area of a Square    = " + area + " Sq Units");
	}
	
	void calcArea(float a, float b)	
	{
		float area = a * b;
		System.out.println("The Area of a Rectangle = " + area + " Sq Units");
	}	
	
	void calcArea(double r)			
	{
		double area = 3.14 * r * r;
		System.out.println("The Area of a Circle    = " + area + " Sq Units");
	}	
	
	void calcArea(double a, double b)
	{
		double area = (a * b) / 2;
		System.out.println("The Area of a Triangle  = " + area);
	}
	
}