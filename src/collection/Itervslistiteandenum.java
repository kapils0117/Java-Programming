package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Itervslistiteandenum {
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
		//System.out.println(ll.set(0, "ll2"));// set / update any value for specific index position
		//System.out.println(ll);
		
	
		ListIterator i = ll.listIterator();
		i.next();//hav to use next method as cursor is at top and we're using previous method
		i.next();
		i.next();
		i.next();
		i.next();
		i.next();
		while(i.hasPrevious()) {
			
			System.out.println(i.previous());
			
		}
	}	
	}
	
