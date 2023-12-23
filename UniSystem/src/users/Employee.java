package users;

import java.io.Serializable;
import additional.*;
import database.*;

import enums.Gender;

public class Employee extends User  implements Serializable {
	private static final long serialVersionUID = 123456789L;
    
    private double salary;
    
	public Employee() {}
	
	public Employee(String name, String surname, Gender gender, String email) throws Exception {
		super(name, surname, gender, email);
	}
	
    public Employee(String name, String surname, Gender gender, String email, double salary) throws Exception {
		super(name, surname, gender, email);
		this.salary = salary;
	}
    public Employee(String name,String surname,String email, int phoneNumber) {
		super(name,surname, email);
	}
	public Employee(String name,String surname) {
		super(name, surname);
	}
    public Employee(String name, String surname,String log, String pass) {
		super(name,surname,log,pass);
	}
	
	
    
    public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
    
	public void sendMessage(String title,String text,String name,String surname) throws Exception{
		Employee e=new Employee();
		for(User cur : Database.getInstance().getUsers()) {
			if(cur.getName().equals(name) && cur.getSurname().equals(surname)) {
				e = (Employee)cur;
			}
		}
		SMS s=new SMS(this,e,title,text);
		Database.getInstance().getMessages().add(s);
	}
	
	
	public String readMessage() throws Exception {
		for(SMS s : Database.getInstance().getMessages()) {
			if(s.getReader().equals(this)) {
				return s.toString();
			}
		}
		return "You don't have a message";
	}
    
    
    public String toString() {
        return super.toString() + "Salary: " + salary;
    }
    
}
