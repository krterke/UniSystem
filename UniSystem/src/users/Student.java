package Users;

import Enums.*;

import Users.*;
import Additional.*;
import Package.*;
import java.io.Serializable;

public class Student extends User implements Serializable
//implements OptionalResearcher 
{
    /////
    
    private String studentId;
    private Degree degree;
    private Integer yearOfStudy;
    private Faculty faculty;
    private Double GPA;
    private Integer credits;
    private Course course;
    private Organization organization;
    
    
    public Student() {}
    
    public Student(String name, String surname, Gender gender, String email) {
    	super(name, surname, gender, email);
    }
    
    private Faculty getFaculty() {
        return this.faculty;
    }
    
    private Degree getDegree() {
        return this.degree;
    }
    
    private String getStudentId() {
        return this.studentId;
    }
    
    private void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    private Integer getYearOfStudy() {
        return this.yearOfStudy;
    }
    
    private void setYearOfStudy(Integer yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    
    private Double getGPA() {
        return this.GPA;
    }
    
    private void setGPA(Double GPA) {
        this.GPA = GPA;
    }
    
    private Integer getCredits() {
        return this.credits;
    }
    
    private void setCredits(Integer credits) {
        this.credits = credits;
    }
    
    
    public String viewCourse() {
        //TODO
        return "";
    }
    
    public boolean addCourse() {
        //TODO
        return false;
    }
    
    public boolean dropCourse() {
        //TODO
        return false;
    }
    
    public String viewMarks() {
        //TODO
        return "";
    }
    
    public String viewTranscript() {
        //TODO
        return "";
    }
    
    public String getTranscript() {
        //TODO
        return "";
    }
    
    public String getInfoAboutTeacher() {
        //TODO
        return "";
    }
    
    public void rateTeachers() {
        //TODO
    }
    
    public void becomeAMemberOfOrganization() {
        //TODO
    }
    
    
    public String quitOrganization() {
        //TODO
        return "";
    }
    
    
    public static Student createStudent(String name, String surname, Gender gender, String email) {
    	return new Student(name, surname, gender, email);
    }
    
}
