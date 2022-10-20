package jpagradleproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@NamedQueries({
	@NamedQuery(name="getAllBooks", query="SELECT book FROM Book book"),
	@NamedQuery(name="getBookByAuthor",query="SELECT book FROM Book book where book.author=:author"),
	@NamedQuery(name="getBookByTitle",query="SELECT book FROM Book book where book.bookTitle=:bookTitle")
	
})
public class Book {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long Id;
	private String bookTitle;
	private String author;
	
	
	
}
