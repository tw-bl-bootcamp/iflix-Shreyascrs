package com.thoughtworks.bootcamp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thoughtworks.bootcamp.Model.Theator;

public interface TheatorRepository extends JpaRepository<Theator, Long> {
	Optional<Theator> findByid(long id);

}
