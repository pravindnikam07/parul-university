package batch55.practice_problems;

import java.util.Arrays;
import java.util.Scanner;

public class _1Problem {

	public static void main(String[] args) {
		
		// dataType[] variable_name = new dataType[size];
		
		Bank[] accounts = new Bank[5];
		
		accounts[0] = new Bank("Kamlesh", "5678901236745", "09876543211");
		accounts[1] = new Bank("Jhon", "123674598768", "99876543211");
		accounts[2] = new Bank("David", "786560123675", "89776543211");
		accounts[3] = new Bank("Aman", "983674598768", "78876543211");
		accounts[4] = new Bank("Nrupul", "932674598768", "677876543211");
		
		Scanner input = new Scanner(System.in);
		for(Bank account : accounts) {
			double depositeAmount = input.nextDouble();
			if(depositeAmount == 1000) {
				depositeAmount += 100;
			}
			account.deposite(depositeAmount);
			
			System.out.println(account);
		}
		
		input.close();
		
		
		accounts[0].deposite(1000);
		
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i] != null)
				System.out.println("Name " + accounts[i].userName + " | balance " + accounts[i].balance);
		}
		
		System.out.println("============");
		
		System.out.println(Arrays.toString(accounts));
		
		
		
		
		// WAP to create students class array
		
		
		
		
		
	}
}