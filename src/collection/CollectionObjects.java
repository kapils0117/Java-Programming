package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionObjects {

	public static void main(String[] args) {
		ArrayList l1= new ArrayList();
		l1.add(12);
		l1.add("hello");
		l1.add('v');
//whatever values we're storing or adding all those are collection objects so 12, hello, v are objects
		
		ArrayList l3= new ArrayList();
		l3.add(12);
		l3.add("hello");
		l3.add('v');
		l3.remove(0);
		
		//Iterator itr=l3.iterator();
		//while(itr.hasNext()){  
		//System.out.println(itr.next());  
		System.out.println(l3);
		
		l1.addAll(l3);//adding two arlist items
		//System.out.println(l1);
		//System.out.println(l3.contains(11));// it will return true or false
		
		l1.removeAll(l3);// will remove only common methods b/w l1 and l3
		//System.out.println(l1);
		l1.clear(); // will remove all objects values
		//System.out.println(l3.isEmpty());
		//System.out.println(l1);
		
		HashSet hs= new HashSet();
		hs.add(2);
		hs.add("hi");
		hs.add(true);
		//System.out.println(hs);
		
		List l2 = new ArrayList();// list interface,arrayLi is class, here we can access all methods of Arraylist class
		Set s1= new HashSet();
		
	}
}
