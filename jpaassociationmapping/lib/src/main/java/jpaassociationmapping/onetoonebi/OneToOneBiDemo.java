package jpaassociationmapping.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class OneToOneBiDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaassociationmapping");
		EntityManager em = emf.createEntityManager();

		StudentBi studentBi = new StudentBi();
		AddressBi homeAddressBi = new AddressBi();

		studentBi.setName("Bhavya");
		homeAddressBi.setCity("bangalore");
		homeAddressBi.setState("Karnataka");
		homeAddressBi.setStreet("whitefield");
		homeAddressBi.setZipCode("560066");
		
		
		studentBi.setName("divya");
		homeAddressBi.setCity("mangalore");
		homeAddressBi.setState("mumbai");
		homeAddressBi.setStreet("whitefield");
		homeAddressBi.setZipCode("562784");

		// inject address into Student
		studentBi.setAddressBi(homeAddressBi);
		homeAddressBi.setStudentBi(studentBi);
		em.getTransaction().begin();
		em.persist(studentBi);
		em.getTransaction().commit();

	}

}
