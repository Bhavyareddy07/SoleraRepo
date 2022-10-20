package jpagradleproject.services;

import java.util.List;

import jpagradleproject.dao.BookDAO;
import jpagradleproject.dao.BookDAOImpl;
import jpagradleproject.entities.Book;

public class BookServiceImpl implements BookService {

	private BookDAO bookDAO = new BookDAOImpl();

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBookByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getBookByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addBook(Book book) {
		bookDAO.addBook(book);

	}

	@Override
	public Book getBookById(Long bookId) {
		// TODO Auto-generated method stub
		return bookDAO.getBookById(bookId);

	}

	@Override
	public Book deleteBook(Book book) {
		// TODO Auto-generated method stub
		return bookDAO.deleteBook(book);

	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return bookDAO.updateBook(book);
	}

}