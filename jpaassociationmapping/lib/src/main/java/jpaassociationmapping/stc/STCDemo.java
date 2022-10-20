package jpaassociationmapping.stc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class STCDemo {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaassociationmapping");
		EntityManager em = emf.createEntityManager();
		EmployeeSTC e1 = new EmployeeSTC();
		e1.setName("Bob");
		e1.setSalary(678965.50);

		Manager m1 = new Manager();
		m1.setDepartmentName("Accounts");
		m1.setName("Ravi Kumar");
		m1.setSalary(123456.60);

		em.getTransaction().begin();
		em.persist(e1);
		em.persist(m1);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}