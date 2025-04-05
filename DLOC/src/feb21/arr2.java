package feb21;

import java.util.Scanner;

public class arr2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("entere size");
	int size =sc.nextInt();
	int [] arr = new int[size];
	System.out.println("---------------");
	for(int i = 0; i<arr.length;i++) {
		System.out.println("enter ele at index: "+i);
		arr[i]=sc.nextInt();
		}
	
	System.out.println("--------------");
	int sum =0;
	for(int i = 0; i<arr.length;i++) {
		sum = sum + arr[i];
		}
	System.out.println("Sum: "+sum);
	
}
}

