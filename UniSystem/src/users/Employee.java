package Users;

import java.util.Vector;


import Additional.*;
import Enums.Gender;

public class Employee extends User {

    private Vector<String> messages;
    private double salary;
    
	public Employee() {}
    public Employee(String name, String surname, Gender gender, String email) throws Exception {
		super(name, surname, gender, email);
	}
    
    
    
    
    private Vector<String> getMessages() {
        return this.messages;
    }
    
    private void setMessages(Vector<String> messages) {
        this.messages = messages;
    }
  
    public String getMessage() {
        //TODO
        return "";
    }
    
    
    public String toString() {
        return super.toString();
    }
    
}
