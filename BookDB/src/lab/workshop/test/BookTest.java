package lab.workshop.test;

import lab.workshop.biz.BookBiz;
 
import lab.workshop.util.BookUtil;

public class BookTest {

	public static void main(String[] args) {
		BookBiz biz = new BookBiz();
		 while(true) {
			 printMenu();
			 System.out.print("## 메뉴 입력 :");
			 String menu = BookUtil.getUserInput();
			 if (menu.equals("9")) {
				 System.out.println("----------------------");
				 System.out.println("프로그램을 종료합니다.Bye~");
				 System.out.println("----------------------");
				 break;
			 }else if (menu.equals("1")) {
				 BookUtil.printHeader();
				 biz.printAllBooks();
				 BookUtil.printTail();
			 }else if (menu.equals("2")) {
				 BookUtil.printHeader();
				 biz.printAllMagazines();
				 BookUtil.printTail();
			 }else if (menu.equals("3")) {
				 BookUtil.printHeader();
				 biz.printAllNovels();
				 BookUtil.printTail();
			 }else if (menu.equals("4")) {				  
				 biz.printMagazineOneYearSubcription();				  
			 }else if (menu.equals("5")) {
				 System.out.print(">검색할 저자명을 입력하세요:");
				 String author = BookUtil.getUserInput();
				 BookUtil.printHeader();
				 biz.searchNovelByAuthor(author);
				 BookUtil.printTail();
			 }else if (menu.equals("6")) {
				 System.out.print(">검색할 소설 가격의 최소값을 입력하세요:");
				 int minPrice = Integer.parseInt(BookUtil.getUserInput());
				 System.out.print(">검색할 소설 가격의 최대값을 입력하세요:");
				 int maxPrice = Integer.parseInt(BookUtil.getUserInput());
				 BookUtil.printHeader();
				 biz.searchNovelByPrice(minPrice, maxPrice);
				 BookUtil.printTail();
			 }
			 
		 }
	}
	public static void printMenu() {
		System.out.println("===<<도서 정보 프로그램>>===");
		System.out.println("1.전체 도서 정보 조회");
		System.out.println("2.전체 잡지 조회");
		System.out.println("3.전체 소설 조회");
		System.out.println("4.잡지 연간 구독료 조회");
		System.out.println("5.소설 저자명 검색");
		System.out.println("6.소설가격 검색(최소값~최대값)");
		System.out.println("9.시스템종료");
		System.out.println("========================");
	}

}
