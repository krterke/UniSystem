package course;

import java.util.Map;

import enums.*;

public class GradeBook {
    private String studentId;
    private Map<String, Integer> gradeAtt1;
    private Map<String, Integer> gradeAtt2;
    private Map<String, Integer> finalExam;
//    private Map<String, Integer> marks;
    private Marks mark;
    private Course course;
    
    //getters and setters
    private String getStudentId() {
        return this.studentId;
    }
    private void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    private  Map<String, Integer> getGradeAtt1() {
        return this.gradeAtt1;
    }
    private void setGradeAtt1(Map<String, Integer> gradeAtt1) {
        this.gradeAtt1 = gradeAtt1;
    }
    private Map<String, Integer> getGradeAtt2() {
        return this.gradeAtt2;
    }
    private void setGradeAtt2(Map<String, Integer> gradeAtt2) {
        this.gradeAtt2 = gradeAtt2;
    }
    private Map<String, Integer> getFinalExam() {
        return this.finalExam;
    }
    private void setFinalExam(Map<String, Integer> finalExam) {
        this.finalExam = finalExam;
    }
    private Marks getMark() {
        return this.mark;
    }
    private void setMark(Marks mark) {
        this.mark = mark;
    }
    
    public Course getCourse() {
        return this.course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }
    
    //methods
    public void viewStudentMarks(String studentId) {
        if (mark.containsKey(studentId)) {
            System.out.println("Marks for Student ID " + studentId + ": " + mark.get(studentId));
        } else {
            System.out.println("No marks available for Student ID " + studentId);
        }
    }
    
    public void setStudentMarks(String studentId, int marksValue) {
        if (mark.contains(studentId)) {
            mark.replace(studentId, marksValue);
            System.out.println("Marks updated for Student ID " + studentId);
        } else {
            System.out.println("Student ID " + studentId + " not found in the gradebook.");
        }
    }
    
    

    
    
}
