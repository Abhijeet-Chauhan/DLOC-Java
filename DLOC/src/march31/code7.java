package march31;


interface I5{
	void m1();
	void m2();
}
public class code7 {
public static void main(String[] args) {
	I5 i=new I5() {
		public void m1() {
			System.out.println("m1");
		}
		public void m2() {
			System.out.println("m2");
		}
	};
	i.m1();
	i.m2();
}
}
