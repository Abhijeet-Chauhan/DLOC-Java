package threading;

public class main1 {
	public static void main(String[] args) {
		code1 c1 = new code1();
//		thread schedular
		c1.start();
		for(int i=1; i<=10; i++) {
			System.out.println("main thread: "+i);
		}
	}
}
