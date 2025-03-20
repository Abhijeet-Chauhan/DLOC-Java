package feb28;

public interface inter2 {
void test1();
void test2();
}

interface inter3 {
void test3();
void test4();
}

class s2 implements inter3{
	public void test3() {
		
		System.out.println("test3");
	}
	public void test4() {
		System.out.println("test4");
	}
}

class s1 extends s2 implements inter2{
	public void test1() {
		System.out.println("test1");
	}
	public void test2() {
		System.out.println("test2");
	}
}