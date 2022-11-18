package bookManager;

import lombok.Data;

@Data
public class Book {
	private String bookName, author, publisher;
	private int price;
	private category category;
	private int ISBN;
	private static int count=0;
	

	public Book(String bookName, String author, String publisher, int price, int num) {
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.category = intCategory(num);
		count++;
		ISBN=count;
	}
	


	public Book(int bookname2) {
		this.category=intCategory(bookname2);
	}

	public category intCategory(int num) {
		switch(num) {
		case 0: return category.A000총류;
		case 1: return category.B100철학;
		case 2: return category.C200종교;
		case 3: return category.D300사회과학;
		case 4: return category.E400자연과학;
		case 5: return category.F500기술과학;
		case 6: return category.G600예술;
		case 7: return category.H700언어;
		case 8: return category.I800문학;
		case 9: return category.J900역사;	
		default: return category.잘못된분류입니다;
		}
		
	}
	
	
@Override
	public String toString() {
		return ""+category+"  "+ISBN+"\n"+bookName+"  "+author+"  "+ publisher+"  "+ price+"원\n\n" ;
	}


static enum category{
	A000총류, B100철학, C200종교, D300사회과학, E400자연과학, F500기술과학, G600예술, H700언어, I800문학, J900역사, 잘못된분류입니다
}
}
