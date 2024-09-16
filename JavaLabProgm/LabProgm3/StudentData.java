package LabProgm3;

public class StudentData {
    //Program to demonstrate Constructor Overloading

           private int stuID;
           private String stuName;
           private int stuAge;
           StudentData()
           {
               //Default constructor
               stuID = 100;
               stuName = "Tony";
               stuAge = 18;
           }
           StudentData(int num1, String str, int num2)
           {
               //Parameterized constructor
               stuID = num1;
               stuName = str;
               stuAge = num2;
           }
       
           public void print() {
               System.out.println("Student Name is: "+stuName);
               System.out.println("Student Age is: "+stuAge);
               System.out.println("Student ID is: "+stuID);
           }
    
    }
