package march15.classcodes;


import java.util.TreeSet;

 class EmployeeObj implements Comparable{
	int eno;
	String ename;
	float esal;
	String eaddr;
	
	EmployeeObj(int eno,String ename,float esal,String eaddr)
	{
		this.eno=eno;
		this.ename=ename;
		this.esal=esal;
		this.eaddr=eaddr;
	}
	public int compareTo(Object obj)
	{
		EmployeeObj emp=(EmployeeObj)obj;
		int val=0;
		val=this.ename.compareTo(emp.ename);
		return -val;
	}
	
	public String toString()
	{
		return "\nEmployee{"+"eno : "+eno+" ,ename : "+ename
				+",esal : "+esal+",eaddr : "+eaddr+"}";
	}
}
class Test1
{
public static void main(String[] args) {
	EmployeeObj e1=new EmployeeObj(111, "ABC", 67000, "Mumbai");
	EmployeeObj e2=new EmployeeObj(222, "DEF", 37000, "Bangalore");
	EmployeeObj e3=new EmployeeObj(333, "XYZ", 78000, "Pune");
	EmployeeObj e4=new EmployeeObj(444, "KKK", 90000, "Mumbai");
	
	TreeSet set=new TreeSet();
	set.add(e1);
	set.add(e2);
	set.add(e3);
	set.add(e4);
	
	System.out.println(set);
	
}
}
