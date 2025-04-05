package march15.classcodes;


import java.util.HashSet;
import java.util.LinkedHashSet;

public class Collection8 {
public static void main(String[] args) {
	HashSet set=new HashSet();
	set.add("A");
	set.add("H");
	set.add("M");
	set.add("B");
	set.add("C");
	
	System.out.println(set);
	LinkedHashSet set1=new LinkedHashSet();
	set1.add("A");
	set1.add("H");
	set1.add("M");
	set1.add("B");
	set1.add("C");
	System.out.println(set1);
	
	
	
}
}
