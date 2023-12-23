package additional;


import java.util.Objects;
import database.*;
import java.util.Vector;

import users.*;

public class Organization{
    
    private String nameOfOrganization;
    private Vector<Student> members;
    private Student president;
    private Database database;
    private Student student;
    
    
    
    public Organization(){}
    
    public Organization(String nameOfOrganization, Database database, Student student){
        this.nameOfOrganization = nameOfOrganization;
        this.database = database;
        this.student = student;
    }
    public Organization(String nameOfOrganization){
        this.nameOfOrganization = nameOfOrganization;
    }
    
    
    
    public String getNameOfOrganization() {
        return nameOfOrganization;
    }
    
    public void setNameOfOrganization(String nameOfOrganization) {
        this.nameOfOrganization = nameOfOrganization;
    }
    
    public Vector<Student> getMembers() {
        return this.members;
    }
    
    public void setMembers(Vector<Student> members) {
        this.members = members;
    }
    
    public Student getPresident() {
        return this.president;
    }
    
    public void setPresident(Student president) {
        this.president = president;
    }
    
    public boolean addMember(Student student) {
        for(Student cur:members){
			if(cur.equals(student)) {
				return false;
			}
		}
		members.add(student);
		return true;
    }
    
    public boolean dropMember(Student student) {
        for(Student cur:members) {
			if(cur.equals(student)) {
				members.remove(student);
				return true;
			}
		}
		return false;
    }
    
    
    public String toString() {
		return "Name: " + nameOfOrganization +"\n"+"President: "+president;
	}
    
    
    
    //my
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organization that = (Organization) o;
        return Objects.equals(nameOfOrganization, that.nameOfOrganization);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(nameOfOrganization);
    }
    
}
