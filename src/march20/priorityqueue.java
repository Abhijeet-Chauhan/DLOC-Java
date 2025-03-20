package march20;

import java.util.PriorityQueue;

public class priorityqueue {
public static void main(String[] args) {
	PriorityQueue pq = new PriorityQueue();
	
	pq.add("B");
	pq.add("D");
	pq.add("V");
	pq.add("B");
	pq.add("A");
	System.out.println(pq);
	pq.add("B");
	System.out.println(pq);
//	pq.add(null); java.lang.NullPointerException
//	System.out.println(pq);
//	pq.add(123); Exception in thread "main" java.lang.ClassCastException:
//	System.out.println(pq);
//	pq.add(new StringBuffer("aBC"));
	
	StringBuffer sb = new StringBuffer("hello");
	sb.append("ahvjh");
	System.out.println(sb);
}
}
