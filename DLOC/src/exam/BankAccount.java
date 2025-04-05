package exam;

import java.util.Scanner;

//creating interface
interface  Account{
	void deposit(float amount);
	void withdraw(float amount);
	float checkbalance();
}

//creating savings account
class savingAccount implements Account{
	private float balance=0;
	public void deposit(float amount) {
		balance += amount;
		System.out.println("Deposited amount: "+amount);
	}
	
	public void withdraw(float amount) {
		if(amount<balance) {
			balance-=amount;
			System.out.println("Withdrawn amount: "+amount);
		}else {
			System.out.println("Insufficient funds!!");
		}
	}
	public float checkbalance() {
		return balance;
	}
}

//creating savings account
class currentAccount implements Account{
	private float balance=0;
	public void deposit(float amount) {
		balance += amount;
		System.out.println("Deposited amount: "+amount);
	}
	
	public void withdraw(float amount) {
			balance-=amount;
			System.out.println("Withdrawn amount: "+amount);
	}
	public float checkbalance() {
		return balance;
	}
}


 public class BankAccount{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account type:");
		System.out.println("1. Savings\n2. Current");
		int choice = sc.nextInt();
		Account ac=null;
			if(choice == 1 | choice ==2) {
				if(choice == 1) {
					ac = new savingAccount();
				}
				else {
					 ac = new currentAccount();
				}
			}
			else {
				System.out.println("Try again");
			}
		
		while(true) {
			 System.out.println("Choose an option:");
	          System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
	          int option = sc.nextInt();
	          switch(option) {
	          case 1:
	        	  System.out.print("Enter deposit amount: ");
	        	  float Damount = sc.nextFloat();
	        	  ac.deposit(Damount);
	        	  break;
	        	  
	          case 2:
                  System.out.print("Enter withdrawal amount: ");
                  float Wamount = sc.nextFloat();
                  ac.withdraw(Wamount);
                  break;

              case 3:
                  System.out.println("Current Balance: " + ac.checkbalance());
                  break;

              case 4:
                  System.out.println("Thank you, visit us again!!");
                  return;

              default:
                  System.out.println("Try again");
	          }
	          }
		}
		
	}

