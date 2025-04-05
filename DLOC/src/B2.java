
public class B2 {
	int x = 25;
	int y = 25;
	public static void main(String[] args) {
		B2 b = new B2();
		System.out.println(b.x=b.y);
		B2 b1 = new B2();
		System.out.println(b==b1);
		System.out.println(b);
		System.out.println(b1);
		
		b=b1;
		System.out.println(b==b1);
		System.out.println(b);
		System.out.println(b1);
	}
}
