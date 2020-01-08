package domain.School;

import domain.DomainException;
import domain.Student.FreeStudent;
import domain.Student.FullTimeStudent;
import domain.Student.Student;

public class StudentFactory {

    public Student createStudent(String type, String lastName, String firstname, String number) throws DomainException {

        Student student = null;
        if(type.equals("free"))
            student = new FreeStudent(lastName, firstname, number);

        else if(type.equals("fulltime"))
            student = new FullTimeStudent(lastName, firstname, number);

        else
            throw new DomainException("Invalid type");

        return student;
    }
}
