package lab.workshop.biz;

import java.util.ArrayList;

import lab.workshop.dao.BookDAO;
import lab.workshop.entity.Book;
 

public class BookBiz {	 
   BookDAO dao ;
	public BookBiz() { 
		 dao = new BookDAO();
	}

	public void printAllBooks() {
		int no =1;
		ArrayList<Book> books = dao.getAllBooks(); 	
		for (Book b : books) {
			System.out.println(no++ + "," + b.toString());
		}
	}

	public void printAllMagazines() {
		int no =1;
		ArrayList<Book> books = dao.getAllMagazines();
		for (Book b : books) {
			System.out.println(no++ + "," + b.toString());
		}
		 
	}

	public void printAllNovels() {
		int no =1;
		ArrayList<Book> books = dao.getAllNovels();
		for (Book b : books) {
			System.out.println(no++ + "," + b.toString());
		}
		 
	}

	public void printMagazineOneYearSubcription() {
		int no =1;
		System.out.println("-----------------------------");		 
		ArrayList<Book> books = dao.getAllMagazines();
		for (Book b : books) {
			System.out.println((no++) +"."+ b.getTitle()+":" 
			         +calculateOneYearSubscriptionPrice(b.getPrice())+"¿ø");
		}		 
		System.out.println("-----------------------------");
	}
	
	private int calculateOneYearSubscriptionPrice(int price) {
		return price*12;
	}

	public void searchNovelByAuthor(String author) {
		int no =1;
		ArrayList<Book> books = dao.searchNovelByAuthor(author);
		for (Book b : books) {
			System.out.println(no++ + "," + b.toString());
		}
		 
	}

	public void searchNovelByPrice(int minPrice, int maxPrice) {
		int no =1;
		ArrayList<Book> books = dao.searchNovelByPrice(minPrice, maxPrice);
		for (Book b : books) {
			System.out.println(no++ + "," + b.toString());
		}
		 
	}
	

	 
}
