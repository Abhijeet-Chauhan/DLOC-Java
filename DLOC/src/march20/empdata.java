package march20;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class empdata {
	public static void main(String[] args) {
		employee e1 = new employee("abhi",1,10000,"Boisar");
		employee e2 = new employee("om",2,10000,"Boisar");
		employee e3 = new employee("abhishek",1,10000,"Boisar");
		employee e4 = new employee("karan",1,10000,"Boisar");
		TreeSet<employee> ts= new TreeSet<employee>();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		System.out.println(ts);
		List<Integer> emp = Arrays.asList(12,3,56);
		System.out.println(emp);
}
}
