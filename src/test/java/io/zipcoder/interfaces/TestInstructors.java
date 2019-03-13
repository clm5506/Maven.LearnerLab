package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void testInstructors(){
        //Given
        Instructors testInstructors = Instructors.getInstance();

        //Then
        Assert.assertTrue(testInstructors.findById(1L) instanceof Instructor);
    }
    @Test
    public void testInstructors2(){
        //Given
        Instructors testInstructors = Instructors.getInstance();

        //Then
        Assert.assertTrue(testInstructors.findById(2L) instanceof Instructor);
    }

    @Test
    public void testInstructors3(){
        //Given
        Instructors testInstructors = Instructors.getInstance();

        //Then
        Assert.assertTrue(testInstructors.findById(3L) instanceof Instructor);

    }
    @Test
    public void testInstructors4(){
        //Given
        Instructors testInstructors = Instructors.getInstance();

        //Then
        Assert.assertTrue(testInstructors.findById(4L) instanceof Instructor);

    }
    @Test
    public void testInstructors5(){
        //Given
        Instructors testInstructors = Instructors.getInstance();

        //Then
        Assert.assertTrue(testInstructors.findById(5L) instanceof Instructor);
    }
    @Test
    public void testInstructors6(){
        //Given
        Instructors testInstructors = Instructors.getInstance();

        //Then
        Assert.assertTrue(testInstructors.findById(6L) instanceof Instructor);
    }
}
