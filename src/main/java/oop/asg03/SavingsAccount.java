//8.6

package asg03;

public class SavingsAccount {
	public static void main (String[] args) {
	    Account account = new Account(0, 0, 0.04);

	    account.withdraw(0);
	    account.deposit(0);
	    System.out.println("Balance is " + account.getBalance());
	    System.out.println("Monthly interest is " +
	      account.getMonthlyInterest());
	  }
	}

	class Account {
	  private int id;
	  private double balance;
	  private double annualInterestRate;

	  public Account() {
	  }

	  public Account(int id, double balance, double annualInterestRate) {
	    this.id = id;
	    this.balance = balance;
	    this.annualInterestRate = annualInterestRate;
	  }

	  public int getId() {
	    return this.id;
	  }

	  public double getBalance() {
	    return balance;
	  }

	  public double getAnnualInterestRate() {
	    return annualInterestRate;
	  }

	  public void setId(int id) {
	    this.id =id;
	  }

	  public void setBalance(double balance) {
	    this.balance = balance;
	  }

	  public void setAnnualInterestRate(double annualInterestRate) {
	    this.annualInterestRate = annualInterestRate;
	  }

	  public double getMonthlyInterest() {
	    return balance*(annualInterestRate/12);
	  }

	  public void withdraw(double amount) {
	    balance -= amount;
	  }

	  public void deposit(double amount) {
	    balance += amount;
	  }
}
