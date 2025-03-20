package march7;

import java.util.Scanner;

public class perfectnumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = sc.nextInt(); //Taking the input (integer) from the user
	int SumOfFactors = 0; // taking variable to calculate the sum of factors
	
	for(int i=1; i<num; i++) {  //loop to interate through all the values and we could know if the number divides the input
		if(num%i==0) {
			SumOfFactors += i;
		}
	}
	if(SumOfFactors==num) { //If the sum of factors is equal to input the number is perfect number
		System.out.println("The number "+num+" is perfect number.");
	}
	else {
		System.out.println("The number isn't the perfect number.");
	}
}
}
