package march1;

import java.util.Scanner;

public class code5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println();
	int age = sc.nextInt();
	
	if(age>60) {
		throw new TooOldException("Your age isn higher"+age);
	}
	else if(age<18) {
		throw new TooYoungException("Your age isn lower"+age);
	}
	else {
		System.out.println("look out for match");
	}
}
}

class TooOldException extends RuntimeException{
	TooOldException(String s){
		super(s);
	}
}

class TooYoungException extends RuntimeException{
	TooYoungException(String s){
		super(s);
	}
}