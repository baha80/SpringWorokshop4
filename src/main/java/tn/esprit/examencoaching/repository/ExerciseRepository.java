package tn.esprit.examencoaching.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.examencoaching.Entity.Exercise;

import java.time.LocalDate;
import java.util.List;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
//    @Query("SELECT e FROM Exercise e WHERE e.startDate BETWEEN :startDate AND :endDate");
//    List<Exercise> findByStartDateBetween(LocalDate startDate, LocalDate endDate);

}
