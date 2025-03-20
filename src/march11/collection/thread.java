package march11.collection;

public class thread{

	public static void main(String[] args) {
		Runnable r = ()->{
			for(int i=1;i<=10;i++) {
				System.out.println("My new Thread");
			}
		};
		Thread t1 = new Thread(r);
		t1.start();
	}
}
