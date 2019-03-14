package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    private double totalStudyTime;


    public Student(Long id, String name) {
        super(id, name);
    }

    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
