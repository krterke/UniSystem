package users;


import java.io.BufferedReader;



import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Vector;

import additional.*;
import database.Database;
import enums.Gender;

public class Admin extends Employee implements Serializable{
	
	
	private static final long serialVersionUID = 123456789L;
	
	
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
		System.out.println("Type of user to add:\n1.Student\n2.Teacher\n3.Manager\n4.Researcher\n5.TechSupportSpecialist\nexit");
		
		try(BufferedReader br = new BufferedReader (new InputStreamReader(System.in))) {
			String text;
			Database db = Database.getInstance();
			
			while(true){
				text=br.readLine();
				
				if(text.equals("exit")) {
					break;
				}
				
				switch(text) {
					case "Student":
						System.out.print("Enter student name: ");
	                    String studentName = br.readLine();

	                    System.out.print("Enter student surname: ");
	                    String studentSurname = br.readLine();

	                    System.out.print("Enter student gender (MALE/FEMALE): ");
	                    Gender studentGender = Gender.valueOf(br.readLine().toUpperCase());

	                    System.out.print("Enter student email: ");
	                    String studentEmail = br.readLine();

	                    db.addUser(Student.createStudent(studentName, studentSurname, studentGender, studentEmail));
	                    System.out.println("Student added successfully!");
	                    break;
						
					case "Teacher":
						db.addUser(Teacher.createTeacher(name, surname, gender, email));
						break;
						
					case "Manager":
						db.addUser(Manager.createManager(name, surname, gender, email));
						break;
						
					case "Researcher":
						db.addUser(IndividualResearcher.createResearcher(name, surname, gender, email));
						break;
						
					case "TechSupportSpecialist":
						db.addUser(TechSupportSpecialist.createTechSupportSpecialist(name, surname, gender, email));
						break;
						
					default:
						System.out.println("Invalid Choice. PLease choose again.");
				}
				
            }
		}	
		catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}
	public void deleteUser(int id) {
		try {
	        Database db = Database.getInstance();
	        Vector<User> users = db.getUsers();

	        // Find the user with the specified id
	        User userToDelete = null;
	        for (User user : users) {
	            if (user.getId().equals(String.valueOf(id))) {
	                userToDelete = user;
	                break;
	            }
	        }

	        // Delete the user if found
	        if (userToDelete != null) {
	            users.remove(userToDelete);
	            System.out.println("User deleted successfully!");
	        } else {
	            System.out.println("User with ID " + id + " not found.");
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
		
		
	}


	
	
	public void updateUser(int id) {
	    try {
	        Database db = Database.getInstance();
	        Vector<User> users = db.getUsers();

	        // Find the user with the specified id
	        User userToUpdate = null;
	        for (User user : users) {
	            if (user.getId().equals(String.valueOf(id))) {
	                userToUpdate = user;
	                break;
	            }
	        }

	        // Update the user if found
	        if (userToUpdate != null) {
	            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
	                System.out.println("Enter updated information for user with ID " + id + ":");

	                System.out.print("Name: ");
	                String updatedName = br.readLine();
	                userToUpdate.setName(updatedName);

	                System.out.print("Surname: ");
	                String updatedSurname = br.readLine();
	                userToUpdate.setSurname(updatedSurname);

	                System.out.print("Gender (MALE/FEMALE): ");
	                Gender updatedGender = Gender.valueOf(br.readLine().toUpperCase());
	                userToUpdate.setGender(updatedGender);

	                System.out.print("Email: ");
	                String updatedEmail = br.readLine();
	                userToUpdate.setEmail(updatedEmail);

	                System.out.println("User updated successfully!");
	            } catch (IOException ex) {
	                ex.printStackTrace();
	            }
	        } else {
	            System.out.println("User with ID " + id + " not found.");
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	
	
	
	
	public void seeLogFiles() {
	    try {
	        Database db = Database.getInstance();
	        Vector<LogFile> logFiles = db.getLogFiles();

	        System.out.println("Log Files:");

	        for (LogFile logFile : logFiles) {
	            System.out.println(logFile.toString());
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	
	
	
	//toString
	@Override
	public String toString() {
		return super.toString();
	}

}

