package ebookshopproject.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@NamedQueries({ @NamedQuery(name = "getAllBooks", query = "SELECT book FROM Book book"),
		@NamedQuery(name = "getBookByAuthor", query = "SELECT book FROM Book book where book.author=:author"),
		@NamedQuery(name = "getBookByTitle", query = "SELECT book FROM Book book where book.bookTitle=:bookTitle"), })
@Table(name = "book_info")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bookId;
	private String bookTitle;
	private String author;
	private Double price;
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "books") // target side
	@Exclude
	private Set<Order> order;

}
