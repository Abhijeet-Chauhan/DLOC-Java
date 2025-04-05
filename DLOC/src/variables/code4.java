package variables;

public class code4 {
	int x = 25;
	int y = 25;
	public static void main(String[] args) {
		code4 c = new code4();
		System.out.println(c.x==c.y);
		code4 c1 = new code4();
		System.out.println(c.x==c1.y);
		System.out.println(c==c1);
	}

}
