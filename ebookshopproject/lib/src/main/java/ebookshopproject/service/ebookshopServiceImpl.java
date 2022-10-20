package ebookshopproject.service;

import java.util.List;

import ebookshopproject.dao.ebookshopDAO;
import ebookshopproject.dao.ebookshopDAOImpl;
import ebookshopproject.entities.Book;
import ebookshopproject.entities.Customer;
import ebookshopproject.entities.Order;

public class ebookshopServiceImpl implements ebookshopService {
	private ebookshopDAO ebookshopdao = new ebookshopDAOImpl();

	@Override
	public List<Book> getBookByAuthor(String author) {

		return ebookshopdao.getBookByAuthor(author);
	}

	@Override
	public Book getBookByTitle(String title) {

		return ebookshopdao.getBookByTitle(title);
	}

	@Override
	public Book getBookById(Long bookId) {

		return ebookshopdao.getBookById(bookId);
	}

	@Override
	public String addCustomer(Customer customer) {

		return ebookshopdao.addCustomer(customer);
	}

	@Override
	public String addOrder(Order order) {

		return ebookshopdao.addOrder(order);
	}

	@Override
	public Order placeOrder(Order order) {

		return ebookshopdao.placeOrder(order);
	}

	@Override
	public List<Order> getOrdersByCustomerId(Integer customerNo) {
		// TODO Auto-generated method stub
		return ebookshopdao.getOrderById(customerNo);
	}

	@Override
	public List<Order> getOrderById(Integer orderId) {
		// TODO Auto-generated method stub
		return ebookshopdao.getOrderById(orderId);
	}

	@Override
	public Customer getCustomerByName(String name) {
		// TODO Auto-generated method stub
		return ebookshopdao.getCustomerByName(name);
	}

	@Override
	public String addBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

}