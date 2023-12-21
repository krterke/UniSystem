package Users;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Vector;

import Enums.Gender;
import Additional.*;
import Database.Database;

public class Admin extends Employee implements Serializable{
	
	//fields
	private static Admin instance;
	
	//constructors
	private Admin() {}
	private Admin(String name, String surname, Gender gender, String email) throws Exception {
		super(name, surname, gender, email);
	}
	
	public static Admin getInstance(Login login, String name, String surname, Gender gender, String email) throws Exception {
		if(instance == null) {
			instance = new Admin(name, surname, gender, email);
		}
		return instance;
	}
	
	//methods
	public void addUser(Login login, String email, int phoneNumber, Gender gender, String name, String surname) throws NumberFormatException, Exception {
		//User newUser = new User(login, email, phoneNumber, id, gender, name, surname);
		System.out.println("Choose type of user:\n1.Student\n2.Teacher\n3.Manager\n4.TechSupportSpecialist\n5.Researcher\nexit");
		try(BufferedReader br = new BufferedReader (new InputStreamReader(System.in))) {
			String text;
			Database db = Database.getInstance();
			while(true){
				text=br.readLine();
				if(text.equals("exit")) {
					break;
				}
				if(text.equals("Student")) {
					db.addUser(Student.createStudent(name, surname, gender, email));
					break;
				}
				else if(text.equals("Teacher")) {
					db.addUser(Teacher.createTeacher(name, surname, gender, email));
					break;
				}
				else if(text.equals("Manager")) {
					db.addUser(Manager.createManager(name, surname, gender, email));
					break;
				}
				else if(text.equals("TechSupportSpecialist")) {
					db.addUser(TechSupportSpecialist.createTechSupportSpecialist(name, surname, gender, email));
					break;
				}
//				else if(text.equals("Researcher")) {
//					db.addUser(Researcher.createResearcher(login, email, phoneNumber, gender, name, surname));
//					break;
//				}
            }
		}	
		catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}
	

	public String addStudent(String name,String surname,Gender gender, String email) {
		Student s=new Student(name,surname,gender, email);
		Database.users.add(s);
		return "Success";
	}
	
	public String addTeacher(String name,String surname,Gender gender, String email){
		Teacher t=new Teacher(name,surname, gender, email);
		Database.users.add(t);
		return "Success";
	}
	
	public boolean deleteUser(String id) {
		for(User cur:Database.users) {
			if(cur.getID()== id) {
				Database.users.remove(cur);
				return true;
			}
		}
		return false;
	}
	public String seeLogFiles() {
		String s="";
		for(LogFiles l:Database.logfiles) {
			s+=l.toString()+"\n";
		}
		return s;
	}
	
	//toString
	@Override
	public String toString() {
		return "Admin [" + super.toString();
	}


}

