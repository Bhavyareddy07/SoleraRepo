package jpagradleproject.ui;

import jpagradleproject.entities.Book;
import jpagradleproject.services.BookService;
import jpagradleproject.services.BookServiceImpl;

public class BookMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookService bookService = new BookServiceImpl();
		Book book = new Book();
		book.setAuthor("bhavya");
		book.setBookTitle("ABCD");
		// book.setId(123L);
//		bookService.addBook(book);

		Book book1 = new Book();
		book1.setAuthor("byresh");
//		book1.setBookTitle("EFGH");
		 book1.setId(4L);
//		bookService.addBook(book1);
//		System.out.println(bookService.getBookById(1L));
		
		//System.out.println(bookService.deleteBook(book1));
		//bookService.deleteBook(book1);
		
		bookService.updateBook(book1);
;
	}

}
