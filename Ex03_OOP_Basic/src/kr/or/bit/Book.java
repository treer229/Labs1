package kr.or.bit;

/*
 책은 이름과 가격을 가지고 있따.
 책이 출판되면 반드시 책은 책의 이름과 가격을 가지고 있어야 한다.
 책이름과 가격정보는 정보를 읽을 수는 있다.
 */

public class Book {
	private String bookName;
	private int bookPrice;
	
	public String getBookName() {
		return bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	Book(String bookName, int bookPrice) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	
	public void readInfo(Book a) {
		System.out.println(bookPrice);
		System.out.println(bookName);
	}
	public static void main(String[] args) {
		Book book = new Book("hi", 20000);
		book.readInfo(book);
		
	}
}
