package march1;

import java.util.Scanner;

public class code6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount you want to withdraw: ");
		int amt = sc.nextInt();
		int balance = 50000;
		if(amt>balance) {
			throw new OutOfBalException("Amount entered is more than balance: "+balance);
		}
		else {
			System.out.println("Can take out amount");
		}
	}
	}

	class OutOfBalException extends RuntimeException{
		OutOfBalException(String s){
			super(s);
		}
}

