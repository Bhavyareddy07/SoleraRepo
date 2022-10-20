package jpaassociationmapping.onetooneuni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneUniDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaassociationmapping");
		EntityManager em = emf.createEntityManager();

		Student student = new Student();
		Address homeAddress = new Address();

		student.setName("Bhavya");
		homeAddress.setCity("bangalore");
		homeAddress.setState("Karnataka");
		homeAddress.setStreet("whitefield");
		homeAddress.setZipCode("560066");

		// inject address into Student
		student.setAddress(homeAddress);

		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();

	}

}
