package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture() {
        //Given
        ZipCodeWilmington testZCW = ZipCodeWilmington.getInstance();
        Students instanceOfStudents = Students.getInstance();
        Student[] students = instanceOfStudents.getArray();
        double numberOfHoursToBeTaught = 20L;
        double beforeNumOfHours = students[0].getTotalStudyTime();
        double expected = beforeNumOfHours + (numberOfHoursToBeTaught / students.length);

        //When
        testZCW.hostLecture(4L, numberOfHoursToBeTaught);

        //Then
        Assert.assertEquals(expected, students[0].getTotalStudyTime(), 0.00);
    }
    @Test
    public void testHostLectureFroilan() {
        //Given
        ZipCodeWilmington testZCW = ZipCodeWilmington.getInstance();
        Students instanceOfStudents = Students.getInstance();
        Student[] students = instanceOfStudents.getArray();
        double numberOfHoursToBeTaught = 20L;
        double beforeNumOfHours = students[0].getTotalStudyTime();
        double expected = beforeNumOfHours + (numberOfHoursToBeTaught / students.length);

        //When
        testZCW.hostLecture(Instructors.getInstance().froilan, numberOfHoursToBeTaught);

        //Then
        Assert.assertEquals(expected, students[0].getTotalStudyTime(), 0.00);
    }

    @Test
    public void testHostLectureLeon() {
        //Given
        ZipCodeWilmington testZCW = ZipCodeWilmington.getInstance();
        Students instanceOfStudents = Students.getInstance();
        Student[] students = instanceOfStudents.getArray();
        double numberOfHoursToBeTaught = 20L;
        double beforeNumOfHours = students[0].getTotalStudyTime();
        double expected = beforeNumOfHours + (numberOfHoursToBeTaught / students.length);

        //When
        testZCW.hostLecture(Instructors.getInstance().leon, numberOfHoursToBeTaught);

        //Then
        Assert.assertEquals(expected, students[0].getTotalStudyTime(), 0.00);
    }

    @Test
    public void testHostLectureKris() {
        //Given
        ZipCodeWilmington testZCW = ZipCodeWilmington.getInstance();
        Students instanceOfStudents = Students.getInstance();
        Student[] students = instanceOfStudents.getArray();
        double numberOfHoursToBeTaught = 20L;
        double beforeNumOfHours = students[0].getTotalStudyTime();
        double expected = beforeNumOfHours + (numberOfHoursToBeTaught / students.length);

        //When
        testZCW.hostLecture(Instructors.getInstance().kris, numberOfHoursToBeTaught);

        //Then
        Assert.assertEquals(expected, students[0].getTotalStudyTime(), 0.00);
    }
    @Test
    public void testHostLectureWill() {
        //Given
        ZipCodeWilmington testZCW = ZipCodeWilmington.getInstance();
        Students instanceOfStudents = Students.getInstance();
        Student[] students = instanceOfStudents.getArray();
        double numberOfHoursToBeTaught = 20L;
        double beforeNumOfHours = students[0].getTotalStudyTime();
        double expected = beforeNumOfHours + (numberOfHoursToBeTaught / students.length);

        //When
        testZCW.hostLecture(Instructors.getInstance().will, numberOfHoursToBeTaught);

        //Then
        Assert.assertEquals(expected, students[0].getTotalStudyTime(), 0.00);
    }

}
