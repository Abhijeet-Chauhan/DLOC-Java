
public class code13 {
	int a,b; //this keyword will refer to global non static var of class
	code13(int a1, int b1){
//		this.x=x;
//		System.out.println("constructor "+x);
		this.a = a1;
		this.b = b1;
	}
public static void main(String[] args) {
	code13 c1 = new code13(10,20);
	System.out.println(c1.a+","+c1.b);
	System.out.println("main");
}
}
