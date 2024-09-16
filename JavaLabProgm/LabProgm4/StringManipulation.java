package LabProgm4;
import java.util.StringTokenizer;
public class StringManipulation {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Amarnath";
		String str2 = "Amarnatha_PatroMCA";
		System.out.println("---------String Manipulation Methods---------");
		
		System.out.println("Combined String using concat():"+str1.concat(str2));
		System.out.println("Length of String: " + str2.length());
		System.out.println("Character at position 5: " + str2.charAt(5));
		System.out.println("Index of character 'S': " + str2.indexOf('a'));
		System.out.println("Compare To 'JAVA': " + str1.compareTo("JAVA"));
		System.out.println("Compare To 'JAVA' - Case Ignored: " + str1.compareToIgnoreCase("JAVA"));
		System.out.println("Contains sequence 'tar': " + str2.contains("rip"));
		System.out.println("Replace 'Java' with 'VB': " + str2.replace("Java", "VB"));
		System.out.println("Replace 'Java' with 'VB': " + str2.replaceFirst("Java", "VB"));
		

		//StringBuffer Methods
		System.out.println("\n--------String Buffer Methods------------");
		
		 StringBuffer s = new StringBuffer("Bufferclass");
								  	
	     System.out.println("Appended String : "+s.append("Java"));			
	     System.out.println("Inserted String : "+s.insert(5,"Java"));			
	     System.out.println("Reversed String : "+s.reverse()); 			
	     System.out.println("Replaced String : "+s.replace(1,3,"Java"));			
	     System.out.println("String after deletion : "+s.delete(1,3));		
	     System.out.println("String after deletecharat : "+s.deleteCharAt(7));
	     
	     //String Tokenizer
	     System.out.println("\n----------String Tokenizer-----------");
	    
	     StringTokenizer st = new StringTokenizer("Spread the Java Wing"," ");  
			
		 System.out.println("Total number of Tokens: "+st.countTokens());		
		 while (st.hasMoreTokens()) {  		
	         System.out.println(st.nextToken());  
	     }
	     
	     StringTokenizer st1 = new StringTokenizer("Spread,the,Java,Wing");   
	     System.out.println("Next token is : " + st1.nextToken(",")); 
	}

}
