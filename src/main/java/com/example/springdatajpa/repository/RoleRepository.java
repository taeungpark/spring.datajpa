package com.example.springdatajpa.repository;

import com.example.springdatajpa.domain.Board;
import com.example.springdatajpa.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface RoleRepository extends JpaRepository<Role, Integer> {

}
