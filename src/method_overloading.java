
public class method_overloading {
	public static void main(String[] args) {
		add(12,23);
		add("riya","patel");
		add(23,4.5);
		add(33,44,55);
}
	public static void add(int i, double j) {
		System.out.println(i+j);
	}
	public static void add(int i, int j) {
		System.out.println(i+j);
	}
	public static void add(String i, String j) {
		System.out.println(i+" "+j);
	}
	
	public static void add(int i, int j, int k) {
		System.out.println(i+j+k);
	}
}
