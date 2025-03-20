package march11;

class B{
	boolean flag = true;
	int batch =0;
	public synchronized void enroll()
	{
		try {
			while(true) {
				if(flag==true) {
					for(int i=1; i<6; i++) {
						batch += 1;
						System.out.println("Batch enrolled: "+batch);
					}
					
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
	public synchronized void train() {
		int temp=(batch-4);
		try {
			while(true) {
				if(flag==true){
					wait();
				}
				else {
					for(int i=1; i<6; i++) {
						System.out.println("Trained batch: "+temp);
						temp+=1;
					}
					
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

class Enrollment extends Thread{
	B a;
	Enrollment(B a){
		this.a = a;
	}
	public void run() {
		
		a.enroll();
	}
}

class Training extends Thread{
	B a;
	Training(B a){
		this.a = a;
	}
	public void run() {
		a.train();
	}
}
public class code2 {
	public static void main(String[] args) {
		B a = new B();
		Enrollment e = new Enrollment(a);
		Training t = new Training(a);
		e.start();
		t.start();
		
	}
}
