package io.zipcoder.interfaces;

public class Person {

    final Long id;
    private String name;

    public Person(Long id) {
        this.id = id;
    }

    public Long getId() {
       return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
