package batch55.practice_problems;

public class Bank {

	static final String bankName = "SBI";
	static double bankTotal = 0;
	
	String userName;
	String aadhar;
	String mobileNumber;
	double balance;
	
	
	public Bank() {}
	
	public Bank(String userName, String aadhar, String mobileNumber) {
		this.userName = userName;
		this.aadhar = aadhar;
		this.mobileNumber = mobileNumber;
		this.balance = 500.0;
		bankTotal += this.balance;
	}
	
	public void checkBalance() {
		System.out.println(this.balance);
	}
	
	public String deposite(double amount) {
		if(amount <= 0) {
			return "Amount should be greater than 0";
		}
		this.balance = this.balance + amount;
		
		bankTotal += amount;
		
		return amount + " amount is deposited and your current balance is " + this.balance;
	}
	
	public void withdraw(double amount) {
		
		if(amount <= 0) {
			System.out.println("Amount should be greater than 0");
			return;
		}
		
		if(this.balance < amount) {
			System.out.println("Your account balance is less than withdrawal amount");
			return;
		}
		
		this.balance = this.balance - amount;
		
		bankTotal -= amount;
		
		System.out.println(amount + " amount is withdraw and your current balance is " + this.balance);
	}
	
	

	@Override
	public String toString() {
		return bankName + " Bank [userName=" + userName + ", aadhar=" + aadhar + ", mobileNumber=" + mobileNumber + ", balance="
				+ balance + "]";
	}
	
}
