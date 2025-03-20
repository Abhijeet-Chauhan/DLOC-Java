package feb21;
//multilevel inheritance
public class code6 extends Object {
	public void test() {
		System.out.println("test()");
	}
}
class c1 extends code6{
	public static void main(String[] args) {
		c1 c = new c1();
		c.test();
	}
}
class c2 extends c1{
	
}
