package ebookshopproject.ui;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import ebookshopproject.entities.Book;
import ebookshopproject.entities.Customer;
import ebookshopproject.entities.Order;
import ebookshopproject.service.ebookshopService;
import ebookshopproject.service.ebookshopServiceImpl;

public class EbookShopPlaceOrderMain {

	public static void main(String[] args) {

		ebookshopService ebookshopService = new ebookshopServiceImpl();
         Order order = new Order();
       //Book book = new Book();
 		Customer customer = new Customer();
 		Book book = ebookshopService.getBookByTitle("learn java");
 		Customer customer1 = ebookshopService.getCustomerByName("Reddy");
 		
 		
 		Set<Book> books = new HashSet<Book>();
		books.add(book);
		order.setBooks(books);
		order.setCustomer(customer1);
		order.setOrderDate(new Date());
		Order order1 = ebookshopService.placeOrder(order);
		System.out.println(order1);
	}	
	}


