import java.util.Scanner;
public class summing {
public static void main(String[] args) {
	int sum =0;
	String option = "y";
	while(option=="y") {
		Scanner sc = new Scanner(System.in);
		System.out.println("NUM 1:");
		int num1;
		num1=sc.nextInt();
		System.out.println("NUM 2:");
		int num2;
		num2=sc.nextInt();
		
		sum =  + num1 + num2;
		System.out.println("sum "+sum);
		System.out.println("Do you want to continue?");		
	}
	
}
}
