package users;


/**
* @generated
*/
public class Manager extends Employee {
    
    /**
    * @generated
    */
    private Faculty faculty;
    
    /**
    * @generated
    */
    private ManagerType managerType;
    
    
    /**
    * @generated
    */
    private DeansOffice deansOffice;
    
    /**
    * @generated
    */
    private News news;
    
    

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
    private ManagerType getManagerType() {
        return this.managerType;
    }
    
    /**
    * @generated
    */
    private ManagerType setManagerType(ManagerType managerType) {
        this.managerType = managerType;
    }
    
    
    
    /**
    * @generated
    */
    public News getNews() {
        return this.news;
    }
    
    /**
    * @generated
    */
    public News setNews(News news) {
        this.news = news;
    }
    
    
    /**
    * @generated
    */
    public DeansOffice getDeansOffice() {
        return this.deansOffice;
    }
    
    /**
    * @generated
    */
    public DeansOffice setDeansOffice(DeansOffice deansOffice) {
        this.deansOffice = deansOffice;
    }
    
    
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public String viewInfoAboutStudent() {
        //TODO
        return "";
    }
    
    /**
    * @generated
    */
    public String viewInfoAboutTeacher() {
        //TODO
        return "";
    }
    
    /**
    * @generated
    */
    public boolean approveStudentsRegistration() {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public String viewRequests() {
        //TODO
        return "";
    }
    
    /**
    * @generated
    */
    public boolean assignCoursesToTeachers() {
        //TODO
        return false;
    }
    
    
}
