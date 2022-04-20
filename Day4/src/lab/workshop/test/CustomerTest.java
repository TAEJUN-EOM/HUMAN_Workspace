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
				System.out.println("프로그램을 종료합니다.Bye~");
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
		System.out.println("===<<고객 관리 프로그램>>===");
		System.out.println("1.전체 고객 정보 조회");
		System.out.println("2.고객 정보 추가");
		System.out.println("3.고객 정보 삭제");
		System.out.println("9.시스템 종료");
		System.out.println("========================");
		System.out.print("##메뉴입력:");
	}

}
