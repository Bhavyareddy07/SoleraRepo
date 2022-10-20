package ebookshop.onetomany;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ebookshop");
		EntityManager em = emf.createEntityManager();

		Customer customer = new Customer();
		customer.setCusName("bhavya");
		//customer.setCusId(1);
		customer.setLocation("Bengaluru");
		customer.setPurchaseDate(LocalDate.now());

		Book book = new Book();
		book.setBookName("abcd");
		book.setBookauthor("prabhat");
		//book.setBookId(123);
		book.setBookprice(5000);
		List<Book> listOfBook = new ArrayList<Book>();
		
		listOfBook.add(book);
		customer.setBook(listOfBook);
		Set<Customer> setOfCustomer = new HashSet<Customer>();
		setOfCustomer.add(customer);
		book.setCustomer(setOfCustomer);
		
		em.getTransaction().begin();
		em.persist(customer);
		em.getTransaction().commit();

	}

}
