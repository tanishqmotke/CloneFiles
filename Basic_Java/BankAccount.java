package Basic_Java;

import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {

		String Name;
		String EmailId;
		int MobileNo;
		String Bank;
		String IFSCCode;
		int AccountNumber;
		int MainBalance;
		int length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Name");
		Name = sc.nextLine();
		System.out.println("Email ID");
		EmailId = sc.nextLine();
		System.out.println("Mobile No");
		MobileNo = sc.nextInt();
		length=lengthof(MobileNo).length();
		boolean t=true;
		while(t) {
			if(length==10) {
				t=false;
				
			}
			else {
				System.out.println("ENTER A VALID NUMBER :"); 
				MobileNo=sc.nextInt();
			}
		}
		Customer customer = new Customer(); // i have created the object here because the data i have taken from the
											// customer should be saved.
		customer.setCustomerDetails(Name, EmailId, MobileNo);

		
		
		System.out.println("Enter your bank details");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Bank Name");
		Bank = sc1.nextLine();
		System.out.println("IFSC Code");
		IFSCCode = sc1.nextLine();
		System.out.println("Account Number");
		AccountNumber = sc1.nextInt();
		System.out.println("Main Balance");
		MainBalance = sc1.nextInt();
		Bank bank = new Bank();
		bank.setBankDetails(Bank, IFSCCode, AccountNumber, MainBalance);

		boolean i = true;
		while (i) {
			System.out.println("1.View Details" + "\n" + "2.Deposit" + "\n" + "3.Withdraw");
			Scanner sc2 = new Scanner(System.in);
			int j = sc.nextInt();
			switch (j) {
			case 1:
				customer.display();
				bank.display();
				System.out.println("");
				break;
			case 2:
				Scanner sc3 = new Scanner(System.in);
				System.out.println("Enter the Amount :");
				int Deposit = sc.nextInt();
				// MainBalance=MainBalance+Deposit;
				Deposit d = new Deposit();
				d.setdeposit(Deposit);
				d.display();

				break;
			case 3:
				Scanner sc4 = new Scanner(System.in);
				System.out.println("Enter the Amount :");
				int Withdraw = sc4.nextInt();
				// MainBalance=MainBalance-Withdraw;
				Withdraw wd = new Withdraw();
				wd.getWithdraw(Withdraw);
				wd.display();
				break;
			case 4:
				i = false;
				System.out.println("Thank you");
				break;
			}
		}
	}

	private static String lengthof(int mobileNo) {
		// TODO Auto-generated method stub
		return null;
	}
}

class Bank {
	String BankName;
	String IFSCCode;
	int AccountNumber;
	static int MainBalance;
	public void setBankDetails(String BankName, String IFSCCode, int AccountNumber, int MainBalance) {
		this.BankName = BankName;
		this.IFSCCode = IFSCCode;
		this.AccountNumber = AccountNumber;
		Bank.MainBalance = MainBalance;
	}
	public void display() {
		System.out.println("BANK NAME :" + BankName + "\n" + "IFSC Code:" + "\n" + "Account Number:" + AccountNumber
				+ "\n" + "Main Balance :" + MainBalance);
	}
}

class Customer extends Bank {
	String Name;
    String EmailId;
	int MobileNo;
	public void setCustomerDetails(String Name, String EmailId, int MobileNo) {
		this.Name=Name;
		this.EmailId = EmailId;
		this.MobileNo = MobileNo;
	}
	public void display() {
		System.out.println("NAME " + Name + "\n" + "Email ID " + EmailId + "\n" + "MobileNo " + MobileNo);
	}
}

class Deposit extends Bank {
	private int Deposit;
	public void setdeposit(int Deposit) {
		this.Deposit = Deposit;
		MainBalance +=Deposit;
		System.out.println("Mainbalance" + MainBalance);
	}
	public void display() {
		System.out.println("Deposit :" + Deposit);
	}
}

class Withdraw extends Bank {
	private int Withdraw;
	public void getWithdraw(int Withdraw) {
		this.Withdraw = Withdraw;
		MainBalance-= Withdraw;
		System.out.println("Mainbalance: "+MainBalance);
	}
	public void display() {
		System.out.println("Withdraw: " + Withdraw);
	}
}