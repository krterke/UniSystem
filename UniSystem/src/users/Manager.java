package users;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Vector;

import additional.*;
import course.*;
import database.*;
import enums.*;

public class Manager extends Employee implements Serializable{
   
	private static final long serialVersionUID = 1L;
    private ManagerType type;
    
    public Manager() {}
    
    public Manager(String name, String surname, Gender gender, String email) throws Exception {
    	super(name, surname, gender, email);
    }
    public Manager(String name, String surname, Gender gender, String email, 
    		double salary, ManagerType type) throws Exception {
		super(name, surname, gender, email, salary);
		this.type = type;
	}
    public Manager(String name, String surname,String log, String pass) {
		super(name,surname,log,pass);
	}
    
//    public Faculty getFaculty() {
//        return this.faculty;
//    }
    
    public ManagerType getManagerType() {
        return this.type;
    }

    
    public boolean approveRegistration(String id, String courseID) throws Exception {
        Course course = null;
        
        // Find the course with the specified courseID
        for (Course cur : Database.getInstance().getCourses()) {
            if (cur.getCourseId() == courseID) {
                course = cur;
                break;
            }
        }

        // If the course is found, find the student with the specified id and add them to the course
        if (course != null) {
            for (User user : Database.getInstance().getUsers()) {
                if (user instanceof Student) {
                    Student student = (Student) user;
                    if (student.getId().equals(id)) {
                        course.getStudents().add(student);
                        return true;
                    }
                }
            }
        }
        
        return false;
    }


    
    public boolean assignCoursesToTeachers(String name, String surname, String courseID) throws Exception {
        Course course = null;
        
        // Find the course with the specified courseID
        for (Course cur : Database.getInstance().getCourses()) {
            if (cur.getCourseId() == courseID) {
                course = cur;
                break;
            }
        }

        // Find the teacher with the specified name and surname
        Teacher teacher = null;
        for (User user : Database.getInstance().getUsers()) {
            if (user instanceof Teacher) {
                Teacher curTeacher = (Teacher) user;
                if (curTeacher.getName().equals(name) && curTeacher.getSurname().equals(surname)) {
                    teacher = curTeacher;
                    break;
                }
            }
        }

        // If both the course and teacher are found, assign the course to the teacher
        if (course != null && teacher != null) {
            course.getTeachers().add(teacher);
            return true;
        }

        return false;
    }
    
    
    
    public boolean addCourse(String courseId, String courseName, int credit) throws Exception {
		Course newCourse = new Course(courseId, courseName, credit);
		for (Course cur : Database.getInstance().getCourses()) {
			if (cur.getCourseId() == courseId) {
				return false;
			}
		}
		Database.getInstance().getCourses().add(newCourse);
		return true;
	}
    
    
    public void createNews(String title, String text) throws Exception {
		News n = new News(title, text);
		Database.getInstance().getNews().add(n);
	}

	public void deleteNews(String title) throws Exception {
		for (News cur : Database.getInstance().getNews()) {
			if (cur.getTitle().equals(title)) {
				Database.getInstance().getNews().remove(cur);
				return;
			}
		}
	}

	public void updateNews(String title, String newText) throws Exception {
		for (News cur : Database.getInstance().getNews()) {
			if (cur.getTitle().equals(title)) {
				cur.text = newText;
				return;
			}
		}
	}
	
	
	public String bestStudent() throws Exception {
		for (User u : Database.getInstance().getUsers()) {
			if (u instanceof Student) {
				Student s = (Student) u;
				if (s.getGPA() == 4) {
					return s.toString();
				}
			}
		}
		return "Unfortunately, there is no student with a GPA 4";
	}

	public String bestTeacher() throws Exception {
		int sum = 0;
		int maxrate = -9999;
		Teacher t = new Teacher();
		for (HashMap.Entry<Teacher, Vector<Integer>> cur : Database.getRatings().entrySet()) {
			for (Integer i : cur.getValue()) {
				sum += i;
			}
			if (sum / cur.getValue().size() > maxrate) {
				t = cur.getKey();
			}
		}
		return t.toString();
	}

	public double avgGPA() throws Exception {
		double sum = 0;
		int cnt = 0;
		for (User u : Database.getInstance().getUsers()) {
			Student s = (Student) u;
			sum += s.getGPA();
			cnt++;
		}
		return sum / cnt;
	}

	public String getInfoAboutStudent(String id) throws Exception {
		for (User u : Database.getInstance().getUsers()) {
			if (u instanceof Student) {
				Student cur = (Student) u;
				if (cur.getId().equals(id)) {
					return cur.toString();
				}
			}
		}
		return "No such student exists";
	}

	public String getInfoAboutStudent(String name, String surname) throws Exception {
		String s = "";
		for (User u : Database.getInstance().getUsers()) {
			if (u instanceof Student) {
				Student cur = (Student) u;
				if (cur.getName().equals(name) && cur.getSurname().equals(surname)) {
					s += cur.toString() + "\n";
				}
			}
		}
		if (s.equals("")) {
			return "Student not found";
		}
		return s;
	}

	public String getInfoAboutTeacher(String name, String surname) throws Exception {
		for (User u : Database.getInstance().getUsers()) {
			if (u instanceof Teacher) {
				Teacher cur = (Teacher) u;
				if (cur.getName().equals(name) && cur.getSurname().equals(surname)) {
					return cur.toString();
				}
			}
		}
		return "No such teacher exists";
	}
    
    
    public static Manager createManager(String name, String surname, Gender gender, String email) throws Exception {
    	return new Manager(name, surname, gender, email);
    }
    
    
    
    
    //каляка маляка какая то
    public void assignTask(String taskDescription) {
        // Assuming that performTask is a method that executes the task
        performTask(taskDescription);
    }
    
    
    public void performTask(String taskDescription) {
        System.out.println("Task performed by Manager: " + taskDescription);
        // Additional logic for task execution can be added here
        completeTask(taskDescription);

    }
    private void completeTask(String taskDescription) {
        System.out.println("Task completed: " + taskDescription);
    }
}
