
public class const_overloading {
	const_overloading(){
		this(10);
		System.out.println("NO arg");
	}
	const_overloading(int i){
		this(11,22);
		System.out.println("1 arg"+i);
	}
	const_overloading(int i, int j){
		System.out.println("2 arg"+i+","+j);
	}
	public static void main(String[] args) {
		const_overloading c1 = new const_overloading();
	}
}