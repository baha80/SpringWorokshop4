package tn.esprit.examencoaching.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@ToString

@Entity
public class Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personId;
    private String name;
    @Enumerated(EnumType.STRING)
    private Role role;
    private int nbrMonthsTraining ;
    private LocalDate dateOfBirth;




    //many to many with course genere une table de jointure
    @ManyToMany(mappedBy = "personnes")
    private Set<Course> coursesAthlete = new HashSet<>();

    //one to many with course genere un attribut person dans la table course
    @OneToMany(mappedBy = "person")
    private Set<Course> coursesCoach = new HashSet<>();
}
