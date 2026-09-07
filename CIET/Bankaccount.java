/*
package CIET;
 

public class Bankaccount {
	private String accountHolder;
	private int accountNumber;
	private double balance;
	Bankaccount(String accountHolder,int accountNumber,double balance){
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println(amount);
		}else {
			System.out.println("Invaild amout");
		}
	}
	void withdraw(double amount) {
		if(amount<=0) {
			System.out.println("invaild withdrawl amount");
		}else if(amount<=balance) {
			balance=balance-amount;
			System.out.println(amount+ "withdraw successful");
		}else {
			System.out.println("insufficient balance");
	}
	void displayBalance() {
		System.out.println("\n----Account holder details");
		System.out.println(accountHolder);
		System.out.println(accountNumber);
		System.out.println(balance);
	}

}
public void main(String[] args) {
	Bankaccount account=new Bankaccount("chandan",1234567890,5000);
	account.displayBalance();
	account.deposit(2000);
	account.displayBalance();
	account.withdraw(1500);
	account.displayBalance();
	account.withdraw(10000);
}
}
*/