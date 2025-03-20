//armstrong number
package march7;
import java.util.Scanner;

public class code3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();//Taking the input (integer) from the user
        
        int n = num;//storing original number for futher verification
        int arm = 0;
        
        while(num > 0) {
            int d = num % 10; 
            arm = arm + (d * d * d);   //multiplying by cube of last digit
            num = num/10;  
        }
        
        if (arm == n) {
            System.out.println(n + " is armstrong");
        } else {
            System.out.println("Not armstrong");
        }
    }
}
