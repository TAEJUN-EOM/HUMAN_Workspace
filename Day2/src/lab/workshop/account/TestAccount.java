package lab.workshop.account;

import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {
		Account cust1 = new Account("CUST01", "������", "1-22-333", 100000);
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
				System.out.println(amount + "���� �Ա��մϴ�.");
				cust1.addBalance(amount);
				System.out.println("=====================");
				System.out.println("���� �ܾ� : "+ cust1.getBalance());
				System.out.println("=====================");
				break;
			case 2:
				amount = getAmount();
				System.out.println(amount + "���� ����մϴ�.");
				cust1.substractBalance(amount);
				System.out.println("=====================");
				System.out.println("���� �ܾ� : "+ cust1.getBalance());
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
		System.out.println("1. �Ա�");
		System.out.println("2. ���");
		System.out.println("9. ����");
		System.out.print("==> Menu ���� : ");
		return getUserInput();
	}

	public static int getAmount() {
		System.out.print("�ݾ� :");
		return getUserInput();
	}
}
