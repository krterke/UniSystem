package Users;

import java.io.Serializable;


import Database.*;
import Users.*;
import Enums.*;
import Package.*;
import Additional.*;

public class Manager extends Employee implements Serializable{
    
    private Faculty faculty;
    private ManagerType managerType;
    private News news;
    
    public Manager() {}
    
    public Manager(String name, String surname, Gender gender, String email) throws Exception {
    	super(name, surname, gender, email);
    }
    
    
    
    private Faculty getFaculty() {
        return this.faculty;
    }
    
    private ManagerType getManagerType() {
        return this.managerType;
    }
    
   
    public String viewInfoAboutStudent() {
        //TODO
        return "";
    }
    
    public String viewInfoAboutTeacher() {
        //TODO
        return "";
    }
    
    public boolean approveRegistration(String id, int courseID) {
		Course c = new Course();
		for (Course cur : Database.courses) {
			if (cur.courseID == courseID) {
				c = cur;
			}
		}

		for (User u : Database.users) {
			if (u instanceof Student) {
				Student i = (Student) u;
				if (i.getId().equals(id)) {
					c.students.add(i);
					return true;
				}
			}
		}
		return false;
	}

    
    public String viewRequests() {
        //TODO
        return "";
    }
    
    public boolean assignCoursesToTeachers() {
        //TODO
        return false;
    }
    
    
    
    public static Manager createManager(String name, String surname, Gender gender, String email) throws Exception {
    	return new Manager(name, surname, gender, email);
    }
    
}
