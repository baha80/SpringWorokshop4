package tn.esprit.examencoaching.services;

import tn.esprit.examencoaching.Entity.Course;
import tn.esprit.examencoaching.Entity.Exercise;
import tn.esprit.examencoaching.Entity.Level;
import tn.esprit.examencoaching.Entity.Person;

import java.time.LocalDate;
import java.util.List;

public interface IExamen {

    public Person addPerson(Person person);


    public Course addCourseAssignCoach(Course course, Long personID);

    public List<Course> retrieveCourse(Level level , String name);

    public Course assignAthleteCourse(Long personID, Integer num);

    public List<Person> retrieveAthlete(String title);

    public List<Exercise> retrieveRigidEx(LocalDate startDate, LocalDate endDate);



}
