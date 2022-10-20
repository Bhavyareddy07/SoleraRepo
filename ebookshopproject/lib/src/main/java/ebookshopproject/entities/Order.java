package ebookshopproject.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

/*
 * Order is the owning entity, owning entity
 * should have @JoinTable
 */
@Entity
@Table(name = "order_info")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Order {
	@Id
	@Column(name = "orderid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderId;
	@Temporal(TemporalType.DATE)
	@Column(name = "order_date")
	private Date orderDate;
	@ManyToOne(cascade = CascadeType.ALL) // Owning side
	@JoinColumn(name = "customerNo")
	@Exclude
	private Customer customer;
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL) // owning side
	@JoinTable(name = "book_order", joinColumns = { @JoinColumn(name = "orderid") }, inverseJoinColumns = {
			@JoinColumn(name = "bookid") })
	@Exclude
	private Set<Book> books;
}