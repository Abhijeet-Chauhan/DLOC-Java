
public class question3 {
	public static void main(String[] args) {
		float f = 4.5f;
		long l = 1234;
		
		f = l; // exception can store long into float
		
		System.out.println(f);
//		l = f; cannot store float into long
	}
}
