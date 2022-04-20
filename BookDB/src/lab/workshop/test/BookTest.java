package lab.workshop.test;

import lab.workshop.biz.BookBiz;
 
import lab.workshop.util.BookUtil;

public class BookTest {

	public static void main(String[] args) {
		BookBiz biz = new BookBiz();
		 while(true) {
			 printMenu();
			 System.out.print("## �޴� �Է� :");
			 String menu = BookUtil.getUserInput();
			 if (menu.equals("9")) {
				 System.out.println("----------------------");
				 System.out.println("���α׷��� �����մϴ�.Bye~");
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
				 System.out.print(">�˻��� ���ڸ��� �Է��ϼ���:");
				 String author = BookUtil.getUserInput();
				 BookUtil.printHeader();
				 biz.searchNovelByAuthor(author);
				 BookUtil.printTail();
			 }else if (menu.equals("6")) {
				 System.out.print(">�˻��� �Ҽ� ������ �ּҰ��� �Է��ϼ���:");
				 int minPrice = Integer.parseInt(BookUtil.getUserInput());
				 System.out.print(">�˻��� �Ҽ� ������ �ִ밪�� �Է��ϼ���:");
				 int maxPrice = Integer.parseInt(BookUtil.getUserInput());
				 BookUtil.printHeader();
				 biz.searchNovelByPrice(minPrice, maxPrice);
				 BookUtil.printTail();
			 }
			 
		 }
	}
	public static void printMenu() {
		System.out.println("===<<���� ���� ���α׷�>>===");
		System.out.println("1.��ü ���� ���� ��ȸ");
		System.out.println("2.��ü ���� ��ȸ");
		System.out.println("3.��ü �Ҽ� ��ȸ");
		System.out.println("4.���� ���� ������ ��ȸ");
		System.out.println("5.�Ҽ� ���ڸ� �˻�");
		System.out.println("6.�Ҽ����� �˻�(�ּҰ�~�ִ밪)");
		System.out.println("9.�ý�������");
		System.out.println("========================");
	}

}
