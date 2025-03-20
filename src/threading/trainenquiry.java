package threading;

public class trainenquiry extends Thread{
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Train Enuiry: "+i);
		}
	}
}
