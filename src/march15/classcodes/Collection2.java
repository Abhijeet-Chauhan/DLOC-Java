package march15.classcodes;

import java.util.ArrayList;

public class Collection2 {
public static void main(String[] args) {
	ArrayList list=new ArrayList();
	list.add("A");
	list.add("B");
	
	list.add("A");
	list.add("B");
	list.add("C");
	list.add("D");
	list.add("E");
	
	System.out.println(list);
	list.add(1,"X");
	System.out.println(list);
	list.set(1,"Y");
	System.out.println(list);
	//list.set(10, "H");
	//System.out.println(list);
	
	System.out.println(list.get(4));
	list.remove(4);
	System.out.println(list);
	list.indexOf("E");
	list.lastIndexOf("");
	
	ArrayList list1=new ArrayList(list);
	System.out.println(list1);
	list1.add(null);
	list1.add(null);
	System.out.println(list1);
	list1.add(new Integer(190));
	
	Integer i=new Integer(100);
	System.out.println(i);
	
}
}
//new_Capacity = (Current_Capacity*3/2)+1   ----formula for expanded capacity
