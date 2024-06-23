package tn.esprit.examencoaching.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examencoaching.Entity.Course;
import tn.esprit.examencoaching.Entity.Level;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByLevelAndPersonName(Level level, String name);

    Course findByNum(Integer num);
}
