package Classdiagram2.0;

import java.util.Vector;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import System.Course;
import UsersOfDANA.User;

public class System {
    
    private static Vector<User> users = new Vector<>();
    private static Vector<Student> students = new Vector<>();
    private static Vector<Teacher> teachers = new Vector<>();
    private static Vector<Course> courses = new Vector<>();
    private static Vector<Manager> managers = new Vector<>();
    private static Vector<Admin> admins = new Vector<>();
    private static Vector<Organization> organizations = new Vector<>();
    private static Vector<News> news = new Vector<>();
    private static Vector<String> doneOrders = new Vector<>();
    private static Vector<String> acceptedOrders = new Vector<>();
    private static Vector<String> rejectedOrders = new Vector<>();
    private static Vector<Researcher> researchers = new Vector<>();
    private static Vector<LogFile> logFiles = new Vector<>();
    private static Vector<Journal> journals = new Vector<>();
    
//    private Course course;
//    private User user;
//    private Organization organization;
//    private News news2;
//    private Journal journal;
    
    private System() {}

    
    
    public static void save() {
    	saveUsers();
    	saveStudents();
    	saveTeachers();
    	saveCourses();
    	saveManagers();
    	saveAdmins();
    	saveOrganizations();
    	saveNews();
    	saveDoneOrders();
    	saveAcceptedOrders();
    	saveRejectedOrders();
    	saveResearchers();
    	saveLogFiles();
    	saveJournals();
    }
    
    
    
    public static void load() {
    	loadUsers();
    	loadStudents();
    	loadTeachers();
    	loadCourses();
    	loadManagers();
    	loadAdmins();
    	loadOrganizations();
    	loadNews();
    	loadDoneOrders();
    	loadAcceptedOrders();
    	loadRejectedOrders();
    	loadResearchers();
    	loadLogFiles();
    	loadJournals();
	}
    
    
    
