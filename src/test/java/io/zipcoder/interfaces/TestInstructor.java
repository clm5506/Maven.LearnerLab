package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        //Given
        Instructor newInstructor = new Instructor(2L);

        //Then
        Assert.assertTrue(newInstructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        //Given
        Instructor newInstructor = new Instructor(2L);

        //Then
        Assert.assertTrue(newInstructor instanceof Person);
    }

    @Test
    public void testTeach(){
        //Given
        Instructor newInstructor = new Instructor(4L);
        Student newStudent = new Student(3L);
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
        Instructor newInstructor = new Instructor(4L);
        Student firstStudent = new Student(3L);
        Student secondStudent = new Student(4L);
        double expected = 2;
        Student[] students = new Student[] {firstStudent,secondStudent};

        //When
        newInstructor.lecture(students,expected);

        //Then
        Assert.assertEquals(expected/2, students[0].getTotalStudyTime(),.00);
        Assert.assertEquals(expected/2, students[1].getTotalStudyTime(), .00);
    }
}
