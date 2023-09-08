package com.example.springdatajpa;

import com.example.springdatajpa.domain.User;
import com.example.springdatajpa.repository.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringdatajpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;

//	@Autowired
//	EntityManagerFactory entityManagerFactory;

	@Override
	@Transactional
	public void run(String... args) throws Exception {
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//		EntityTransaction transaction = entityManager.getTransaction();
//		try{
//			transaction.begin();
			// JPA code
//			User user = new User();
//			user.setName("Taeung park");
//			user.setEmail("test@test.com");
//			user.setPassword("1234");
//
//			entityManager.persist(user);
//
//			User user = entityManager.find(User.class, 2);
//			System.out.println(user);
//			entityManager.remove(user);
//
//			transaction.commit();
//		}catch (Exception e) {
//			transaction.rollback();
//		}finally {
//			entityManager.close();
//		}

		// After Create UserRepository
//		User user = userRepository.findById(2).orElseThrow(); // Java Optional
//		System.out.println(user);
		// Insert
//		User user = new User();
//		user.setName("test");
//		user.setEmail("test@test.com");
//		user.setPassword("1234");
//		user.setRegdate(LocalDateTime.now());
//
//		userRepository.save(user);
		//Delete
//		userRepository.deleteById(3);

		//Delete2
//		User user = userRepository.findById(4).orElseThrow();
//		userRepository.delete(user);

		//Update
//		User user = userRepository.findById(5).orElseThrow();
//		System.out.println(user);
//		user.setPassword("5678");

		// Query method
//		User user = userRepository.findByName("test").orElseThrow();
//		System.out.println(user);

//		Optional<User> user = userRepository.findByNameAndEmail("test", "test@test.com");
//		System.out.println(user.get());

//		List<User> users = userRepository.findByNameOrEmail("test", "test@test.com");
//		for(User user : users){
//			System.out.println(user);
//		}

//		List<User> users = userRepository.findByUserIdBetween(1, 10);
//		for(User user : users){
//			System.out.println(user);
//		}

//		List<User> users = userRepository.findByUserIdLessThan(3);
//		for(User user : users){
//			System.out.println(user);
//		}

//		List<User> users = userRepository.findByUserIdLessThanEqual(5);
//		for(User user : users){
//			System.out.println(user);
//		}

//		List<User> users = userRepository.findByUserIdGreaterThan(4);
//		for(User user : users){
//			System.out.println(user);
//		}

//		List<User> users = userRepository.findByUserIdGreaterThanEqual(5);
//		for(User user : users){
//			System.out.println(user);
//		}

//		List<User> users = userRepository.findByRegdateAfter(LocalDateTime.now().minusDays(2L));
//		for(User user : users){
//			System.out.println(user);
//		}

//		List<User> users = userRepository.findByRegdateBefore(LocalDateTime.now().minusDays(2L));
//		for(User user : users){
//			System.out.println(user);
//		}

//		List<User> users = userRepository.findByNameIsNull();
//		for(User user : users){
//			System.out.println(user);
//		}

//		List<User> users = userRepository.findByNameIsNotNull();
//		for(User user : users){
//			System.out.println(user);
//		}

//		List<User> users = userRepository.findByNameIsLike("%te%");
//		for(User user : users){
//			System.out.println(user);
//		}

//		List<User> users = userRepository.findByNameStartingWith("t");
//		for(User user : users){
//			System.out.println(user);
//		}

//		List<User> users = userRepository.findByNameEndingWith("t");
//		for(User user : users){
//			System.out.println(user);
//		}

//		List<User> users = userRepository.findByNameContaining("t");
//		for(User user : users){
//			System.out.println(user);
//		}

//		List<User> users = userRepository.findByOrderByNameAsc();
//		for(User user : users){
//			System.out.println(user);
//		}

//		List<User> users = userRepository.findByOrderByNameDesc();
//		for(User user : users){
//			System.out.println(user);
//		}

//		List<User> users = userRepository.findByRegdateAfterOrderByNameDesc(LocalDateTime.now().minusDays(2));
//		for(User user : users){
//			System.out.println(user);
//		}

//		List<User> users = userRepository.findByNameNot("test");
//		for(User user : users){
//			System.out.println(user);
//		}

//		List<User> users = userRepository.findByUserIdIn(List.of(2,5));
//		for(User user : users){
//			System.out.println(user);
//		}

//		List<User> users = userRepository.findByUserIdNotIn(List.of(2,3));
//		for(User user : users){
//			System.out.println(user);
//		}

//		Long count = userRepository.countBy();
//		System.out.println(count);

//		Long count = userRepository.countByNameLike("t%");
//		System.out.println(count);

//		boolean find = userRepository.existsByEmail("test@test.com");
//		System.out.println(find);

//		int del = userRepository.deleteByNameLike("te%");
//		System.out.println(del);

//		List<User> users = userRepository.findDistinctByName("test");
//		for(User user : users) {
//			System.out.println(user);
//		}

//		List<User> users = userRepository.findFirst2By();
//		for(User user : users) {
//			System.out.println(user);
//		}

//		List<User> users = userRepository.findTop2By();
//		for(User user : users) {
//			System.out.println(user);
//		}

		//paging
//		Page<User> users = userRepository.findBy(PageRequest.of(1,2, Sort.by(Sort.Direction.DESC, "regdate")));
//		for(User user : users.getContent()) {
//			System.out.println(user);
//		}

		Page<User> users = userRepository.findByName("test", PageRequest.of(0,2, Sort.by(Sort.Direction.DESC, "regdate")));
		for(User user : users.getContent()) {
			System.out.println(user);
		}
	}
}
