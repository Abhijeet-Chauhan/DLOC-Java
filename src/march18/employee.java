package march18;

public class employee implements Comparable<employee>{
	String name;
	String dept;
	int id;
	int sal;
	public employee(String name, String dept, int id, int sal) {
		super();
		this.name = name;
		this.dept = dept;
		this.id = id;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "employee [name=" + name + ", dept=" + dept + ", id=" + id +", sal=" + sal + "]";
	}
	
	public int compareTo(employee other) {
		return this.sal-other.sal;
	}
}
