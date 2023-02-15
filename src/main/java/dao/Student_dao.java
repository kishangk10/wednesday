package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Student_dto;

public class Student_dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("abc");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public void insert(Student_dto student_dto) {
		entityTransaction.begin();
		entityManager.persist(student_dto);
		entityTransaction.commit();
	}
}
