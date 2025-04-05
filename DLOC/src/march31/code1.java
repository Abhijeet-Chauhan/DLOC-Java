package march31;
interface i1{
	public void method1();
}
public class code1 {
	public static void main(String[] args) {
		i1 i= ()->{
			System.out.println("method 1");
			System.out.println("method 1 line 2");
		};
		i.method1();
	}
}
