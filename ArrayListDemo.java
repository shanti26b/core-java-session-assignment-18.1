// here i am showing the object of ArrayList taking 5  string elements 

package assignment18;    // here i m creating package name as assidnment18

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {   //  here i am taking class name as InteratorListDemo
	
	public static void main (String []args){  // taking the  main method
		
		ArrayList<String>list=new ArrayList<String>(); //  and creating ArrayList
		
	list.add("Santhi");       // here i am adding ArrayList of 5 string elements
	list.add("Mahe");         // here i am adding String  name as "Mahe"
	list.add("Komali");       // here i am adding String name as Komali
	list.add("Swathi");       // here i am adding String name as Swathi
	list.add("Geetha");       // here i am adding String name as Geetha
	       System.out.println("Arraylist and taking 5 string elements");
	
     Iterator itr=list.iterator();   // here i am taking  Iterator from ArrayList  to traverse elements
     
     while (itr.hasNext()){   // here i am creating each elements in the list by calling inside the loop      
    	 System.out.println(itr.next());   
     }
	
	
	
		
	}

}
