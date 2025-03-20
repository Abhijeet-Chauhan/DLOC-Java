package threading;

public class main2 {
public static void main(String [] args) {
	code2 c1 = new code2();
	Thread c2 = new Thread(c1);
	c2.start();
	for(int i=1; i<=10; i++) {
		System.out.println("main thread:"+i);
	}
}
}
