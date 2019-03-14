package io.zipcoder.interfaces;

public class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private static final Students zipCodeStudents = Students.getInstance();
    private static final Instructors zipCodeInstructors = Instructors.getInstance();

    private ZipCodeWilmington(){
    }

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){

            teacher.lecture( zipCodeStudents.getArray(), numberOfHours);
    }

    public void hostLecture(Long id, double numberOfHours){
        for(Instructor instructor : zipCodeInstructors.getArray()){
            if(instructor.getId() == id){
             hostLecture(instructor, numberOfHours);
         }
        }

    }
}
