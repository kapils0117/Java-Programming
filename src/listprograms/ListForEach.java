package listprograms;

import java.util.ArrayList;

public class ListForEach {
	  public static void main(String args[]){  
		   //Creating a list of elements  
		   ArrayList<String> list=new ArrayList<String>();  
		   list.add("kapil");  
		   list.add("jack");  
		   list.add("gajodhar");  
		   //traversing the list of elements using for-each loop  
		   for(String s:list){  
		     System.out.println(s);  
		   }  
		  
		 }  
}
