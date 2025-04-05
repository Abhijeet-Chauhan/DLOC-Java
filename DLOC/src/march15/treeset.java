package march15;

import java.util.TreeSet;

public class treeset implements Comparable {
	String name;
	int id;
	float salary;
	String addr;
	
	treeset(String name, int id, float salary, String addr){
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.addr = addr;
	}
	public int compareTo(Object obj) {
		treeset empp=(treeset)obj;
		int val=0;
		val=this.name.compareTo(empp.name);
		return val;
	}
	public String toString() {
		return "("+name+": "+id+": "+salary+": "+addr+")";
	}
public static void main(String[] args) {
	TreeSet set = new TreeSet();
	set.add(new treeset("abhi",1,10000,"Boisar"));
	set.add(new treeset("om",2,20000,"Boisar"));
	System.out.println(set);
}
}
