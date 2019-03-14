package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        //Given
        Student student = new Student(1L,"test");

        //When
        Assert.assertTrue(student instanceof Learner);

    }

    @Test
    public void testInheritance(){

        //Given
        Student student = new Student(2L,"test2");

        //When
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        //Given
        Student student = new Student(3L,"test");
        double before = student.getTotalStudyTime();

        //When
        student.learn(3);

        //Then
        Assert.assertTrue(student.getTotalStudyTime() == 3);

    }
    @Test
    public void testLearn2(){
        //Given
        Student student = new Student(3L,"test");
        double before = student.getTotalStudyTime();

        //When
        student.learn(3);
        student.learn(3);

        //Then
        Assert.assertTrue(student.getTotalStudyTime() == 6);

    }
}
