package io.zipcoder.interfaces;

public class Instructors extends People{

    Instructor leon = new Instructor(1L);
    Instructor will = new Instructor(2L);
    Instructor nhu = new Instructor(3L);
    Instructor kris = new Instructor(4L);
    Instructor froilan = new Instructor(5L);
    Instructor dolio = new Instructor(6L);

    Instructor[] teachers = new Instructor[]{leon, will, nhu,
                                             kris, froilan, dolio};

    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        for(Instructor i : teachers)
        super.add(i);
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}