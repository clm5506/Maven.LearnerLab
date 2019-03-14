package io.zipcoder.interfaces;

public class Instructors extends People<Instructor>{

    Instructor leon = new Instructor(1L, "Leon");
    Instructor will = new Instructor(2L, "Will");
    Instructor nhu = new Instructor(3L, "Nhu");
    Instructor kris = new Instructor(4L, "Kris");
    Instructor froilan = new Instructor(5L, "Froilan");
    Instructor dolio = new Instructor(6L, "Dolio");

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

    @Override
    public Instructor[] getArray(){
        return this.teachers;
    }
}