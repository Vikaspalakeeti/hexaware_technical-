package ui;
import java.util.Scanner;

import com.hdfc.service.IBank;

import util.BankUtil;

public class AtmUI {
	public static void main(String[] args) {
		System.out.println("Welcome to ATM");
		System.out.println("1 . deposit");
		
		System.out.println("2. Withdraw");
		System.out.println("Exit");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		IBank bank = BankUtil.getBankObj();
		switch (choice) {
		case 1: //withdraw
				bank.withdraw();
			break;
		case 2: //  deposit
			bank.deposit();
			break;
		case 3:  //exit
			break;
		
		default:
			//throw new IllegalArgumentException("Unexpected value: " + choice);
			System.err.println("Invalid input");
		}
		
		
		
	}
	

}
