package course;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import enums.*;
import users.*;

public class GradeBook {
    
   
    private Integer studentId;
    private Integer gradeAtt1;
    private Integer gradeAtt2;
    private Integer finalExam;
    private Marks mark;
//    private Course course;
    
   
    
    
    public Integer getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
    
    public Integer getGradeAtt1() {
        return this.gradeAtt1;
    }
    
    public void setGradeAtt1(Integer gradeAtt1) {
        this.gradeAtt1 = gradeAtt1;
    }
    
    public Integer getGradeAtt2() {
        return this.gradeAtt2;
    }
    
    public void setGradeAtt2(Integer gradeAtt2) {
        this.gradeAtt2 = gradeAtt2;
    }
    
    public Integer getFinalExam() {
        return this.finalExam;
    }
    
    public void setFinalExam(Integer finalExam) {
        this.finalExam = finalExam;
    }
    
    public Marks getMark() {
        return this.mark;
    }
    
    public void setMark(Marks mark) {
        this.mark = mark;
    }

    
    
    
    
    // Assuming marks are stored in a map with the student as the key
    private Map<Student, Vector<Double>> marksMap;
    
    public GradeBook() {
    	this.marksMap = new HashMap<>();
    }
    
    // Method to add marks for a student
    public void addMarks(Student student, Vector<Double> marks) {
        marksMap.put(student, marks);
    }

    // Method to get marks for a student
    public Vector<Double> getStudentMarks(Student student) {
        return marksMap.get(student);
    }
    
    
    
    
}
