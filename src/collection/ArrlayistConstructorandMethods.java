package collection;

import java.util.ArrayList;

public class ArrlayistConstructorandMethods {
//storing one collection objects into another collection
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(0, 3);
		l1.add("hi");
		l1.add("bye");
		l1.add(1, 33);
		l1.add(2, 22);
		l1.add(3, null);

		
		// addAll(int index, collection c) : this is list method
		// addAll(collection c) : this is collection add method
		ArrayList l2=new ArrayList();// storing l1 data into l2
		l2.add(33);
		l2.add("bye");
		l2.add(44);
		System.out.println(l2);
		System.out.println(l1.contains(4));
		System.out.println(l1.contains(3));
		//l1.clear();// will delet all objects/data
		//System.out.println(l1);
		l1.addAll(l2);
		System.out.println(l1);
		l1.remove(2);
		System.out.println(l1);
		System.out.println(l1.indexOf("hi"));
  l1.removeAll(l2);//it will remove only values which are common in both AL l1 and l2 like bye
  System.out.println(l1);
	}

}
