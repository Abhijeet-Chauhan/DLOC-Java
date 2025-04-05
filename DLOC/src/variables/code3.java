package variables;

public class code3 {
	int a=45;
	static int b = 55;
	public static void main(String[] args) {
		code3 c = new code3();
		System.out.println(c.a+" "+c.b);
		c.a=100;
		c.b=200;
		code3 c1 = new code3();
		System.out.println(c1.a+" "+c1.b);
	}
}
