package march1;

import java.util.Scanner;

public class code7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter pin: ");
		int pin = String.valueOf(sc.nextInt()).length();
//		if(pin < 1000 && pin > 9999) 
		if(pin>4) 
		{
			throw new OutOfDigitException("Pin is more than 4 digit");
		}
		else {
			System.out.println("Good to go!");
		}
	}
	}

	class OutOfDigitException extends RuntimeException{
		OutOfDigitException(String s){
			super(s);
		}
}
