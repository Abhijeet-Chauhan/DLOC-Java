package march11;
//producer consumer
class A{
	boolean flag = true;
	int count =0;
	public synchronized void produce()
	{
		try {
			while(true) {
				if(flag==true) {
					count += 1;
					System.out.println("Produced item: "+count);
					flag=false;
					notify();
					wait();
				}
				else {
					wait();
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public synchronized void consume() {
		try {
			while(true) {
				if(flag==true) {
					wait();
				}
				else {
					System.out.println("consumed item "+count);
					flag=true;
					notify();
					wait();
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class Producer extends Thread{
	A a;
	Producer(A a){
		this.a = a;
	}
	public void run() {
		
		a.produce();
	}
}

class Consumer extends Thread{
	A a;
	Consumer(A a){
		this.a = a;
	}
	public void run() {
		a.consume();
	}
}
public class code1 {
public static void main(String[] args) {
	A a = new A();
	Producer p = new Producer(a);
	Consumer c = new Consumer(a);
	p.start();
	c.start();
	
}
}
