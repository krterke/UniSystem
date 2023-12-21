package Users;

import Enums.*;


//import Users.*;
import Additional.*;
import Package.*;
import java.io.Serializable;
import java.util.Vector;

public class Student extends User implements Serializable{
//implements OptionalResearcher 
	private static final long serialVersionUID = 123456789L;
    /////
    
    private String studentId;
    private Degree degree;
    private Integer yearOfStudy;
    private Faculty faculty;
    private Double GPA;
    private Integer credits;
    private Course course;
    private Organization organization;
    private Vector<Course> enrolledCourses;
    
    
    public Student() {}
    
    public Student(String name, String surname, Gender gender, String email) {
    	super(name, surname, gender, email);
    	enrolledCourses = new Vector<>();
    }
    
    
    
    public Faculty getFaculty() {
        return this.faculty;
    }
    
    public Degree getDegree() {
        return this.degree;
    }
    
    public String getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    public Integer getYearOfStudy() {
        return this.yearOfStudy;
    }
    
    public void setYearOfStudy(Integer yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    
    public Double getGPA() {
        return this.GPA;
    }
    
    public void setGPA(Double GPA) {
        this.GPA = GPA;
    }
    
    public Integer getCredits() {
        return this.credits;
    }
    
    public void setCredits(Integer credits) {
        this.credits = credits;
    }
    
    
    public String viewCourse() {
        if (course != null) {
            return "Current Course: " + course.getCourseName(); // Assuming Course class has a method to get the course name
        } else {
            return "Not enrolled in any course.";
        }
    }
    
    
    
    public void addCourse(Course course) {
        if (course != null) {
            enrolledCourses.add(course);
            System.out.println("Enrolled in course: " + course.getCourseName());
        } else {
            System.out.println("Cannot enroll in null course.");
        }
    }

    
    
    public boolean dropCourse(Course course) {
        if (course != null && enrolledCourses.contains(course)) {
            enrolledCourses.remove(course);
            System.out.println("Dropped course: " + course.getCourseName());
            return true;
        } else {
            System.out.println("Course not found or cannot drop a null course.");
            return false;
        }
    }

    
    
    public String viewMarks() {
        StringBuilder marksInfo = new StringBuilder("Marks:\n");

        for (Course course : enrolledCourses) {
            marksInfo.append("Course: ").append(course.getCourseName()).append("\n");

            // Assuming the GradeBook class has a method to retrieve marks
            GradeBook gradeBook = course.getGradebook();
            if (gradeBook != null) {
                // Assuming GradeBook has a method to get marks for the student
                Vector<Double> studentMarks = gradeBook.getStudentMarks(this);

                if (studentMarks != null && !studentMarks.isEmpty()) {
                    marksInfo.append("Marks: ").append(studentMarks).append("\n");
                } else {
                    marksInfo.append("No marks available for this course.\n");
                }
            } else {
                marksInfo.append("No GradeBook available for this course.\n");
            }
        }

        return marksInfo.toString();
    }

    
    
    public String viewTranscript() {
        StringBuilder transcriptInfo = new StringBuilder("Transcript:\n");

        for (Course course : enrolledCourses) {
            transcriptInfo.append("Course: ").append(course.getCourseName()).append("\n");

            // Assuming the GradeBook class has a method to retrieve marks
            GradeBook gradeBook = course.getGradebook();
            if (gradeBook != null) {
                // Assuming GradeBook has a method to get marks for the student
                Vector<Double> studentMarks = gradeBook.getStudentMarks(this);

                if (studentMarks != null && !studentMarks.isEmpty()) {
                    transcriptInfo.append("Marks: ").append(studentMarks).append("\n");
                } else {
                    transcriptInfo.append("No marks available for this course.\n");
                }
            } else {
                transcriptInfo.append("No GradeBook available for this course.\n");
            }
        }

        return transcriptInfo.toString();
    }

    
    
    
    public String getTranscript() {
        StringBuilder transcriptInfo = new StringBuilder("Transcript:\n");

        for (Course course : enrolledCourses) {
            transcriptInfo.append("Course: ").append(course.getCourseName()).append("\n");

            // Assuming the GradeBook class has a method to retrieve marks
            GradeBook gradeBook = course.getGradebook();
            if (gradeBook != null) {
                // Assuming GradeBook has a method to get marks for the student
                Vector<Double> studentMarks = gradeBook.getStudentMarks(this);

                if (studentMarks != null && !studentMarks.isEmpty()) {
                    transcriptInfo.append("Marks: ").append(studentMarks).append("\n");
                } else {
                    transcriptInfo.append("No marks available for this course.\n");
                }
            } else {
                transcriptInfo.append("No GradeBook available for this course.\n");
            }
        }

        return transcriptInfo.toString();
    }

    
    
    
    public String getInfoAboutTeacher() {
        StringBuilder teacherInfo = new StringBuilder("Teachers Information:\n");

        for (Course course : enrolledCourses) {
            teacherInfo.append("Course: ").append(course.getCourseName()).append("\n");

            // Assuming the Course class has a method to retrieve the teacher
            Teacher teacher = course.getTeacher();
            if (teacher != null) {
                teacherInfo.append("Teacher: ").append(teacher.getName()).append(" ").append(teacher.getSurname()).append("\n");
                // Add more teacher information as needed
            } else {
                teacherInfo.append("No teacher information available for this course.\n");
            }
        }

        return teacherInfo.toString();
    }

    
    
    
    public void rateTeachers(String selectedCourseName, int rating) {
        Course selectedCourse = findCourseByName(selectedCourseName);

        if (selectedCourse != null) {
            Teacher teacher = selectedCourse.getTeacher();

            if (teacher != null) {
                // You may want to add validation for the rating (e.g., between 1 and 5)
                teacher.addRating(rating);
                System.out.println("Teacher rated successfully!");
            } else {
                System.out.println("No teacher assigned to the selected course.");
            }
        } else {
            System.out.println("Course not found.");
        }
    }

    // Helper method to find a course by name
    private Course findCourseByName(String courseName) {
        for (Course course : enrolledCourses) {
            if (course.getCourseName().equalsIgnoreCase(courseName)) {
                return course;
            }
        }
        return null;
    }

    
    
    
    
    public void becomeAMemberOfOrganization(Organization organization) {
        if (organization != null) {
            this.organization = organization;
            System.out.println("Successfully joined the organization: " + organization.getOrganizationName());
        } else {
            System.out.println("Cannot join a null organization.");
        }
    }

    
    
    public String quitOrganization() {
        if (organization != null) {
            String organizationName = organization.getOrganizationName();
            this.organization = null;
            return "Successfully quit the organization: " + organizationName;
        } else {
            return "Not a member of any organization.";
        }
    }
    
    
    public static Student createStudent(String name, String surname, Gender gender, String email) {
    	Student student = new Student();
    	student.setName(name);
    	student.setSurname(surname);
        student.setGender(gender);
        student.setEmail(email);
        return student;
    }
    
}
