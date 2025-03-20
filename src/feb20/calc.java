package feb20;

public class calc extends calculator{
	public static void main(String[] args) {
		sum(1,2,1);
		diff(2,1);
		prod(2,3,2);
		div(10,5);
	}
	public static void sum(int i, int j, int k) {
		System.out.println("Sum: "+(i+j+k));
	}
	public static void prod(int i, int j, int k) {
		System.out.println("Product: "+(i*j*k));
	}
}


