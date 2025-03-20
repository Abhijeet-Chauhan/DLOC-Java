// find number of digits and sum
package march7;

import java.util.Scanner;

public class code2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number: ");
	int num = sc.nextInt();
	int count = 0;
	int sum = 0;
	while(num>0) {
		count++;
		sum = sum+(num%10);
		num = num/10;
	}
	System.out.println("no of digits: "+count);
	System.out.println("sum "+sum);
}
}
