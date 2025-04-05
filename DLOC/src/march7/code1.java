//sum of 2 numbers
package march7;
import java.util.Scanner;
public class code1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number: ");
	int n = sc.nextInt();
	int[] arr = { 1, 2, 3, 4, 5,6,7,8,9 };
	for(int i=0; i<arr.length; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i]+arr[j]==n) {
				System.out.println(arr[i]+","+arr[j]);
			}
		}
	}
//	while(i<arr.length) {
//		if(arr[i]+arr[i+1]==)
//	}
//	
}
	
}
