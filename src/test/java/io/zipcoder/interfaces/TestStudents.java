package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void testYungStuds1(){
        //Given
        Students testStudents = Students.getInstance();

        //Then
        Assert.assertTrue(testStudents.findById(1L) instanceof Student);

    }

    @Test
    public void testYungStuds2(){
        //Given
        Students testStudents = Students.getInstance();

        //Then
        Assert.assertTrue(testStudents.findById(2L) instanceof Student);
    }

    @Test
    public void testYungStuds3(){
        //Given
        Students testStudents = Students.getInstance();

        //Then
        Assert.assertTrue(testStudents.findById(3L) instanceof Student);
    }

    @Test
    public void testYungStuds4(){
        //Given
        Students testStudents = Students.getInstance();

        //Then
        Assert.assertTrue(testStudents.findById(4L) instanceof Student);
    }

}
