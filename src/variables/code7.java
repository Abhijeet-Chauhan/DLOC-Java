package variables;

public class code7 {
	code7(){
		this(10);
		System.out.println("NO arg");
	}
	code7(int i){
		this(11,22);
		System.out.println("1 arg"+i);
	}
	code7(int i, int j){
		System.out.println("2 arg"+i+","+j);
	}
	public static void main(String[] args) {
		code7 c1 = new code7();
	}
}
