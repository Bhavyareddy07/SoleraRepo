package jpagradleproject.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import jpagradleproject.entities.Book;

public class BookDAOImpl implements BookDAO {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpawithgradle");
	private EntityManager em = emf.createEntityManager();

	@Override
	public void addBook(Book book) {
		// Inserting data in database using persist method of EntityManager
		em.getTransaction().begin();
		em.persist(book);
		em.getTransaction().commit(); // void doesnt have return type

	}

	@Override
	public Book getBookById(Long bookId) {
		em.getTransaction().begin();
		Book book = em.find(Book.class, bookId);
		em.getTransaction().commit();
		return book;

	}

	@Override
	public List<Book> getAllBooks() {
		TypedQuery<Book> query = em.createNamedQuery("getAllBooks", Book.class);
		List<Book> results = query.getResultList();
		return results;

	}

	@Override
	public List<Book> getBookByAuthor(String author) {
		TypedQuery<Book> query = em.createNamedQuery("getBookByAuthor", Book.class);
		query.setParameter("author", author);
		List<Book> results = query.getResultList();
		return results;

	}

	@Override
	public Book getBookByTitle(String title) {
		TypedQuery<Book> query = em.createNamedQuery("getBookByTitle", Book.class);
		query.setParameter("bookTitle", title);
		Book result = query.getSingleResult();
		return result;

	}

	@Override
	public Book deleteBook(Book book) {
		
		em.getTransaction().begin();
		Book bok = em.find(Book.class, book.getId()); // id is unique, wont work for author bcz of duplicates
		if(bok!=null) {
			em.remove(bok);
			em.getTransaction().commit();	
			} else {
				System.out.println("unable to delete");
			}
	
		
		return null;

	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		Book bok = em.find(Book.class,book.getId());
		if(bok != null) {
			bok.setAuthor(book.getAuthor());
			bok.setBookTitle(book.getBookTitle());
			em.persist(bok);
			em.getTransaction().commit();
		}
		return bok;
	}

}
