package march6;

public class Thread1 extends Thread{
	Display d;
	String name;
	
	Thread1(Display d, String name){
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}

}
