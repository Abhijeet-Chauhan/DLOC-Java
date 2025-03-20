package pack1;

public class A {
	public static void main(String[] args) {
		A t = new A();
		t.test1();
		t.test2();
		t.test3();
		t.test4();
	}
	public void test1() {
		System.out.println("test1");
	}
	
	private void test2() {
		System.out.println("test2");
	}

	void test3() {
		System.out.println("test3");
	}
	
	 protected void test4() {
		System.out.println("test4");
	}

}
