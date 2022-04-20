package lab.workshop.test;

import lab.workshop.biz.IShoppingBiz;
import lab.workshop.biz.ShoppingBiz;
import lab.workshop.util.CommonUtil;
 

public class ShoppingTest {

	public static void main(String[] args) {
		System.out.println("안녕하세요~장바구니에 상품을 담아봅시다");
		IShoppingBiz biz = new ShoppingBiz();
		while(true) {
			printMenu();
			try {
			int menu = Integer.parseInt(CommonUtil.getUserInput());
			switch(menu) {
			case 9 :				
				System.out.println("프로그램을 종료합니다.Bye~ Bye~");				
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
				System.out.println("[에러]메뉴를 잘못 입력하였습니다.");
			}
			}catch(NumberFormatException e) {
				System.out.println("[에러]메뉴는 숫자만 입력해야합니다.");
			}
		}//while end
		

	}//main end
	
	public static void printMenu() {
		System.out.println("=====<<메뉴>>=====");
		System.out.println("1.장바구니 목록 출력");
		System.out.println("2.품목별 가격 출력");
		System.out.println("3.총 구입 가격 출력");
		System.out.println("9.종료");
		System.out.println("================== ");
		System.out.print("##메뉴입력:");
	}

}
