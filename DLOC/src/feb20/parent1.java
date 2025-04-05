package feb20;
//method overloading
//polymorphism: same name methods but functionality(same name diff forms)
public class parent1 {
public static void main(String[] args) {
	parent1 p1 = new parent1();
	
	p1.test1(); //method overloading- method call will be resolved by compiler
	p1.test1(23);
	p1.test1("abhi");
}
public void test1() {
	System.out.println("test1");
}

public void test1(int i) {
	System.out.println("test1 "+i);
}

public void test1(String s1) {
	System.out.println("test1 "+s1);
}

}
