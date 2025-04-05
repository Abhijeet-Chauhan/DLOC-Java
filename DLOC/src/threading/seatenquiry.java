package threading;

public class seatenquiry implements Runnable{
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Seat enquiry:"+i);
		}
	}
}
