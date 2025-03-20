
public class code12 {
	int x; //this keyword will refer to global non static var of class
	code12(int x){
		this.x=x;
		System.out.println("constructor "+x);
	}
public static void main(String[] args) {
	code12 c1 = new code12(12);
	System.out.println(c1.x);
	System.out.println("main");
	code12 c2 = new code12(100);
	System.out.println(c2.x);
}
}
