package com.thoughtworks.bootcamp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thoughtworks.bootcamp.User.User;

public interface IflixRepository extends JpaRepository<User, String> {
	Optional<User> findByEmailId(String emailId);
}
