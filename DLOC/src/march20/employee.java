package march20;

import java.util.TreeSet;

public class employee implements Comparable{
	String name;
	int id;
	int salary;
	String addr;
	public employee(String name, int id, int salary, String addr) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "employee [name=" + name + ", id=" + id + ", salary=" + salary + ", addr=" + addr + "]";
	}
	@Override
	public int compareTo(Object o) {
		employee emp = (employee)o;
		int val=0;
		val = this.name.compareTo(emp.name);
		return val;
	}
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(new collection1("abhi",1,10000));
		set.add(new collection1("om",2,20000));
		System.out.println(set);
	
	}
}
