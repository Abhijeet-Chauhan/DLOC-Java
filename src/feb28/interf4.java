package feb28;

public interface interf4 {
public void method1();
}

class H2{
	public static void main(String[] args) {
		interf4 i1 = ()->System.out.println("method 1");
		i1.method1();
	}
}