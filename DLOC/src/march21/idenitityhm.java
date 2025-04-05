package march21;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class idenitityhm {
public static void main(String[] args) {
	Integer in1 = new Integer(10);
	Integer in2 = new Integer(10);
	
//	in1 = in2;
	
	HashMap map = new HashMap();
	map.put(in1,"AAA");
	map.put(in2, "BBB");
	System.out.println(map);
	
	IdentityHashMap map1 = new IdentityHashMap();
	map1.put(in1,"AAA");
	map1.put(in2, "BBB");
	System.out.println(map1);
	
}

}
