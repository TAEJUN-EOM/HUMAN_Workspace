package lab.workshop.account;

import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {
		Account cust1 = new Account("CUST01", "소지섭", "1-22-333", 100000);
		cust1.printAccount();
		while (true) {
			int menu = getMenuItem();
			if (menu == 9) {
				System.out.println("Bye~~~");
				break;
			}
			int amount = 0;
			switch (menu) {
			case 1:
				amount = getAmount();
				System.out.println(amount + "원을 입금합니다.");
				cust1.addBalance(amount);
				System.out.println("=====================");
				System.out.println("현재 잔액 : "+ cust1.getBalance());
				System.out.println("=====================");
				break;
			case 2:
				amount = getAmount();
				System.out.println(amount + "원을 출금합니다.");
				cust1.substractBalance(amount);
				System.out.println("=====================");
				System.out.println("현재 잔액 : "+ cust1.getBalance());
				System.out.println("=====================");
				break;

			}
		}
	}

	public static int getUserInput() {
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}

	public static int getMenuItem() {
		System.out.println("[Menu]");
		System.out.println("1. 입금");
		System.out.println("2. 출금");
		System.out.println("9. 종료");
		System.out.print("==> Menu 선택 : ");
		return getUserInput();
	}

	public static int getAmount() {
		System.out.print("금액 :");
		return getUserInput();
	}
}
