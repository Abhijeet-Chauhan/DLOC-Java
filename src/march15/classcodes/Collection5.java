package march15.classcodes;


import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Collection5 {
public static void main(String[] args) {
	Vector v1=new Vector();
	
	v1.add("A");
	v1.add("B");
	v1.add("C");
	v1.add("D");
	v1.add("E");
	
	System.out.println(v1);
	//Enumeration
	Enumeration e=v1.elements();
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
	System.out.println("---------------");
	ArrayList list=new ArrayList();
	list.add("A");
	list.add("B");
	
	list.add("A");
	list.add("B");
	list.add("C");
	list.add("D");
	list.add("E");
	//Iterator
	Iterator it=list.iterator();
	while(it.hasNext())
	{
		String element=(String)it.next();
		System.out.println(element);
		if(element.equals("C"))
		{
			it.remove();
		}
	}
	System.out.println(list);
	
	
	
}
}
//Enumeration
//Iterator
//ListIterator