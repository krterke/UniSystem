package Users;

import java.io.Serializable;


import Database.*;
import Users.*;
import Enums.*;
import Package.*;
import Additional.*;

public class Manager extends Employee implements Serializable {
	ManagerTypes type;

	public Manager() {

	}

	public Manager(String name, String surname, String email, int phoneNumber, Gender gender,
			double salary, ManagerTypes type) {
		super(name, surname, email, phoneNumber, gender, salary);
		this.type = type;
	}
	public Manager(String name, String surname,String l, String p) {
		super(name,surname,l,p);
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

	public boolean assignCoursesToTeachers(String name, String surname, int courseID) {
		Course c = new Course();
		for (Course cur : Database.courses) {
			if (cur.courseID == courseID) {
				c = cur;
			}
		}
		Teacher t = new Teacher();
		for (User u : Database.users) {
			if (u instanceof Teacher) {
				Teacher cur = (Teacher) u;
				if (cur.getName().equals(name) && cur.getSurname().equals(surname)) {
					t = cur;
				}
			}
		}
		c.teachers.add(t);
		return true;
	}

	public boolean addCourse(int id, String name, int credit) {
		Course newCourse = new Course(id, name, credit);
		for (Course cur : Database.courses) {
			if (cur.courseID == id) {
				return false;
			}
		}
		Database.courses.add(newCourse);
		return true;
	}

	public void createNews(String title, String text) {
		News n = new News(title, text);
		Database.news.add(n);
	}

	public void deleteNews(String title) {
		for (News cur : Database.news) {
			if (cur.title.equals(title)) {
				Database.news.remove(cur);
				return;
			}
		}
	}

	public void updateNews(String title, String newText) {
		for (News cur : Database.news) {
			if (cur.title.equals(title)) {
				cur.text = newText;
				return;
			}
		}
	}

	public String bestStudent() {
		for (User u : Database.users) {
			if (u instanceof Student) {
				Student s = (Student) u;
				if (s.getGPA() == 4) {
					return s.toString();
				}
			}
		}
		return "Unfortunately, there is no student with a GPA 4";
	}

	public String bestTeacher() {
		int sum = 0;
		int maxrate = -9999;
		Teacher t = new Teacher();
		for (HashMap.Entry<Teacher, Vector<Integer>> cur : Database.ratings.entrySet()) {
			for (Integer i : cur.getValue()) {
				sum += i;
			}
			if (sum / cur.getValue().size() > maxrate) {
				t = cur.getKey();
			}
		}
		return t.toString();
	}

	public double avgGPA() {
		double sum = 0;
		int cnt = 0;
		for (User u : Database.users) {
			Student s = (Student) u;
			sum += s.getGPA();
			cnt++;
		}
		return sum / cnt;
	}

	public String getInfoAboutStudent(String id) {
		for (User u : Database.users) {
			if (u instanceof Student) {
				Student cur = (Student) u;
				if (cur.getId().equals(id)) {
					return cur.toString();
				}
			}
		}
		return "No such student exists";
	}

	public String getInfoAboutStudent(String name, String surname) {
		String s = "";
		for (User u : Database.users) {
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

	public String getInfoAboutTeacher(String name, String surname) {
		for (User u : Database.users) {
			if (u instanceof Teacher) {
				Teacher cur = (Teacher) u;
				if (cur.getName().equals(name) && cur.getSurname().equals(surname)) {
					return cur.toString();
				}
			}
		}
		return "No such teacher exists";
	}
    
}
