package march15.classcodes;

import java.util.HashSet;
import java.util.TreeSet;

public class Collection7 {
public static void main(String[] args) {
	TreeSet set=new TreeSet();
	set.add(90);
	set.add(190);
	set.add(1390);
	set.add(1190);
	set.add(1940);
	set.add(78);
	set.add(45);
	System.out.println(set);
	System.out.println(set.first());
	System.out.println(set.last());
	System.out.println(set.headSet(1200));
	System.out.println(set.tailSet(1200));
	System.out.println(set.subSet(1190, 2000));


   System.out.println(set.ceiling(1180));

}
}
//ceiling()