package database;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;

import course.*;
import enums.*;
import additional.*;
import users.*;



public class Database implements Serializable{
	
	//fields
	public Vector<User> users;
	public Vector<Employee> employees;
	public Vector<Student> students;
	public Vector<Teacher> teachers;
	public Vector<Course> courses;
	public Vector<Manager> managers;
	public Vector<TechSupportSpecialist> techSupportSpecialists;
	public Admin admin;
	public Vector<Organization> organizations;
	public Vector<News> news;
	public Vector<String> doneOrders;
	public Vector<String> acceptedOrders;
	public Vector<String> rejectedOrders;
	public Vector<LogFile> logFiles;
	public Vector<Journal> journals;
	//Vector<Researcher> researchers;

	private static Database instance;
	
	//constructors
	private Database() throws Exception {
		this.admin = Admin.getInstance("Madina", "Saimova", Gender.FEMALE, "madinasaimova");
		this.users = new Vector<User>();
		this.students = new Vector<Student>();
		this.teachers = new Vector<Teacher>();
		this.courses = new Vector<Course>();
		this.managers = new Vector<Manager>();
		this.organizations = new Vector<Organization>();
		this.news = new Vector<News>();
		this.doneOrders = new Vector<String>();
		this.acceptedOrders = new Vector<String>();
		this.rejectedOrders = new Vector<String>();
		this.logFiles = new Vector<LogFile>();
		this.journals = new Vector<Journal>();
		this.employees = new Vector<Employee>();
		//this.researchers = new Vector<Researcher>();
	}
	public static Database getInstance() throws Exception {
		if(instance == null) {
			if(new File("database.ser").exists()) {
				try {
					instance = readDatabase();
				}
				catch (Exception e) {
					instance = new Database();
					e.printStackTrace();
				}
			}
			else instance = new Database();
		}
		return instance;
	}
	
	//getters n' setters
	public Vector<User> getUsers() {
		return users;
	}
	public Vector<Student> getStudents() {
		return students;
	}
	public Vector<Teacher> getTeachers() {
		return teachers;
	}
	public Vector<Course> getCourses() {
		return courses;
	}
	public Vector<Manager> getManagers() {
		return managers;
	}
	public Vector<TechSupportSpecialist> getTechSupportSpecialist() {
		return techSupportSpecialists;
	}
	public Admin getAdmin() {
		return admin;
	}
	public Vector<Organization> getOrganizations() {
		return organizations;
	}
	public Vector<News> getNews() {
		return news;
	}
	public Vector<String> getDoneOrders() {
		return doneOrders;
	}
	public Vector<String> getAcceptedOrders() {
		return acceptedOrders;
	}
	public Vector<String> getRejectedOrders() {
		return rejectedOrders;
	}
	public Vector<LogFile> getLogFiles() {
		return logFiles;
	}
	public Vector<Journal> getJournals() {
		return journals;
	}
	public Vector<Employee> getEmployees() {
		return employees;
	}
//	public Vector<Researcher> getResearchers() {
//		return researchers;
//	}
	
	//add
	public void addUser(User u) {
		users.add(u);
	}
	public void addStudent(Student s) {
		students.add(s);
	}
	public void addTeacher(Teacher t) {
		teachers.add(t);
	}
	public void addCourse(Course c) {
		courses.add(c);
	}
	public void addManager(Manager m) {
		managers.add(m);
	}
	public void addOrganization(Organization o) {
		organizations.add(o);
	}
	public void addTechSupportSpecialist(TechSupportSpecialist tss) {
		techSupportSpecialists.add(tss);
	}
	public void addNews(News n) {
		news.add(n);
	}
	public void addDoneOrder(String doneOrd) {
		doneOrders.add(doneOrd);
	}
	public void addAcceptedOrder(String acepOrd) {
		acceptedOrders.add(acepOrd);
	}
	public void addRejectedOrder(String rejOrd) {
		rejectedOrders.add(rejOrd);
	}
	public void addLogFile(LogFile l) {
		logFiles.add(l);
	}
	public void addJournal(Journal j) {
		journals.add(j);
	}
	public void addEmployee(Employee e) {
		employees.add(e);
	}
//	public void addResearcher(Researcher r) {
//		researchers.add(r);
//	}
	
	//delete
	public void dellUser(User u) {
		users.remove(u);
	}
	public void dellStudent(Student s) {
		students.remove(s);
	}
	public void dellTeacher(Teacher t) {
		teachers.remove(t);
	}
	public void dellCourse(Course c) {
		courses.remove(c);
	}
	public void dellManager(Manager m) {
		managers.remove(m);
	}
	public void dellOrganization(Organization o) {
		organizations.remove(o);
	}
	public void dellNews(News n) {
		news.remove(n);
	}
	public void dellDoneOrder(String doneOrd) {
		doneOrders.remove(doneOrd);
	}
	public void dellAcceptedOrder(String acepOrd) {
		acceptedOrders.remove(acepOrd);
	}
	public void dellRejectedOrder(String rejOrd) {
		rejectedOrders.remove(rejOrd);
	}
	public void dellLogFile(LogFile l) {
		logFiles.remove(l);
	}
	public void dellJournal(Journal j) {
		journals.remove(j);
	}
	public void dellEmployee(Employee e) {
		employees.remove(e);
	}
//	public void dellResearcher(Researcher r) {
//		researchers.remove(r);
//	}
	
	//methods
	private static Database readDatabase() throws Exception {
		FileInputStream fis = new FileInputStream("database.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Database system = (Database)ois.readObject();
		fis.close(); ois.close();
		return system;
	}
	
	public static void saveDatabase() throws Exception{
		FileOutputStream fos = new FileOutputStream("database.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(instance);
		fos.close(); oos.close();
	}
	
}
