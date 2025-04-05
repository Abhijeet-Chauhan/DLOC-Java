package march15;

import java.util.ArrayList;
import java.util.HashSet;

public class collection1 {
public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add(12);
	list.add("hello");
	list.add(22.32);
	list.add(true);
	list.add(0,12);
	list.set(0,list);
	System.out.println(list);
	
	HashSet set = new HashSet();
	System.out.println(set.add("A"));
	set.add("A");
	System.out.println(set.add("A"));
//	set.addAll(set);
//	set.remove(set);
//	set.removeAll(set);
//	contains();gives true or false
//	constainsAll();
//	retainAll();
//	size();
//  clear() 
//	isEmpty();
//	toArray();
	
	
}
}
