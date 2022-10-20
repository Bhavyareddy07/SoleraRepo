package jpagradleproject.services;


import java.util.List;

import jpagradleproject.entities.Book;

public interface BookService {
	public List<Book> getAllBooks();
	public List<Book> getBookByAuthor(String author);
	public Book getBookByTitle(String title);
	public void addBook(Book book);
	public Book getBookById(Long bookId);
	public Book deleteBook(Book book);
	public Book updateBook(Book book);
}
