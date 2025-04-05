package march15.classcodes;


import java.util.LinkedList;

public class Collection4 {
public static void main(String[] args) {
	LinkedList list=new LinkedList();
	list.add("A");
	list.add("B");
	
	list.add("A");
	list.add("B");
	list.add("C");
	list.add("D");
	list.add("E");
	System.out.println(list);
	
	for(Object x:list)
	{
		System.out.println(x);
	}
	
}
}
