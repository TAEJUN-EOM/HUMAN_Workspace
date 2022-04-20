package lab.workshop.biz;

import lab.workshop.entity.Magazine;
import lab.workshop.entity.Novel;

public class BookBiz {
	private Magazine[] magazines;
	private Novel[] novels;

	public BookBiz() { 
		//객체가 메모리에 생성될때 객체의 속성을 초기화하는 메서드
		magazines = new Magazine[]  {
			new Magazine("Cooking Light", 15000, "living, cooking", "America Cooking"),
			new Magazine("Auto Bild", 16000, "science, car", "Germany Car")
		};
		novels = new Novel[] {
			new Novel("The confession", 10500, "Grisham, John"),
			new Novel("Les miserables", 17500, "hugo, Victor"),
			new Novel("Breakthrough", 47200, "Ifill, Gwen"),
			new Novel("The Racketeer", 38000, "Grisham, John")
		};
	}

	public void printAllBooks() {
		int no =1;
		for (Magazine m : magazines ) {
			System.out.println((no++) +"."+ m);
		}
		for (Novel n : novels ) {
			System.out.println((no++) +"."+ n);
		}		
	}

	public void printAllMagazines() {
		int no =1;
		for (Magazine m : magazines ) {
			System.out.println((no++) +"."+ m);
		}
	}

	public void printAllNovels() {
		int no =1;
		for (Novel n : novels ) {
			System.out.println((no++) +"."+ n);
		}
	}

	public void printMagazineOneYearSubcription() {
		int no =1;
		System.out.println("-----------------------------");
		for (Magazine m : magazines ) {
			System.out.println((no++) +"."+ m.getTitle()+":" 
		         +calculateOneYearSubscriptionPrice(m.getPrice())+"원");
		}
		System.out.println("-----------------------------");
	}

	public void searchNovelByAuthor(String author) {
		int no =1;
		for (Novel n : novels ) {
			if(n.getAuthor().equals(author)) {
				System.out.println((no++) +"."+ n);
			}
		}
	}

	public void searchNovelByPrice(int minPrice, int maxPrice) {
		int no =1;
		for (Novel n : novels ) {
			if(n.getPrice()>=minPrice && n.getPrice()<=maxPrice) {
				System.out.println((no++) +"."+ n);
			}
		}
	}
	

	private int calculateOneYearSubscriptionPrice(int price) {
		return price*12;
	}
}
