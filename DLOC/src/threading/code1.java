package threading;
//creaing thread
public class code1 extends Thread{
	
//assigning job to code1 using run()	
public void run() {
	for(int i=1; i<=10; i++) {
		System.out.println("my thread: "+i);
	}
}
}
