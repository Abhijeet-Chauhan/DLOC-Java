package march7;

import java.util.Scanner;

public class primeseries {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the range: ");
	int range = sc.nextInt();//Taking the input (integer) from the user
	System.out.println("The prime numbers are: ");
	for(int i=2; i<=range; i++) { //first for loop to iter through the range
		boolean prime = true; //will assume if the number is prime 
		for(int j = 2; j<i; j++) { //2nd for loop to get the all range of numbers for i
			if(i%j==0) { //now if i gets divided by j then we would declare its as  flase and will break 
				prime = false;
				break;
			}
		}
		if(prime==true) {
			System.out.println(i);
		}
	}
}
}
