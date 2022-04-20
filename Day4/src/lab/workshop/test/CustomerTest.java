package lab.workshop.test;

import lab.workshop.biz.CustomerBiz;
import lab.workshop.biz.ICustomerBiz;
import lab.workshop.util.CustomerUtil;

public class CustomerTest {

	public static void main(String[] args) {
		ICustomerBiz biz = new CustomerBiz();
		biz.initializeCustomer();
		while(true) {
			printMenu();
			String menu = CustomerUtil.getUserInput();
			if(menu.equals("9")) {
				System.out.println("----------------------");
				System.out.println("���α׷��� �����մϴ�.Bye~");
				System.out.println("----------------------");
				break;
			}else if(menu.equals("1")) {
				 biz.printAllCustomer();
			}else if(menu.equals("2")) {
				 biz.insertCustomer();
			}else if(menu.equals("3")) {
				 biz.deleteCustomer();
			}				
		}
	}
	public static void printMenu() {
		System.out.println("===<<�� ���� ���α׷�>>===");
		System.out.println("1.��ü �� ���� ��ȸ");
		System.out.println("2.�� ���� �߰�");
		System.out.println("3.�� ���� ����");
		System.out.println("9.�ý��� ����");
		System.out.println("========================");
		System.out.print("##�޴��Է�:");
	}

}
