package march15;

import java.util.Vector;

public class vector1 {
public static void main(String[] args) {
//	Vector v1 = new Vector();
//	Vector v1 = new Vector(20);
	Vector v1 = new Vector(5,5);//create emty vector obj with inisl caapty anf incrementl ratio
	System.out.println(v1.capacity());
	for(int i=1; i<=6; i++) {
		v1.add(i);
	}
	System.out.println(v1.capacity());
	
	
	
}
}
