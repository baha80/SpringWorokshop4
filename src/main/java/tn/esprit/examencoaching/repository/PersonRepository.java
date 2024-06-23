package tn.esprit.examencoaching.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examencoaching.Entity.Person;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
   // List<Person> findByTitle(String title);
}
