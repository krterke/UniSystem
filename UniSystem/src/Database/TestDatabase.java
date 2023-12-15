package Database;

import java.util.Vector;

import Package.*;
import Enums.*;
import Additional.*;
import Users.*;

public class TestDatabase {
	public static void main(String[] args) throws Exception {
	
		Database system = Database.getInstance();
		
		Vector<User> users = system.getUsers();
		Vector<Employee> employees = system.getEmployees();
		Vector<Student> students = system.getStudents();
		Vector<Teacher> teachers = system.getTeachers();
		Vector<Course> courses = system.getCourses();
		Vector<Manager> managers = system.getManagers();
		Admin admin = system.getAdmin();
		Vector<Organization> organizations = system.getOrganizations();
		Vector<News> news = system.getNews();
		Vector<LogFile> logFiles = system.getLogFiles();
		Vector<Journal> journals = system.getJournals();
//		Vector<Researcher> researchers = system.getResearchers();
		
		System.out.println(users);
		
		admin.addUser("user", "user", Gender.FEMALE, "u.user");
		
		Database.saveDatabase();
		
		
	}
}
