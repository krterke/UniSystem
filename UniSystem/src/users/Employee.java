package Users;

import java.util.Vector;


import Additional.*;
import Enums.Gender;

public class Employee extends User implements Serializable{
    
	private double salary;
	
	public Employee() {
		
	}
	
	public Employee(String name,String surname,String email, int phoneNumber,Gender gender,double salary) {
		super(name,surname,email,phoneNumber,gender);
		this.salary=salary;
	}
	
	public Employee(String name,String surname,String email, int phoneNumber) {
		super(name,surname, email, phoneNumber);
	}
	public Employee(String name,String surname) {
		super(name, surname);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void sendMessage(String title,String text,String name,String surname){
		Employee e=new Employee();
		for(User cur:Database.users) {
			if(cur.getName().equals(name) && cur.getSurname().equals(surname)) {
				e=(Employee)cur;
			}
		}
		SMS s=new SMS(this,e,title,text);
		Database.messages.add(s);
	}
	
	public String readMessage() {
		for(SMS s:Database.messages) {
			if(s.getReader().equals(this)) {
				return s.toString();
			}
		}
		return "You don't have a message";
	}

}
