package domain.School;

import java.util.HashSet;
import java.util.Set;
import domain.DomainException;
import domain.Student.Student;


public class School {
    private Set<Student> school = new HashSet<Student>();

    public School(){}

    public void enroll(String type, String firstName, String lastName, String number) throws DomainException{

        StudentFactory factory = new StudentFactory();
        Student student = factory.createStudent(type, lastName, firstName, number);
        addStudent(student);
    }

    public void addStudent(Student student) throws DomainException{

        if(student == null)
            throw new DomainException("Invalid Student");

        school.add(student);

    }
}
