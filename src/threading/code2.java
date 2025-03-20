package threading;

public class code2 implements Runnable{
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("child thread:"+i);
		}
	}
}
