package com.wsjinformatica.demo.repositories;

import com.wsjinformatica.demo.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
