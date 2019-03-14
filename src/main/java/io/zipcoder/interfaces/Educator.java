package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    FROILAN,
    LEON,
    DOLIO,
    NHU,
    KRIS,
    WILHELM;

    private final Instructor instructor;

    Educator() {
        this.instructor = new Instructor((long) ordinal(), name());
    }

    public void teach(Learner learner, double numberOfHours) {
        this.instructor.teach(learner,numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        this.instructor.lecture(learners, numberOfHours);

    }
}
