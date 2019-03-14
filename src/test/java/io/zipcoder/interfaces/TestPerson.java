package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        //Given
        Long id = 1L;
        Person person = new Person(id,"");

        //Then
        Assert.assertEquals(id, person.getId());
    }

    @Test
    public void testSetName(){
        //Given
        Long id = 2L;
        Person person = new Person(id,"");
        String expectedName = "Cristina";

        //When
        person.setName(expectedName);

        //Then
        Assert.assertEquals(expectedName,person.getName());
    }

}
