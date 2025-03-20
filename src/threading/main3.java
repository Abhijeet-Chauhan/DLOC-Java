package threading;

public class main3 {
	public static void main(String [] args) {
		trainenquiry e1 = new trainenquiry();
		seatenquiry e2 = new seatenquiry();
		Thread seatenquiry = new Thread(e2);
		
		e1.start();
		seatenquiry.start();
		}
}
