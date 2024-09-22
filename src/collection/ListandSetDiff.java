package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListandSetDiff {

	public static void main(String[] args) {
		List ll=new ArrayList();
		//ll.add(1, "abe");// it will give exception bcoz we dont have any value on index 0 position and list stores 
		//objects on index basis so it is mandatory to store from 0 index
		ll.add(0, "abe");
		ll.add(1, "abe");
		ll.add(66);
		ll.add(77);
		ll.add(null);//will store both null values
		ll.add(null);
		//System.out.println(ll);
		//System.out.println(ll.get(2));// get any specific index object
		System.out.println(ll.set(0, "ll2"));// set / update any value for specific index position
		System.out.println(ll);
		Iterator i = ll.iterator();
		while(i.hasNext()) {
			
			System.out.println(i.next());
			
		}
		
		
		
		Set s= new HashSet();// it stores on basis on hashcode and doesn't allow duplicate data
		s.add(90);
		s.add("hi");
		s.add(90);
		s.add("bye");
		s.add("test");
		s.add(null);//will store only one null value
		s.add(null);
		System.out.println(s);
	}
	
}
