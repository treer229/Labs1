package kr.or.bit;

/*
 å�� �̸��� ������ ������ �ֵ�.
 å�� ���ǵǸ� �ݵ�� å�� å�� �̸��� ������ ������ �־�� �Ѵ�.
 å�̸��� ���������� ������ ���� ���� �ִ�.
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
