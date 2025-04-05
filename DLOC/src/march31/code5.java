package march31;
//multithreading wrt lambda exp
//class Thread1 implements Runnable{
//	public void run()
//	{
//	for(int i=1; i<=10; i++) {
//		System.out.println("child");
//	}
//}
//}
public class code5 {
public static void main(String[] args) {
//	Thread1 t1 = new Thread1();
//	Thread t2= new Thread(t1);
//	t2.start();
	
	Runnable r = ()->{
		for(int i=1; i<=10; i++) {
			System.out.println("child");
		}
	};
}
}

