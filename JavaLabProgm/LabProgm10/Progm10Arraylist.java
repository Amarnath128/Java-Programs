import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Progm10Arraylist {
    

public static void main(String[] args) {
	// TODO Auto-generated method stub
	   ArrayList<String> languages = new ArrayList<String>();

	    languages.add("Java");
	    languages.add("Python");
	    languages.add("Swift");
	    languages.add(3,"Perl");
	    System.out.println("ArrayList: " + languages);

	    // get the element from the arraylist
	    String str = languages.get(1);
	    System.out.println("Element at index 1: " + str);

	    // change the element of the array list
	    languages.set(2, "JavaScript");
	    System.out.println("Modified ArrayList: " + languages);

	    // remove element from index 2
	    str = languages.remove(2);
	    System.out.println("Updated ArrayList: " + languages);
	    System.out.println("Removed Element: " + str);

	    //Get the length of the arraylist.
	    System.out.println("\nSize of ArrayList: " + languages.size());

	    // iterate using Iterator
	    System.out.print("Accessing Elements using Iterator\n");
	    Iterator<String> itr=languages.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	   
	  //Sort the arraylist elements.
	   languages.sort(Comparator.naturalOrder());
	   System.out.println("Sorted ArrayList: " +languages);
	   
	   //Adding Collections
	   	ArrayList<String> courses = new ArrayList<String>();
	   	courses.add("MCA");
	   	courses.add("MBA");
	   	courses.add("Engineering");
	    System.out.println("First Collection: " +courses);
	    
	    ArrayList<String> subjects = new ArrayList<String>();
	    subjects.add("Computer Architecture");
	    subjects.add("Financial Accounting");
	    subjects.add("Engineering Mathematdics");
	    System.out.println("Second Collection: " +subjects);
	    
	    //courses.addAll(subjects);
	    courses.addAll(subjects);
	    System.out.println("After Adding Collections: " +courses);	    
	    courses.removeAll(subjects);
	    System.out.println("After Removing Collections: " +courses);
  }   
}
