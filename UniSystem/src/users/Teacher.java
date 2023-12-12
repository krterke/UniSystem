package users;


/**
* @generated
*/
public class Teacher extends Employee implements Researcher {
    
    /**
    * @generated
    */
    private TeacherType teacherType;
    
    
    /**
    * @generated
    */
    private Course course;
    
    

    /**
    * @generated
    */
    private TeacherType getTeacherType() {
        return this.teacherType;
    }
    
    /**
    * @generated
    */
    private TeacherType setTeacherType(TeacherType teacherType) {
        this.teacherType = teacherType;
    }
    
    
    
    /**
    * @generated
    */
    public Course getCourse() {
        return this.course;
    }
    
    /**
    * @generated
    */
    public Course setCourse(Course course) {
        this.course = course;
    }
    
    
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public String getInfoAboutStudent() {
        //TODO
        return "";
    }
    
    /**
    * @generated
    */
    public String getInfoAboutStudents() {
        //TODO
        return "";
    }
    
    
}
