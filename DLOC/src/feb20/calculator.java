package feb20;

public class calculator {
	public static void main(String[] args) {
		sum(1,2);
		diff(2,1);
		prod(2,3);
		div(10,5);
	}
	public static void sum(int i, int j) {
		System.out.println("Sum: "+(i+j));
	}
	
	public static void diff(int i, int j) {
		System.out.println("Difference: "+(i-j));
	}
	
	public static void prod(int i, int j) {
		System.out.println("Product: "+(i*j));
	}
	
	public static void div(int i, int j) {
		if(j==0) {
			System.out.println("Error");
		}
		else {
			System.out.println("Division: "+(i/j));
		}
	}
}
