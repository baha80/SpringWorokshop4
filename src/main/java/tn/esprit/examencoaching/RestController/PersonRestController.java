package tn.esprit.examencoaching.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examencoaching.Entity.Course;
import tn.esprit.examencoaching.Entity.Level;
import tn.esprit.examencoaching.Entity.Person;
import tn.esprit.examencoaching.services.IExamen;

import java.util.List;

@AllArgsConstructor
@RestController
public class PersonRestController {

    private IExamen iExamenService;

    //add person
    @PostMapping("/addPerson")
    public Person addPerson(@RequestBody Person person){
        return iExamenService.addPerson(person);
    }

    //addCourseAssignCoach
    @PostMapping("/addCourseAssignCoach/{personID}")
    public Course addCourseAssignCoach(@RequestBody Course cs, @PathVariable Long personID){
        return iExamenService.addCourseAssignCoach(cs, personID);
    }

    //retrieveCourse
    @GetMapping("/retrieveCourse/{level}/{name}")
    public List<Course> retrieveCourse(@PathVariable Level level, @PathVariable String name){
        return iExamenService.retrieveCourse(level, name);
    }

    @PostMapping("/assignAthleteCourse/{personID}/{num}")
    public Course assignAthleteCourse(@PathVariable Long personID, @PathVariable Integer num){
        //return list
        return iExamenService.assignAthleteCourse(personID, num);
    }
}
