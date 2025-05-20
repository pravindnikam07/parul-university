package batch55.practice_problems;

public class BankRunner {

	public static void main(String[] args) {
		
		System.out.println(Bank.bankTotal);
		
		System.out.println("=============== Rahul bank account =============");
		Bank rahul = new Bank("Rahul", "987654321012", "99999999999");
		
		rahul.checkBalance(); 						// 500.0
		
		System.out.println(rahul);					// rahul Bank object is getting printed
		
		String message = rahul.deposite(1000);		// 1500.0
		System.out.println(message);				// message is getting printed
		
		rahul.checkBalance();						// 1500.0
		
		System.out.println(rahul);					// rahul Bank object is getting printed
		
		rahul.withdraw(1500);						// message is getting printed and your balance is getting updated
		rahul.deposite(15000);
		
		
		System.out.println("=============== Raj bank account =============");
		
		Bank raj = new Bank("Raj", "123456789012", "9999999998");
		
		raj.checkBalance(); 						// 500.0
		System.out.println(raj);
		raj.withdraw(450);
		
		raj.withdraw(50);
		String messageRaj = raj.deposite(100000);
		System.out.println(messageRaj);

		String messageRaj1 = raj.deposite(20000);
		System.out.println(messageRaj1);
		
		raj.checkBalance();
		
		
		
		System.out.println("=============== bank account =============");
		System.out.println(Bank.bankTotal);
		
	}

}
