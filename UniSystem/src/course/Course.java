package course;

import java.util.Objects;

import java.util.Vector;

import enums.CourseType;
import users.Student;
import users.Teacher;


public class Course {

    private String courseId;
    private String courseName;
    private Vector<Lesson> lessons;
    private GradeBook gradebook;
    private CourseType courseType;
    private Integer credit;
    private Integer studentLimit;
    private Vector<Teacher> teachers;
    private String prerequisite;
    private Vector<Student> students;
//    private GradeBook gradeBook;
    private Teacher teacher;
//    private Lesson lesson;
//    private Database database;
//    private Student student;
   
	public Course() {}
	public Course(String courseId, String courseName, int credit) {
		this.courseId = courseId;
		this.courseName= courseName;
		this.credit = credit;
	}
    
    public String getCourseName() {
        return this.courseName;
    }
    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    
    public String getCourseId() {
        return this.courseId;
    }
    
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    
    public Vector<Lesson> getLessons() {
        return this.lessons;
    }
    
    public void setLessons(Vector<Lesson> lessons) {
        this.lessons = lessons;
    }
    
    public GradeBook getGradebook() {
        return this.gradebook;
    }
    
    public void setGradebook(GradeBook gradebook) {
        this.gradebook = gradebook;
    }
    
    public CourseType getCourseType() {
        return this.courseType;
    }
    
    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }
    
    public Integer getCredit() {
        return this.credit;
    }
    
    public void setCredit(Integer credit) {
        this.credit = credit;
    }
    
    public Integer getStudentLimit() {
        return this.studentLimit;
    }
    
    public void setStudentLimit(Integer studentLimit) {
        this.studentLimit = studentLimit;
    }
    
    public Vector<Teacher> getTeachers() {
        return this.teachers;
    }
    
    public void setTeachers(Vector<Teacher> teachers) {
        this.teachers = teachers;
    }
    
    public String getPrerequisite() {
        return this.prerequisite;
    }
    
    public void setPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
    }
    
    public Vector<Student> getStudents() {
        return this.students;
    }
    
    public void setStudents(Vector<Student> students) {
        this.students = students;
    }
    
    
    
    
    
    public Teacher getTeacher() {
        return this.teacher;
    }
    
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    

    
    
    
    public boolean addStudents(Vector <Student> newStudents) {
        if (students == null) students = new Vector<>();
    
        if (students.size() + newStudents.size()> studentLimit) {
        	System.out.println("Cannot add students. Exceeded limit");
        	return false;
        }
        students.addAll(newStudents);
        System.out.println("Students added successfully to the course.");
        return true;
    }
    
    public boolean deleteStudent(Student studentToRemove) {
        if (students == null || students.isEmpty()) {
            System.out.println("No students enrolled in the course.");
            return false;
        }

        if (students.contains(studentToRemove)) {
            students.remove(studentToRemove);
            System.out.println("Student removed from the course.");
            return true;
        } 
        else {
            System.out.println("Student not found in the course.");
            return false;
        }
    }
    
    public String viewPrequisite() {
        if (prerequisite != null && !prerequisite.isEmpty()) {
            return "Prerequisite for this course: " + prerequisite;
        } 
        else {
            return "No prerequisite specified for this course.";
        }
    }
    
 
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; 
        
        if (o == null || getClass() != o.getClass()) return false; 
        
        Course other = (Course) o;
        return Objects.equals(this.courseId, other.courseId);
    
    }
    
    @Override
    public String toString() {
        return "Course ID: " + courseId +
                ", Type: " + courseType +
                ", Credits: " + credit +
                ", Student Limit: " + studentLimit +
                ".";
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(courseId);
    }    
    
    
}
