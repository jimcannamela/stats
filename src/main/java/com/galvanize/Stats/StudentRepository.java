package com.galvanize.Stats;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
	Optional<Student> findByFirstName(String firstName);
	Optional<Student> findByLastName(String lastName);
	Optional<Student> findByFirstNameAndLastName(String firstName, String lastName);
}