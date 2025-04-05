package march31;
//Anonymous InnerClasses
public class code6 {
public static void main(String[] args) {
	Runnable r = new Runnable() {
		public void run() {
			for(int i=1; i<=10; i++) {
				System.out.println("child");
			}
		}
	};
	Thread t1 = new Thread(r);
	t1.start();
	for(int i=1; i<=10; i++) {
		System.out.println("main");
	}
}
}
