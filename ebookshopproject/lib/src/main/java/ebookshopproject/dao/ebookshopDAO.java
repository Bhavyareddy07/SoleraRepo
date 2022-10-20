package ebookshopproject.dao;


import java.util.List;

import ebookshopproject.entities.Book;
import ebookshopproject.entities.Customer;
import ebookshopproject.entities.Order;

public interface ebookshopDAO {

	public List<Book> getBookByAuthor(String author);

	public Book getBookByTitle(String title);

	public Book getBookById(Long bookId);

	public String addCustomer(Customer customer);

	public String addBook(Book book);

	public String addOrder(Order order);
	
	public Order placeOrder(Order order);
	
	public List<Order> getOrdersByCustomerId(Integer customerNo);
	
	public List<Order> getOrderById(Integer orderId);
	
	public Customer getCustomerByName(String name);
	
	

}
