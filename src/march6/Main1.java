package march6;


public class Main1 {
public static void main(String[] args) throws InterruptedException
{
	System.out.println("main begin");
code1 c1=new code1();
c1.start();
//Thread.sleep(2000);
c1.join(); //till child is complted main has to wait
System.out.println(c1.sum);
//c1.interrupt();
}
}
