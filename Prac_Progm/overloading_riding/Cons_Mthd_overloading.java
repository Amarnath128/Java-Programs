package overloading_riding;

//Program to demonstrate Constructor & Method Overloading

public class Cons_Mthd_overloading {

	public static void main(String[] args) {

		
		//Constructor Overloading
		System.out.println("CONSTRUCTOR OVERLOADING\n");
		StudentData myobj = new StudentData();
		myobj.print();     
		StudentData myobj2 = new StudentData(9611, "James Peter", 6);
		myobj2.print();
		
		//Method Overloading
		System.out.println("\nMETHOD OVERLOADING");
		geomSquare obj = new geomSquare();
		obj.calcArea(10.6f);
		obj.calcArea(14.3f, 22.5f);
		obj.calcArea(11.67);
		obj.calcArea(18.0, 25.4);
		
	}

}