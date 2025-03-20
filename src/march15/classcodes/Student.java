package march15.classcodes;


import java.util.ArrayList;
import java.util.Vector;

public class Student {
String name;
int rollNo;
Student(String name,int rollno)
{
	this.name=name;
	this.rollNo=rollno;
}
public String toString()
{
	return "("+name+" - "+rollNo+")";
}
public static void main(String[] args) {
ArrayList list=new ArrayList();

	list.add(new Student("AAA",90));
	list.add(new Student("BBB",22));
	list.add(new Student("CCC",33));
	list.add(new Student("DDD",44));
	list.add(new Student("EEE",55));
	System.out.println(list);
	
	Vector v1=new Vector();
//	Vector v1=new Vector(20);
//	Vector v1=new Vector(5,5);
	
}
}
//New_capacity = 2*Current_Capacity
