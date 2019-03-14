package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public final class Students extends People<Student> {

    private Student marci = new Student(1L, "Marci");
    private Student brian = new Student(2L, "Brian");
    private Student charlie = new Student(3L, "Charlie");
    private Student davis = new Student(4L, "Davis");

    Student[] yungStuds = new Student[]{ marci,brian,charlie,davis };

    private static final Students INSTANCE = new Students();

    private Students(){
        for(Student s : yungStuds) {
            super.add(s);
        }
    }

    public static Students getInstance(){
        return INSTANCE;
    }

    @Override
   public Student[] getArray(){
        return yungStuds;
    }
}
