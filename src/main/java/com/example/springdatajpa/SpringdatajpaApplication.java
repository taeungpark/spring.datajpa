package com.example.springdatajpa;

import com.example.springdatajpa.domain.Board;
import com.example.springdatajpa.domain.Role;
import com.example.springdatajpa.domain.User;
import com.example.springdatajpa.dto.BoardInterface;
import com.example.springdatajpa.repository.BoardRepository;
import com.example.springdatajpa.repository.RoleRepository;
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
import java.util.Set;

@SpringBootApplication
public class SpringdatajpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	@Autowired
	BoardRepository boardRepository;

	@Override
	@Transactional
	public void run(String... args) throws Exception {
//		List<User> all = userRepository.findAll();
//		for(User user : all){
//			System.out.println(user);
//			for (Role role: user.getRoles()) {
//				System.out.println(role);
//			}
//			System.out.println("------------------------");
//		}
//		List<Board> all = boardRepository.findAll();
//		for(Board board : all) {
//			System.out.println(board);
//			System.out.println(board.getUser());
//		}

//		Board board = boardRepository.findById(5).get();
//		System.out.println(board);
//		System.out.println(board.getUser());

//		List<Board> boards = boardRepository.getBoards();
//		for(Board board : boards) {
//			System.out.println(board);
//			System.out.println(board.getUser());
//		}

//		Long boardCount = boardRepository.getBoardCount();
//		System.out.println(boardCount);

//		Role role = roleRepository.findById(2).get();
//		System.out.println(role);
//
//		User user = new User();
//		user.setName("admin");
//		user.setPassword("1234");
//		user.setEmail("admin@test.com");
//		user.setRegdate(LocalDateTime.now());
//		user.setRoles(Set.of(role));
//
//		userRepository.save(user);

//		User user = userRepository.findById(4).get();
//		Board board = new Board();
//		board.setUser(user);
//		board.setRegdate(LocalDateTime.now());
//		board.setTitle("admin");
//		board.setContent("test");
//		boardRepository.save(board);

//		List<Board> adminBoards = boardRepository.getBoards("ROLE_ADMIN");
//		for(Board board : adminBoards){
//			System.out.println(board);
//			System.out.println(board.getUser());
//		}

		List<BoardInterface> list = boardRepository.getBoardsWithNativeQuery();
		for(BoardInterface board : list){
			System.out.println(board.getName());
		}
	}
}
