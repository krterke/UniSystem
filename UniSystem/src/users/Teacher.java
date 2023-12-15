package Users;

import Additional.*;
import Enums.*;
import Users.*;
import Package.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.stream.Collectors;

public class Teacher extends Employee implements Serializable
//implements Researcher 
{
    
	private TeacherType teacherType;
    private Course course;
    private double rate;
    private int yearOfTeaching;
    private HashMap<WeekDays, Vector<Lesson>> lessons;
    private Map<Course, Map<Student, Map<Marks, Double>>> marksRecord;
    private UrgencyLevel urgencyLevel;
    
    public Teacher() {}
    
    public Teacher(String name, String surname, Gender gender, String email) throws Exception {
    	super(name, surname, gender, email);
    }
    
    
    
    
    private TeacherType getTeacherType() {
        return this.teacherType;
    }
    
    
    public String viewCourses(String filter) {
        
        List<Course> filteredCourses = filterCourses(filter);

        
        StringBuilder courseInfo = new StringBuilder();
        courseInfo.append("Course information based on filter: ").append(filter).append("\n");

        for (Course course : filteredCourses) {
            courseInfo.append(course.toString()).append("\n");
        }

        return courseInfo.toString();
    }
    
    
    private List<Course> filterCoursesByTeacher(String filter, Teacher teacher) {
        return allCourses.stream()
                
                .filter(course -> course.getTeacher().equals(teacher) && course.getName().toLowerCase().contains(filter.toLowerCase()))
                .collect(Collectors.toList()); 
    }
    
    
    
    
    public String getInfoAboutStudent() {
    	StringBuilder info = new StringBuilder();

        if (courses != null && !courses.isEmpty()) {
            info.append("Teacher's Courses:\n");
            for (Course course : courses) {
                info.append("Course: ").append(course.getCourseId()).append("\n");

                List<Student> students = course.getStudents();
                if (students != null && !students.isEmpty()) {
                    info.append("Students enrolled:\n");
                    for (Student student : students) {
                        info.append("- ").append(student.getName()).append("\n");
                        
                    }
                } else {
                    info.append("No students enrolled in this course\n");
                }
                info.append("\n");
            }
        } else {
            info.append("No courses assigned to this teacher\n");
        }
        return info.toString();
    }
    
    
    
    public void putMarks(Course course, Student student, Marks markType, double mark) {
        
        if (marksRecord == null) {
            marksRecord = new HashMap<>();
        }

        marksRecord.putIfAbsent(course, new HashMap<>());

        Map<Student, Map<Marks, Double>> courseMarks = marksRecord.get(course);

        courseMarks.putIfAbsent(student, new HashMap<>());

        Map<Marks, Double> studentMarks = courseMarks.get(student);

        studentMarks.put(markType, mark);

        System.out.println("Mark recorded for Course: " + course.getCourseId() +
                ", Student: " + student.getStudentId() +
                ", MarkType: " + markType + ", Mark: " + mark);
    }
    
    
    
    public boolean sendComplaint(UrgencyLevel urgencyLevel, String message) {
        if (urgencyLevel == null) {
        	urgencyLevel = new UrgencyLevel();
        }

        boolean sentSuccessfully = urgencyLevel.sendComplaint(urgencyLevel, message);

        return sentSuccessfully;
    }
    
    static class ComplaintService {
        
        boolean sendComplaint(UrgencyLevel urgencyLevel, String message) {
            System.out.println("Complaint sent with urgency level: " + urgencyLevel + ", Message: " + message);
            return true; 
        }
    }
    
    
   
    
    
    public static Teacher createTeacher(String name, String surname, Gender gender, String email) throws Exception {
    	return new Teacher(name, surname, gender, email);
    }
    
}
