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
	
	public static Admin getInstance(String name, String surname, Gender gender, String email) throws Exception {
		if(instance == null) {
			instance = new Admin(name, surname, gender, email);
		}
		return instance;
	}
	
	//methods
	public void addUser(String name,  String surname, Gender gender, String email) throws NumberFormatException, Exception {
		//User newUser = new User(email, phoneNumber, id, gender, name, surname);
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
//					db.addUser(Researcher.createResearcher(email, phoneNumber, gender, name, surname));
//					break;
//				}
            }
		}	
		catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}
	public void deleteUser(int id) {
		//
	}
	public void updateUser() {
		//
	}
	
	public void seeLogFiles() {
		//
	}
	
	//toString
	@Override
	public String toString() {
		return super.toString();
	}

}

