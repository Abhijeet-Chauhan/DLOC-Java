
public class A12 {
	static int a = 100;
	int b = 200;
	static int c = 300;
	int d = 400;
public static void main(String[] args) {
	A12 ref = new A12();
	System.out.println(a);
	System.out.println(c);
	System.out.println(A12.a);
	System.out.println(A12.c);
	System.out.println(ref.b);
	System.out.println(ref.d);
	
	String s1 = new String("Abhoi");
	String s2 = new String("Abhoi");
	s1 = s2;
	int i = 3;
	int j = 3;
	A12 a = new A12();
	A12 c = new A12();
	
	System.out.println(a.b == a.d);
	System.out.println(i==j);
	System.out.println(s1==s2);
}
}