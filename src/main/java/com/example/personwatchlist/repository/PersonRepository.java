package com.example.personwatchlist.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.personwatchlist.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    
}

