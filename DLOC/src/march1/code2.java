package march1;

import java.util.Scanner;

public class code2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	try {
		System.out.println("enter string");
	String s = sc.next();
	System.out.println("enter int");
	int num = sc.nextInt();
	int [] arr = {1,2,4};
	System.out.println("enter index");
	int index = sc.nextInt();
	System.out.println(arr[index]);
	}
	catch(ArithmeticException e)
	{	
		e.printStackTrace();
		e.getMessage();
		System.out.println("catch block"+e);
	}
	catch(NullPointerException e)
	{	
		e.printStackTrace();
		e.getMessage();
		System.out.println("catch block"+e);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{	
		e.printStackTrace();
		e.getMessage();
		System.out.println("catch block"+e);
	}
}
}
