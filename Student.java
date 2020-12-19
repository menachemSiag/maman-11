/**
 * Created by Menachem on 16/12/2020.
 */
public class Student {
    protected int _numOfCourses;
    protected double _averageGrade;
    protected String [] _courses;
    protected double [] _grades;
    protected final int MAX_NUM_OF_COURSES = 10;

//    first constructor
    public Student(Person person) {
        _courses =  new String [10];
        _grades = new double [10];
        _averageGrade = 0;
    }

//    second constructor
    public Student(Person p, String [] courses, double [] grades){

    }
}
