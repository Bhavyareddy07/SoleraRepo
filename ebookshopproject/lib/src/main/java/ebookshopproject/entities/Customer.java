package ebookshopproject.entities;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "customer_info")
@NamedQueries({ 
	@NamedQuery(name = "getCustomerByName", query = "SELECT customer FROM Customer customer where customer.customerName=:name")
})
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerNo;
	private String customerName;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
	@Exclude
	private Set<Order> order;

}