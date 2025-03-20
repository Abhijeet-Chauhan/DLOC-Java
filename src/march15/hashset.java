package march15;

import java.util.HashSet;
import java.util.TreeSet;

public class hashset {
public static void main(String[] args) {
//	HashSet set = new HashSet();
	TreeSet set = new TreeSet();
	set.add(89);
	set.add(22);
	set.add(null); //not keepnull in treeset
	set.add("asdd"); //not keep different
	System.out.println(set);
}
}
