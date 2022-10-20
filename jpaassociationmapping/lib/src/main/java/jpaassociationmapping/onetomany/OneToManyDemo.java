package jpaassociationmapping.onetomany;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaassociationmapping");
		EntityManager em = emf.createEntityManager();
		
		Department department = new Department();
		department.setDeptName("ACCOUNTS");
		department.setLocation("MUMBAI");
		
		Department department1 = new Department();
		department1.setDeptName("IT");
		department1.setLocation("BENGALURU");
		
		Department department2 = new Department();
		department2.setDeptName("MARKETING");
		department2.setLocation("NEWDELHI");
		
		Employee employee1 = new Employee();
		employee1.setEmpName("Vishnu");
		employee1.setHireDate(new Date());
		employee1.setDepartment(department2);
		
		Employee employee2 = new Employee();
		employee2.setEmpName("Mohit");
		employee2.setHireDate(new Date());
		employee2.setDepartment(department2);
		
		Employee employee3 = new Employee();
		employee3.setEmpName("Abhay");
		employee3.setHireDate(new Date());
		employee3.setDepartment(department1);
		
		Employee employee4 = new Employee();
		employee4.setEmpName("bhavya");
		employee4.setHireDate(new Date());
		employee4.setDepartment(department);
		
		em.getTransaction().begin();
		em.persist(employee4);
		em.persist(employee3);
		em.persist(employee2);
		em.persist(employee1);
		em.getTransaction().commit();
	}

}