package jpaassociationmapping.onetooneuni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpaassociationmapping.onetomany.Department;
import jpaassociationmapping.onetomany.Employee;

public class OneToManyDemoTest {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaassociationmapping");
		EntityManager em = emf.createEntityManager();

		Employee emp = em.find(Employee.class, 1);
		System.out.println(emp.getDepartment());
		System.out.println(emp.getEmpName());

		Department dept = em.find(Department.class, 3);
		System.out.println(dept.getEmployees());
	}
}