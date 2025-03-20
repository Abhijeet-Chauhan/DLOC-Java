package march18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class empSort {
	public static void main(String[] args) {
		List<employee> emp = new ArrayList<employee>(Arrays.asList(new employee("abc","it",101,1000),
				new employee("def","it",102,2000),
				new employee("ghi","fin",103,5000),
				new employee("klm","hr",104,3000)));
		System.out.println(emp);
		Collections.sort(emp);
		System.out.println(emp);
		
	}
}
