package ebookshopproject.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import ebookshopproject.entities.Book;
import ebookshopproject.entities.Customer;
import ebookshopproject.entities.Order;

public class ebookshopDAOImpl implements ebookshopDAO {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("ebookshopproject");
	private EntityManager em = emf.createEntityManager();

	public List<Book> getBookByAuthor(String author) {
		TypedQuery<Book> query = em.createNamedQuery("getBookByAuthor", Book.class);
		// query.setParameter(1, author);
		query.setParameter("author", author);
		List<Book> listOfBooks = query.getResultList();
		return listOfBooks;
	}

	@Override
	public Book getBookByTitle(String title) {
		TypedQuery<Book> query = em.createNamedQuery("getBookByTitle", Book.class);
		// query.setParameter(1, author);
		query.setParameter("bookTitle", title);
		return query.getSingleResult();
	}

	@Override
	public Book getBookById(Long bookId) {
		return em.find(Book.class, bookId);
	}

	@Override
	public String addCustomer(Customer customer) {
		em.getTransaction().begin();
		em.persist(customer);
		em.getTransaction().commit();
		return "Customer added successfully";
	}

	@Override
	public String addOrder(Order order) {
		em.getTransaction().begin();
		em.persist(order);
		em.getTransaction().commit();
		return "Order added successfully";
	}

	@Override
	public Order placeOrder(Order order) {
		em.getTransaction().begin();
		em.persist(order);
		em.getTransaction().commit();
		return order;
	}

	@Override
	public List<Order> getOrdersByCustomerId(Integer customerNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getOrderById(Integer orderId) {

		return (List<Order>) em.find(Order.class, orderId);
	}

	@Override
	public Customer getCustomerByName(String name) {
		TypedQuery<Customer> query = em.createNamedQuery("getCustomerByName", Customer.class);
		// query.setParameter(1, author);
		query.setParameter("name", name);
		return query.getSingleResult();
	}

	@Override
	public String addBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

}