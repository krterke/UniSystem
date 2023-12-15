package Users;

import Additional.*;
import Enums.*;

public class User {
    

    private String name;
    private String surname;
    private Gender gender;
    private String id;
    private Login login;
    private String email;
    private Admin admin;
    private System system;
    
    public User () {};
    
    public User (String name, String surname, Gender gender, String email) {
    	//this.login = login;
    	this.name = name;
     	this.surname = surname;
     	this.gender = gender;
     	this.email = email;
    };
    
    private String getName() {
        return this.name;
    }
    
    private void setName(String name) {
        this.name = name;
    }

    private String getSurname() {
        return this.surname;
    }
    
    private void setSurname(String surname) {
        this.surname = surname;
    }
    
    private Gender getGender() {
        return this.gender;
    }
    
    private void setGender(Gender gender) {
        this.gender = gender;
    }
    
    private String getId() {
        return this.id;
    }
    
    private void setId(String id) {
        this.id = id;
    }
    
    private Login getLogin() {
        return this.login;
    }
    
    private void setLogin(Login login) {
        this.login = login;
    }
    
    private String getEmail() {
        return this.email;
    }
    
    private void setEmail(String email) {
        this.email = email;
    }
    
    public int compareTo() {
        //TODO
        return 0;
    }
    
    public int hashCode() {
        //TODO
        return 0;
    }
    
    public boolean equals() {
        //TODO
        return false;
    }
    
    public boolean logIn() {
        //TODO
        return false;
    }
    
    public boolean logOut() {
        //TODO
        return false;
    }
    
    public boolean changePassword() {
        //TODO
        return false;
    }
    
    public String toString() {
		return "Name: " + name +" Surname: " + surname + " Gender: " + gender + " Email: " + email;
	}
    
}
