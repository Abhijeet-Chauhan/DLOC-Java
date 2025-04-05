package march6;

public class Mainwish {
public static void main(String[] args) {
	Display d1 = new Display();
	Thread1 t1= new Thread1(d1,"abc");
	Thread1 t2= new Thread1(d1,"def");	
	Thread1 t3= new Thread1(d1,"ffff");
	Thread1 t4= new Thread1(d1,"gggg");	
	t1.start();
	t2.start();
	t3.start();
	t4.start();
}
}
