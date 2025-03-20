import java.util.Scanner;
public class factors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int n= sc.nextInt();
		factors(n);
		sumoffactors(n);
		count(n);
	}
	public static void factors(int num) {
		System.out.println("Factors are:");
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.print(i+""+"\n");
			}
		}
	}
	public static void sumoffactors(int num) {
		int sum = 0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				sum = sum + i;
			}
		}

		System.out.println("---------------");
		System.out.print("Sum:");
		System.out.println(sum);
	}
	public static void count(int num) {
		int c = 0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				c = c + 1;
			}
		}
		System.out.println("---------------");
		System.out.print("Count:");
		System.out.println(c);
	}
	
}
