package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture(){
        //Given
        ZipCodeWilmington testZCW = ZipCodeWilmington.getInstance();
        Students instanceOfStudents =  Students.getInstance();
        Student[] students = instanceOfStudents.getArray();
        double numberOfHoursToBeTaught = 20L;
        double beforeNumOfHours = students[0].getTotalStudyTime();
        double expected = numberOfHoursToBeTaught/students.length;

        //When
        testZCW.hostLecture(4L,numberOfHoursToBeTaught);

        //Then
        Assert.assertEquals(expected, students[0].getTotalStudyTime());
    }
}
