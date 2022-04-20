package lab.workshop.test;

import lab.workshop.biz.IShoppingBiz;
import lab.workshop.biz.ShoppingBiz;
import lab.workshop.util.CommonUtil;
 

public class ShoppingTest {

	public static void main(String[] args) {
		System.out.println("�ȳ��ϼ���~��ٱ��Ͽ� ��ǰ�� ��ƺ��ô�");
		IShoppingBiz biz = new ShoppingBiz();
		while(true) {
			printMenu();
			try {
			int menu = Integer.parseInt(CommonUtil.getUserInput());
			switch(menu) {
			case 9 :				
				System.out.println("���α׷��� �����մϴ�.Bye~ Bye~");				
				System.exit(0);
			case 1 :
				biz.printAllProducts();
				break;
			case 2 :
				biz.printPricePerProduct();
				break;
			case 3 :
				biz.calculateTotalPrice();
				break;
			default : 
				System.out.println("[����]�޴��� �߸� �Է��Ͽ����ϴ�.");
			}
			}catch(NumberFormatException e) {
				System.out.println("[����]�޴��� ���ڸ� �Է��ؾ��մϴ�.");
			}
		}//while end
		

	}//main end
	
	public static void printMenu() {
		System.out.println("=====<<�޴�>>=====");
		System.out.println("1.��ٱ��� ��� ���");
		System.out.println("2.ǰ�� ���� ���");
		System.out.println("3.�� ���� ���� ���");
		System.out.println("9.����");
		System.out.println("================== ");
		System.out.print("##�޴��Է�:");
	}

}
