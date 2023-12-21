package additional;

import java.io.Serializable;
import java.util.Vector;

import users.Student;

public class Organization implements Serializable{
    private String nameOfOrganization;
    private Vector<Student> members;
    private Student president;
    private System system;
    private Student student;

    public Organization(){

    }
    public Organization(String nameOfOrganization, System system, Student student){
        this.nameOfOrganization = nameOfOrganization;
        this.system = system;
        this.student = student;
    }

    private String getNameOfOrganization() {
        return this.nameOfOrganization;
    }
    private String setNameOfOrganization(String nameOfOrganization) {
        this.nameOfOrganization = nameOfOrganization;
    }
    private Vector<Student> getMembers() {
        return this.members;
    }
    private Vector<Student> setMembers(Vector<Student>2 members) {
        this.members = members;
    }
    private Student getPresident() {
        return this.president;
    }
    private Student setPresident(Student president) {
        this.president = president;
    }
    public boolean addMember(Student S) {
        for(Student cur:members){
			if(cur.equals(s)) {
				return false;
			}
		}
		members.add(s);
		return true;
    }
    public boolean dropMember(Student S) {
        for(Student cur:members) {
			if(cur.equals(s)) {
				members.remove(s);
				return true;
			}
		}
		return false;
    }
    public String toString() {
		return "Name: "+nameOfOrganization+"\n"+"President: "+president;
	}
    
    
}
