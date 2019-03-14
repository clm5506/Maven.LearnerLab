package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {

    @Test
    public void testTeach(){
        //Given
        Educator newInstructor = Educator.valueOf("LEON");
        Student newStudent = new Student(3L,"test");
        double before = newStudent.getTotalStudyTime();
        double expected = before + 3;

        //When
        newInstructor.teach(newStudent, 3);


        //Then
        Assert.assertEquals(expected, newStudent.getTotalStudyTime(),.00);
    }

    @Test
    public void testLecture(){
        //Given
        Educator newInstructor = Educator.valueOf("DOLIO");
        Student firstStudent = new Student(3L,"test");
        Student secondStudent = new Student(4L,"test");
        //add before
        double beforeStudent1 = firstStudent.getTotalStudyTime();
        double beforeStudent2 = secondStudent.getTotalStudyTime();
        double numberOfHoursTaught = 2;
        Student[] students = new Student[] {firstStudent,secondStudent};

        double expected1 = beforeStudent1+ (numberOfHoursTaught/students.length);
        double expected2 = beforeStudent2+ (numberOfHoursTaught/students.length);

        //When
        newInstructor.lecture(students,numberOfHoursTaught);

        //Then
        Assert.assertEquals(expected1, students[0].getTotalStudyTime(),.00);
        Assert.assertEquals(expected2, students[1].getTotalStudyTime(), .00);
    }
}
