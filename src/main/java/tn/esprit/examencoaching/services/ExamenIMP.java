package tn.esprit.examencoaching.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.examencoaching.Entity.Course;
import tn.esprit.examencoaching.Entity.Exercise;
import tn.esprit.examencoaching.Entity.Level;
import tn.esprit.examencoaching.Entity.Person;
import tn.esprit.examencoaching.repository.CourseRepository;
import tn.esprit.examencoaching.repository.ExerciseRepository;
import tn.esprit.examencoaching.repository.PersonRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ExamenIMP implements IExamen{

    public PersonRepository personRepository;
    public CourseRepository courseRepository;
    public ExerciseRepository exerciseRepository;
    @Override
    public Person addPerson(Person person) {
        return personRepository.save(person);

    }

    @Override
    public Course addCourseAssignCoach(Course course, Long personID) {
        Person person = personRepository.findById(personID).get();
        if(person.getRole().equals("Coach")){
            course.setPerson(person);
        }

        return courseRepository.save(course);
    }

    @Override
    public List<Course> retrieveCourse(Level level, String name) {
        return courseRepository.findByLevelAndPersonName(level, name).stream()
                .filter(course -> course.getDate().isBefore(LocalDate.now()))
                .collect(Collectors.toList());
    }

//    @Override
//    public List<Course> retrieveCourse(Level level, String name) {
//        return courseRepository.findByLevelAndName(level, name);
//    }

    @Override
    public Course assignAthleteCourse(Long personID, Integer num) {
        Person athlete = personRepository.findById(personID).get();
        Course course = courseRepository.findByNum(num);
        if (athlete.getRole().equals("Athlete")){
            course.getPerson().add(athlete);
        }

        return courseRepository.save(course);
    }


    @Override
    public List<Person> retrieveAthlete(String title) {
        return null;
    }

    @Override
    public List<Exercise> retrieveRigidEx(LocalDate startDate, LocalDate endDate) {
        return null;
    }

}
