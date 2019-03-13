package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd(){
        //Given
        People people = new People();

        Person personOne = new Person(3L);
        Person personTwo = new Person(2L);

        //When
        people.add(personOne);
        people.add(personTwo);

        //Then
        Assert.assertEquals(personOne, people.getArray()[0]);
        Assert.assertEquals(personTwo, people.getArray()[1]);
    }

    @Test
    public void testRemove(){
        //Given
        People people = new People();

        Person personOne = new Person(3L);
        Person personTwo = new Person(4L);
        people.add(personOne);
        people.add(personTwo);

        //When
        people.remove(personOne);

        //Then
        Assert.assertTrue(people.getCount() == 1);
    }

    @Test
    public void testFindBy(){
        //Given
        People people = new People();

        Person personOne = new Person(3L);
        Person personTwo = new Person(4L);

        //When
        people.add(personOne);
        people.add(personTwo);

        //Then
        Assert.assertEquals(personTwo, people.findById(4L));
    }
}
