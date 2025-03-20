package march15.classcodes;

import java.util.ArrayList;
import java.util.HashSet;

public class Collection1 {
public static void main(String[] args) {
	ArrayList list=new ArrayList();
	list.add(12);
	list.add("hello");
	list.add(655.3);
	list.add(true);
	list.add("hii");
	list.add(0, list);//1,2,3,,5,4
	list.set(0, list);
	System.out.println(list);
	
	System.out.println("---------------");
	HashSet set=new HashSet();
	set.add("A");
	set.add("B");
	set.add("C");
	set.add("D");
	set.add("E");
	set.add("F");
	set.add("J");
	set.add("I");
	set.add("Z");
	System.out.println(set.add("A"));
	System.out.println(set.add("B"));
	
	System.out.println(set);
	
}
}
//addAll()
//remove(object)
//removeAll(Collection c)
//contains(Object obj)
//containsAll(Collection c)
//retainAll(Collection c)
//size()
//clear()
//isEmpty()
//public Object[] toArray()
//toArray


