package variables;

public class global {
	int a=30;//default value is assigned by jvm for both static and non static
	static int b=120;
	public static void main(String[] args) {
		global g = new global();
		System.out.println(g.a);//static can be called using ref
		System.out.println(b);
		System.out.println(global.b);
		System.out.println(g.b);
	}
}
