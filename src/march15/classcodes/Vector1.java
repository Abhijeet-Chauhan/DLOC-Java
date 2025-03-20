package march15.classcodes;


import java.util.Vector;

public class Vector1 {
public static void main(String[] args) {
	Vector v1=new Vector(5,5);
	System.out.println(v1.capacity());
	
	for(int i=1;i<=6;i++)
	{
		v1.add(i);
	}
	System.out.println(v1.capacity());
	for(int i=7;i<=11;i++)
	{
		v1.add(i);
	}
	System.out.println(v1.capacity());
	v1.addFirst(v1);
	v1.firstElement();
	v1.lastElement();
	v1.elementAt(0);
	v1.removeElement(v1);
	v1.removeAll(v1);
	
}
}
//Vector(Collection c)
