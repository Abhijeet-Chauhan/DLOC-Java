package march6;

public class Display {
synchronized public void wish(String name) {
	for(int i=1; i<=10; i++) {
		System.out.println("Good morning: "+name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
	}
}
}
