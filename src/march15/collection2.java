package march15;

import java.util.ArrayList;
import java.util.HashSet;

public class collection2 {
public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add("A");
	list.add("B");
	list.add("A");
	list.add("B");
	
	System.out.println(list);
	list.add(1,"X");
	System.out.println(list);
	
	list.set(3,"Y");
	System.out.println(list);
	
	System.out.println(list.get(4));//only for list
	list.indexOf('E');
	list.lastIndexOf(' ');
	
	
	ArrayList list1 = new ArrayList(list);
	System.out.println(list1);
}
}
