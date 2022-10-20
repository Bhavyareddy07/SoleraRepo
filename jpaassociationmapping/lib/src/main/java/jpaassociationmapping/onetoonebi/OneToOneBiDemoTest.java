package jpaassociationmapping.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneBiDemoTest {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaassociationmapping");
		EntityManager em = emf.createEntityManager();
		
		AddressBi addressBi = em.find(AddressBi.class, 1);
		System.out.println(addressBi.getStudentBi().getName());
		System.out.println(addressBi.getCity());
		System.out.println(addressBi.getStudentBi());
		
		StudentBi studentBi= em.find(StudentBi.class, 1);
		System.out.println(studentBi.getStudentId());
		System.out.println(studentBi.getName());
		System.out.println(studentBi.getAddressBi().getCity());
		System.out.println(studentBi.getAddressBi());
	}

}