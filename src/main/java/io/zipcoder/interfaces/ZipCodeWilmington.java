package io.zipcoder.interfaces;

public class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    Students zipCodeStudents = Students.getInstance();
    Instructors zipCodeInstructors = Instructors.getInstance();

    private ZipCodeWilmington(){
    }

    public ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        Person[] personArray = zipCodeStudents.getArray();
            teacher.lecture( (Student[]) zipCodeStudents.getArray(), numberOfHours);
    }

    public void hostLecture(Long id, double numberOfHours){
        for(Instructor instructor : (Instructor[]) zipCodeInstructors.getArray()){
            if(instructor.getId() == id){
             hostLecture(instructor, numberOfHours);
         }
        }

    }
}
