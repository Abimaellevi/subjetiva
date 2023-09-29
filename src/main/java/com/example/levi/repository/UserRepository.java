package com.example.levi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.levi.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}