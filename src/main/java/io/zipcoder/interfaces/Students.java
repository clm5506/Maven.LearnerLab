package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Students extends People {

    private Student marci = new Student(1L);
    private Student brian = new Student(2L);
    private Student charlie = new Student(3L);
    private Student davis = new Student(4L);

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

//    public Student[] getArray(){
//        return yungStuds;
//    }
}
