package course;

import java.util.Objects;
import java.util.Vector;

import users.Teacher;
import users.Student;
import enums.CourseType;

public class Course {
    
    
    private String courseId;
    private Vector<Lesson> lessons;
    private GradeBook gradebook;
    private CourseType courseType;
    private int credit;
    private int studentLimit;
    private Vector<Teacher> teachers;
    private String prerequisite;
    private Vector<Student> students;
    private GradeBook gradeBook;
    private Teacher teacher;
    private Lesson lesson;
    private System system;
    private Student student;
	public int courseID;
    
    // getter and setters
    private String getCourseId() {
        return this.courseId;
    }
    
    private void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    
    private Vector<Lesson> getLessons() {
        return this.lessons;
    }
    
    private void setLessons(Vector<Lesson> lessons) {
        this.lessons = lessons;
    }
    
    private GradeBook getGradebook() {
        return this.gradebook;
    }
    
    private void setGradebook(GradeBook gradebook) {
        this.gradebook = gradebook;
    }
    
    
    private CourseType getCourseType() {
        return this.courseType;
    }
    
    private void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }
    
    private int getCredit() {
        return this.credit;
    }
    
    private void setCredit(Integer credit) {
        this.credit = credit;
    }
    
    private int getStudentLimit() {
        return this.studentLimit;
    }
    
    private void setStudentLimit(Integer studentLimit) {
        this.studentLimit = studentLimit;
    }
    
    private Vector<Teacher> getTeachers() {
        return this.teachers;
    }
    
    private void setTeachers(Vector<Teacher> teachers) {
        this.teachers = teachers;
    }
    
    
    private String getPrerequisite() {
        return this.prerequisite;
    }
    
    private void setPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
    }
    
    private Vector<Student> getStudents() {
        return this.students;
    }
    
    private void setStudents(Vector<Student> students) {
        this.students = students;
    }
    
    public Teacher getTeacher() {
        return this.teacher;
    }
    
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    
    public System getSystem() {
        return this.system;
    }
    
    public void setSystem(System system) {
        this.system = system;
    }
    
    public Lesson getLesson() {
        return this.lesson;
    }
    
    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }
    
    public Student getStudent() {
        return this.student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }
    
    public GradeBook getGradeBook() {
        return this.gradeBook;
    }
    
    public void setGradeBook(GradeBook gradeBook) {
        this.gradeBook = gradeBook;
    }

    //                          Operations                                  
    
    public boolean addStudents(Vector <Student> newStudents) {
        if (students == null) students = new Vector();
    
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
        } else {
            System.out.println("Student not found in the course.");
            return false;
        }
    }
    public String viewPrequisite() {
        if (prerequisite != null && !prerequisite.isEmpty()) {
            return "Prerequisite for this course: " + prerequisite;
        } else {
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