    private static void saveUsers() {
    	try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("/Users/madin/OneDrive/Documents/oopProjectSystems/users.txt"))){
    		oot.writeObject(users);
    		oot.flush();
    		oot.close();
    	}
    	catch (IOException e) {
    		System.err.println("/Users/madin/OneDrive/Documents/oopProjectSystems/users.txt: IOException");
    	}
    }
    
    
    
    
    private static void saveStudents() {
    	try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("/Users/madin/OneDrive/Documents/oopProjectSystems/students.txt"))){
    		oot.writeObject(students);
    		oot.flush();
    		oot.close();
    	}
    	catch (IOException e) {
    		System.err.println("/Users/madin/OneDrive/Documents/oopProjectSystems/students.txt: IOException");
    	}
    }
    
    
    
    private static void saveTeachers() {
    	try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("/Users/madin/OneDrive/Documents/oopProjectSystems/teachers.txt"))){
    		oot.writeObject(teachers);
    		oot.flush();
    		oot.close();
    	}
    	catch (IOException e) {
    		System.err.println("/Users/madin/OneDrive/Documents/oopProjectSystems/teachers.txt: IOException");
    	}
    }
    
    
    
    private static void saveCourses() {
    	try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("/Users/madin/OneDrive/Documents/oopProjectSystems/courses.txt"))){
    		oot.writeObject(courses);
    		oot.flush();
    		oot.close();
    	}
    	catch (IOException e) {
    		System.err.println("/Users/madin/OneDrive/Documents/oopProjectSystems/courses.txt: IOException");
    	}
    }
    
    
    
    private static void saveManagers() {
    	try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("/Users/madin/OneDrive/Documents/oopProjectSystems/managers.txt"))){
    		oot.writeObject(managers);
    		oot.flush();
    		oot.close();
    	}
    	catch (IOException e) {
    		System.err.println("/Users/madin/OneDrive/Documents/oopProjectSystems/managers.txt: IOException");
    	}
    }
    
    
    
    private static void saveAdmins() {
    	try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("/Users/madin/OneDrive/Documents/oopProjectSystems/admins.txt"))){
    		oot.writeObject(admins);
    		oot.flush();
    		oot.close();
    	}
    	catch (IOException e) {
    		System.err.println("/Users/madin/OneDrive/Documents/oopProjectSystems/admins.txt: IOException");
    	}
    }
    
    
    private static void saveOrganizations() {
    	try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("/Users/madin/OneDrive/Documents/oopProjectSystems/organizations.txt"))){
    		oot.writeObject(organizations);
    		oot.flush();
    		oot.close();
    	}
    	catch (IOException e) {
    		System.err.println("/Users/madin/OneDrive/Documents/oopProjectSystems/organizations.txt: IOException");
    	}
    }
    
    
    private static void saveNews() {
    	try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("/Users/madin/OneDrive/Documents/oopProjectSystems/news.txt"))){
    		oot.writeObject(news);
    		oot.flush();
    		oot.close();
    	}
    	catch (IOException e) {
    		System.err.println("/Users/madin/OneDrive/Documents/oopProjectSystems/news.txt: IOException");
    	}
    }
    
    private static void saveDoneOrders() {
    	try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("/Users/madin/OneDrive/Documents/oopProjectSystems/doneOrders.txt"))){
    		oot.writeObject(doneOrders);
    		oot.flush();
    		oot.close();
    	}
    	catch (IOException e) {
    		System.err.println("/Users/madin/OneDrive/Documents/oopProjectSystems/doneOrders.txt: IOException");
    	}
    }
    
    
    private static void saveAcceptedOrders() {
    	try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("/Users/madin/OneDrive/Documents/oopProjectSystems/acceptedOrders.txt"))){
    		oot.writeObject(acceptedOrders);
    		oot.flush();
    		oot.close();
    	}
    	catch (IOException e) {
    		System.err.println("/Users/madin/OneDrive/Documents/oopProjectSystems/acceptedOrders.txt: IOException");
    	}
    }
    
    
    private static void saveRejectedOrders() {
    	try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("/Users/madin/OneDrive/Documents/oopProjectSystems/rejectedOrders.txt"))){
    		oot.writeObject(rejectedOrders);
    		oot.flush();
    		oot.close();
    	}
    	catch (IOException e) {
    		System.err.println("/Users/madin/OneDrive/Documents/oopProjectSystems/rejectedptedOrders.txt: IOException");
    	}
    }
    
    
    private static void saveResearchers() {
    	try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("/Users/madin/OneDrive/Documents/oopProjectSystems/researchers.txt"))){
    		oot.writeObject(researchers);
    		oot.flush();
    		oot.close();
    	}
    	catch (IOException e) {
    		System.err.println("/Users/madin/OneDrive/Documents/oopProjectSystems/researchers.txt: IOException");
    	}
    }
    
    
    private static void saveLogFiles() {
    	try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("/Users/madin/OneDrive/Documents/oopProjectSystems/logFiles.txt"))){
    		oot.writeObject(logFiles);
    		oot.flush();
    		oot.close();
    	}
    	catch (IOException e) {
    		System.err.println("/Users/madin/OneDrive/Documents/oopProjectSystems/logFiles.txt: IOException");
    	}
    }
    
    
    private static void saveJournals() {
    	try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("/Users/madin/OneDrive/Documents/oopProjectSystems/journals.txt"))){
    		oot.writeObject(journals);
    		oot.flush();
    		oot.close();
    	}
    	catch (IOException e) {
    		System.err.println("/Users/madin/OneDrive/Documents/oopProjectSystems/journals.txt: IOException");
    	}
    }
    
    
    
  //-------------------------------------------------------------------------------
    public static FileInputStream fis;
   	public static FileOutputStream fos;
   	public static ObjectOutputStream oos;
   	public static ObjectInputStream oin;
    
    private static Vector<User> loadUsers() {
    	try {
        	fis = new FileInputStream("/Users/madin/OneDrive/Documents/oopProjectSystems/users.txt");
        	oin = new ObjectInputStream(fis); 
            users = (Vector<User>) oin.readObject();
            oin.close();
            fis.close();
    	}
        catch (IOException e) {
            users = new Vector<>();
            System.err.println("users.txt: IOException");
        }
        catch (ClassNotFoundException e) {
            users = new Vector<>();
            System.err.println("users.txt: ClassNotFoundException");
        }  
    	return users;
    }
    
    
    private static Vector<Student> loadStudents() {
    	try {
        	fis = new FileInputStream("/Users/madin/OneDrive/Documents/oopProjectSystems/students.txt");
        	oin = new ObjectInputStream(fis); 
            students = (Vector<Student>) oin.readObject();
            oin.close();
            fis.close();
    	}
        catch (IOException e) {
            students = new Vector<>();
            System.err.println("students.txt: IOException");
        }
        catch (ClassNotFoundException e) {
        	students = new Vector<>();
            System.err.println("students.txt: ClassNotFoundException");
        }  
    	return students;
    }
    
    private static Vector<Teacher> loadTeachers() {
    	try {
        	fis = new FileInputStream("/Users/madin/OneDrive/Documents/oopProjectSystems/teachers.txt");
        	oin = new ObjectInputStream(fis); 
            teachers = (Vector<Teacher>) oin.readObject();
            oin.close();
            fis.close();
    	}
        catch (IOException e) {
        	teachers = new Vector<>();
            System.err.println("teachers.txt: IOException");
        }
        catch (ClassNotFoundException e) {
        	teachers = new Vector<>();
            System.err.println("teachers.txt: ClassNotFoundException");
        }  
    	return teachers;
    }
    
    
    private static Vector<Course> loadCourses() {
    	try {
        	fis = new FileInputStream("/Users/madin/OneDrive/Documents/oopProjectSystems/courses.txt");
        	oin = new ObjectInputStream(fis); 
            courses = (Vector<Course>) oin.readObject();
            oin.close();
            fis.close();
    	}
        catch (IOException e) {
        	courses = new Vector<>();
            System.err.println("courses.txt: IOException");
        }
        catch (ClassNotFoundException e) {
        	courses = new Vector<>();
            System.err.println("courses.txt: ClassNotFoundException");
        }  
    	return courses;
    }
    
    
    private static Vector<Manager> loadManagers() {
    	try {
        	fis = new FileInputStream("/Users/madin/OneDrive/Documents/oopProjectSystems/managers.txt");
        	oin = new ObjectInputStream(fis); 
        	managers = (Vector<Manager>) oin.readObject();
            oin.close();
            fis.close();
    	}
        catch (IOException e) {
        	managers = new Vector<>();
            System.err.println("managers.txt: IOException");
        }
        catch (ClassNotFoundException e) {
        	managers = new Vector<>();
            System.err.println("managers.txt: ClassNotFoundException");
        }  
    	return managers;
    }
    
    
    
    private static Vector<Admin> loadAdmins() {
    	try {
        	fis = new FileInputStream("/Users/madin/OneDrive/Documents/oopProjectSystems/admins.txt");
        	oin = new ObjectInputStream(fis); 
        	admins = (Vector<Admin>) oin.readObject();
            oin.close();
            fis.close();
    	}
        catch (IOException e) {
        	admins = new Vector<>();
            System.err.println("admins.txt: IOException");
        }
        catch (ClassNotFoundException e) {
        	admins = new Vector<>();
            System.err.println("admins.txt: ClassNotFoundException");
        }  
    	return admins;
    }
    
    
    
    private static Vector<Organization> loadOrganizations() {
    	try {
        	fis = new FileInputStream("/Users/madin/OneDrive/Documents/oopProjectSystems/organizations.txt");
        	oin = new ObjectInputStream(fis); 
        	organizations = (Vector<Organization>) oin.readObject();
            oin.close();
            fis.close();
    	}
        catch (IOException e) {
        	organizations = new Vector<>();
            System.err.println("organizations.txt: IOException");
        }
        catch (ClassNotFoundException e) {
        	organizations = new Vector<>();
            System.err.println("courses.txt: ClassNotFoundException");
        }  
    	return organizations;
    }
    
    
    private static Vector<News> loadNews() {
    	try {
        	fis = new FileInputStream("/Users/madin/OneDrive/Documents/oopProjectSystems/news.txt");
        	oin = new ObjectInputStream(fis); 
        	news = (Vector<News>) oin.readObject();
            oin.close();
            fis.close();
    	}
        catch (IOException e) {
        	news = new Vector<>();
            System.err.println("news.txt: IOException");
        }
        catch (ClassNotFoundException e) {
        	news = new Vector<>();
            System.err.println("news.txt: ClassNotFoundException");
        }  
    	return news;
    }
    
    
    private static Vector<Stirng> loadDoneOrders() {
    	try {
    		fis = new FileInputStream("/Users/madin/OneDrive/Documents/oopProjectSystems/doneOrders.txt");
    		oin = new ObjectInputStream(fis); 
    		doneOrders = (Vector<Stirng>) oin.readObject();
    		oin.close();
    		fis.close();
    	}
    	catch (IOException e) {
    		doneOrders = new Vector<>();
    		System.err.println("doneOrders.txt: IOException");
    	}
    	catch (ClassNotFoundException e) {
    		doneOrders = new Vector<>();
    		System.err.println("doneOrders.txt: ClassNotFoundException");
    	}  
    	return doneOrders;
    }
    
    
    private static Vector<Stirng> loadAcceptedOrders() {
    	try {
        	fis = new FileInputStream("/Users/madin/OneDrive/Documents/oopProjectSystems/acceptedOrders.txt");
        	oin = new ObjectInputStream(fis); 
        	acceptedOrders = (Vector<Stirng>) oin.readObject();
            oin.close();
            fis.close();
    	}
        catch (IOException e) {
        	acceptedOrders = new Vector<>();
            System.err.println("acceptedOrders.txt: IOException");
        }
        catch (ClassNotFoundException e) {
        	acceptedOrders = new Vector<>();
            System.err.println("acceptedOrders.txt: ClassNotFoundException");
        }  
    	return acceptedOrders;
    }
    
    
    private static Vector<Stirng> loadRejectedOrders() {
    	try {
        	fis = new FileInputStream("/Users/madin/OneDrive/Documents/oopProjectSystems/rejectedOrders.txt");
        	oin = new ObjectInputStream(fis); 
        	rejectedOrders = (Vector<Stirng>) oin.readObject();
            oin.close();
            fis.close();
    	}
        catch (IOException e) {
        	rejectedOrders = new Vector<>();
            System.err.println("rejectedOrders.txt: IOException");
        }
        catch (ClassNotFoundException e) {
        	rejectedOrders = new Vector<>();
            System.err.println("rejectedOrders.txt: ClassNotFoundException");
        }  
    	return rejectedOrders;
    }
    
    
    private static Vector<Researcher> loadResearchers() {
    	try {
        	fis = new FileInputStream("/Users/madin/OneDrive/Documents/oopProjectSystems/researchers.txt");
        	oin = new ObjectInputStream(fis); 
        	researchers = (Vector<Researcher>) oin.readObject();
            oin.close();
            fis.close();
    	}
        catch (IOException e) {
        	researchers = new Vector<>();
            System.err.println("researchers.txt: IOException");
        }
        catch (ClassNotFoundException e) {
        	researchers = new Vector<>();
            System.err.println("researchers.txt: ClassNotFoundException");
        }  
    	return researchers;
    }
    
    
    private static Vector<LogFile> loadLogFiles() {
    	try {
        	fis = new FileInputStream("/Users/madin/OneDrive/Documents/oopProjectSystems/logFiles.txt");
        	oin = new ObjectInputStream(fis); 
        	logFiles = (Vector<LogFile>) oin.readObject();
            oin.close();
            fis.close();
    	}
        catch (IOException e) {
        	logFiles = new Vector<>();
            System.err.println("logFiles.txt: IOException");
        }
        catch (ClassNotFoundException e) {
        	logFiles = new Vector<>();
            System.err.println("logFiles.txt: ClassNotFoundException");
        }  
    	return logFiles;
    }
    
    
    private static Vector<Journal> loadJournals() {
    	try {
        	fis = new FileInputStream("/Users/madin/OneDrive/Documents/oopProjectSystems/journals.txt");
        	oin = new ObjectInputStream(fis); 
        	journals = (Vector<Journal>) oin.readObject();
            oin.close();
            fis.close();
    	}
        catch (IOException e) {
        	journals = new Vector<>();
            System.err.println("journals.txt: IOException");
        }
        catch (ClassNotFoundException e) {
        	journals = new Vector<>();
            System.err.println("journals.txt: ClassNotFoundException");
        }  
    	return journals;
    }
    
    
    
    
    
    
    
    private Vector<User> getUsers() {
        return this.users;
    }
    
    private Vector<User> setUsers(Vector<User> users) {
        this.users = users;
    }

    private Vector<Student> getStudents() {
        return this.students;
    }
    
    private Vector<Student> setStudents(Vector<Student> students) {
        this.students = students;
    }
    
    private Vector<Teacher> getTeachers() {
        return this.teachers;
    }

    private Vector<Teacher> setTeachers(Vector<Teacher> teachers) {
        this.teachers = teachers;
    }

    private Vector<Course> getCourses() {
        return this.courses;
    }

    private Vector<Course> setCourses(Vector<Course> courses) {
        this.courses = courses;
    }

    private Vector<Manager> getManagers() {
        return this.managers;
    }

    private Vector<Manager> setManagers(Vector<Manager> managers) {
        this.managers = managers;
    }

    private Vector<Admin> getAdmins() {
        return this.admins;
    }

    private Vector<Admin> setAdmins(Vector<Admin> admins) {
        this.admins = admins;
    }

    private Vector<Organization> getOrganizations() {
        return this.organizations;
    }

    private Vector<Organization> setOrganizations(Vector<Organization> organizations) {
        this.organizations = organizations;
    }

    private Vector<News> getNews() {
        return this.news;
    }

    private Vector<News> setNews(Vector<News> news) {
        this.news = news;
    }

    private Vector<String> getDoneOrders() {
        return this.doneOrders;
    }

    private Vector<String> setDoneOrders(Vector<String> doneOrders) {
        this.doneOrders = doneOrders;
    }

    private Vector<String> getAcceptedOrders() {
        return this.acceptedOrders;
    }

    private Vector<String> setAcceptedOrders(Vector<String> acceptedOrders) {
        this.acceptedOrders = acceptedOrders;
    }

    private Vector<String> getRejectedOrders() {
        return this.rejectedOrders;
    }

    private Vector<String> setRejectedOrders(Vector<String> rejectedOrders) {
        this.rejectedOrders = rejectedOrders;
    }

    private Vector<Researcher> getResearchers() {
        return this.researchers;
    }

    private Vector<Researcher> setResearchers(Vector<Researcher> researchers) {
        this.researchers = researchers;
    }

    private Vector<LogFile> getLogFiles() {
        return this.logFiles;
    }

    private Vector<LogFile> setLogFiles(Vector<LogFile> logFiles) {
        this.logFiles = logFiles;
    }

    private Vector<Journal> getJournals() {
        return this.journals;
    }

    private Vector<Journal> setJournals(Vector<Journal> journals) {
        this.journals = journals;
    }

    public void getStudents() {
        //TODO
    }
 
}
