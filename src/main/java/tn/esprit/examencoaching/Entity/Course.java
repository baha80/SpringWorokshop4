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
// @Transient // pour ignorer un attribut
@Entity
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    //unique
    @Column(unique = true)
    private int num ;
    private LocalDate date ;
    private int duration ;
    @Enumerated(EnumType.STRING)
    private Level level ;

@OneToMany(cascade = CascadeType.ALL) //cascade  pour ensure that all operations are cascaded to the target of the association
public Set<Exercise> exercises ;

//many to many with person
@ManyToMany
private Set<Person> personnes = new HashSet<>();

@ManyToOne
public Person person;

}

//maped by biderctional
