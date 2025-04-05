package march1;
import java.util.*;
public class code1 {
public static void main(String[] args) {
	System.out.println("main");
	Scanner sc = new Scanner(System.in);
	System.out.println("enter deno");
	int d = sc.nextInt();
	try
	{
		System.out.println(100/d);
	}
//	catch(ArithmeticException e)
//	{	
//		e.printStackTrace();
//		e.getMessage();
//		System.out.println("catch block"+e);
//	}
	catch(Exception e)
	{	
		e.printStackTrace();
		e.getMessage();
		System.out.println("catch block"+e);
	}
	System.out.println("main end");
}
}
