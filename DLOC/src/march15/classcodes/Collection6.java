package march15.classcodes;


import java.util.LinkedList;
import java.util.ListIterator;

//ListIterator
public class Collection6 {
public static void main(String[] args) {
	LinkedList list=new LinkedList();
	list.add("A");
	list.add("B");
	list.add("C");
	list.add("D");
	list.add("E");
	
	System.out.println(list);
	ListIterator lit=list.listIterator();
	System.out.println("Element in forward direction");
	while(lit.hasNext())
	{
		System.out.println(lit.nextIndex()+"--->"+lit.next());
	}
	System.out.println();
	System.out.println("Elements in backward direction");
	while(lit.hasPrevious())
	{
		System.out.println(lit.previousIndex()+"--->"+lit.previous());
	}
	
}
}
