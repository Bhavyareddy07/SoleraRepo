package ebookshopproject.ui;

import ebookshopproject.entities.Book;
import ebookshopproject.entities.Customer;
import ebookshopproject.service.ebookshopService;
import ebookshopproject.service.ebookshopServiceImpl;

public class ebookshopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ebookshopService ebookshopService = new ebookshopServiceImpl();
		
		System.out.println(ebookshopService.getBookByAuthor("Amish Trivadi"));

		//Insert customer
		Customer customer = new Customer();
		customer.setCustomerName("Reddy");
		String message = ebookshopService.addCustomer(customer);
		System.out.println(message);
		
		//Insert Book
				Book book = new Book();
				book.setAuthor("raghu");
				book.setBookTitle("learn java");
				book.setPrice(250.55);
				
				String msg = ebookshopService.addBook(book);
				System.out.println(msg);
		
		
	}

}
