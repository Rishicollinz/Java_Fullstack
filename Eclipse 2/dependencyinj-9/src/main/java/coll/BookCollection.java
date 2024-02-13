package coll;
import java.util.*;
public class BookCollection {
	List<Book> bookList;

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	public Book getFirstBook() {
		return getBookList().get(0);
	}
	
}

