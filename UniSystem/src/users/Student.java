package users;


/**
* @generated
*/
public class Student extends User implements OptionalResearcher {
    
    /**
    * @generated
    */
    private String studentId;
    
    /**
    * @generated
    */
    private Degree degree;
    
    /**
    * @generated
    */
    private int yearOfStudy;
    
    /**
    * @generated
    */
    private Faculty faculty;
    
    /**
    * @generated
    */
    private double GPA;
    
    /**
    * @generated
    */
    private int credits;
    
    
    /**
    * @generated
    */
    private Course course;
    
    /**
    * @generated
    */
    private Organization organization;
    
    

    /**
    * @generated
    */
    private String getStudentId() {
        return this.studentId;
    }
    
    /**
    * @generated
    */
    private String setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    
    /**
    * @generated
    */
    private Degree getDegree() {
        return this.degree;
    }
    
    /**
    * @generated
    */
    private Degree setDegree(Degree degree) {
        this.degree = degree;
    }
    
    
    /**
    * @generated
    */
    private int getYearOfStudy() {
        return this.yearOfStudy;
    }
    
    /**
    * @generated
    */
    private int setYearOfStudy(Integer yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
    
    
    /**
    * @generated
    */
    private Faculty getFaculty() {
        return this.faculty;
    }
    
    /**
    * @generated
    */
    private Faculty setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
    
    
    /**
    * @generated
    */
    private double getGPA() {
        return this.GPA;
    }
    
    /**
    * @generated
    */
    private double setGPA(Double GPA) {
        this.GPA = GPA;
    }
    
    
    /**
    * @generated
    */
    private int getCredits() {
        return this.credits;
    }
    
    /**
    * @generated
    */
    private int setCredits(Integer credits) {
        this.credits = credits;
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
    
    
    /**
    * @generated
    */
    public Organization getOrganization() {
        return this.organization;
    }
    
    /**
    * @generated
    */
    public Organization setOrganization(Organization organization) {
        this.organization = organization;
    }
    
    
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public String viewCourse() {
        //TODO
        return "";
    }
    
    /**
    * @generated
    */
    public boolean addCourse() {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public boolean dropCourse() {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public String viewMarks() {
        //TODO
        return "";
    }
    
    /**
    * @generated
    */
    public String viewTranscript() {
        //TODO
        return "";
    }
    
    /**
    * @generated
    */
    public String getTranscript() {
        //TODO
        return "";
    }
    
    /**
    * @generated
    */
    public String getInfoAboutTeacher() {
        //TODO
        return "";
    }
    
    /**
    * @generated
    */
    public void rateTeachers() {
        //TODO
    }
    
    /**
    * @generated
    */
    public void becomeAMemberOfOrganization() {
        //TODO
    }
    
    /**
    * @generated
    */
    public String quitOrganization() {
        //TODO
        return "";
    }
    
    
}
