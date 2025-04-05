package march18;

import java.util.ArrayList;

import java.util.Collections;

public class collection1 {
public static void main(String[] args) {
	ArrayList<String> list = new ArrayList();
	list.add("dog");
	list.add("hello");
	list.add("cat");
	list.add("egg");
	list.add("hii");
	Collections.sort(list);
	System.out.println(list);
}
}
