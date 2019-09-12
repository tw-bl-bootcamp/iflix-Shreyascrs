package com.thoughtworks.bootcamp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thoughtworks.bootcamp.User.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	Optional<User> findByemailId(String emailId);
}
