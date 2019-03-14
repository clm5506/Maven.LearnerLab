package io.zipcoder.interfaces;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class People {

    List<Person> personList;

    public People() {
        this.personList = new ArrayList<Person>();
    }

    public void add(Person person){
        this.personList.add(person);
    }

    public Person findById(Long id){
        for(Person p : personList){
            if(p.getId() == id){
               return p;
            }
        } throw new InvalidParameterException();

    }

    public void remove(Person person){
        this.personList.remove(person);
    }

    public void remove(Long id){
        for(Person p : personList){
            if(p.getId() == id){
                personList.remove(p);
            }
        }
    }

    public int getCount(){
        return this.personList.size();
    }

    public Person[] getArray(){

        Person[] answer = this.personList.toArray(new Person[0]);
        return answer;
    }

    public void removeAll(){
        this.personList.clear();
    }
}
