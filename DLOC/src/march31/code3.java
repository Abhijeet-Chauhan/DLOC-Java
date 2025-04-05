package march31;

interface i4{
	public int square(int i);
}


public class code3 {
	public static void main(String[] args) {
		i4 i=(x)->{
			return x*x;
		};
		int a = i.square(12);
		System.out.println(a);
	}
}
