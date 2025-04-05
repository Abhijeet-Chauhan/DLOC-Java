package march7;

import java.util.Scanner;

public class palindrome {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int num = sc.nextInt();//Taking the input (integer) from the user
	int temp = num; //storing original number for futher verification
	int digit=0; //for storing last digit
	int palindrome = 0; //for palindorme
	while(num>0) {
		digit = num%10;
		palindrome = palindrome*10 + digit; //multiplying by 10 so that we get the power of the numnber
		num = num /10;
	}
	if(temp==palindrome) {
		System.out.println("The number "+palindrome+" is palindrome");
	}
	else {
		System.out.println("The number isn't the palindrome");
	}
	
}
}
