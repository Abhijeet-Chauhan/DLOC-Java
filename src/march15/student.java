package march15;

import java.util.ArrayList;

public class student {
String name;
int rollno;
student(String name, int rollno){
	this.name = name;
	this.rollno = rollno;
}
public String toString() {
	return "("+name+"-"+rollno+")";
}
public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add(new student("AAA",90));
	System.out.println(list);
}
}
