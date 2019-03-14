package io.zipcoder.interfaces;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public abstract class People<E extends Person>{

    List<E> personList;

    public People() {
        this.personList = new ArrayList<E>();
    }

    public void add(E e){
        this.personList.add(e);
    }

    public E findById(Long id){
        for(E e : personList){
            if(e.getId() == id){
               return e;
            }
        } throw new InvalidParameterException();

    }

    public void remove(E e){
        this.personList.remove(e);
    }

    public void remove(Long id){

        personList.remove(findById(id));

    }

    public int getCount(){
        return this.personList.size();
    }

    public E[] getArray(){

        E[] answer = (E[]) this.personList.toArray(new Person[0]);
        return answer;
    }

    public void removeAll(){
        this.personList.clear();
    }
}
