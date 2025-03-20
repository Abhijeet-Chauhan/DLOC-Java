
import java.util.Scanner;
public class prime {
public static void main(String[] args) {
	System.out.println("Enter number");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	if(isPrime(num)) {
		System.out.println(num+" is prime");
	}
	else {
		System.out.println(num+" is not prime");
	}
//	System.out.println(fact(num));
}
public static boolean isPrime(int i) {
	boolean prime=true;
	for(int x=2; x<i; x++) {
		if(i%x==0) {
			prime=false;
			break;
		}
	}
	return prime;
}
//public static int fact(int j) {
//	int k=0;
//	for(int x=2; x<j; x++) {
//		if(j%x==0) {
//			k = k+1;
//		}
//	}
//	return k;
//}
}