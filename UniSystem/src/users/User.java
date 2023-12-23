package users;

import additional.*;
import database.*;
import enums.*;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable{
    
	private static final long serialVersionUID = 123456789L;

    private String name;
    private String surname;
    Gender gender;
    private String id;
    private String email;
    private String password;
    private String login;
    //private Login login;
    
    Admin admin;
    System system;
    
    public User () {}
    
    public User (String name, String surname, Gender gender, String email) {
    	//this.login = login;
    	this.name = name;
     	this.surname = surname;
     	this.gender = gender;
     	this.email = email;
    }
    
    public User (String name, String surname, Gender gender, String id, String email) {
    	//this.login = login;
    	this.name = name;
     	this.surname = surname;
     	this.gender = gender;
     	this.id = id;
     	this.email = email;
    }
    
    public User(String name,String surname,String email) {
    	this.name = name;
     	this.surname = surname;
     	this.email = email;
	}
	public User(String name,String surname) {
		this.name = name;
     	this.surname = surname;
	}
	
	public User(String name, String surname, String log, String pass) {
		this.setPassword(pass);
		this.setLogin(log);
		this.name = name;
		this.surname = surname;
	}
	
    protected String getName() {
        return this.name;
    }
    
    protected void setName(String name) {
        this.name = name;
    }

    protected String getSurname() {
        return this.surname;
    }
    
    protected void setSurname(String surname) {
        this.surname = surname;
    }
    
    protected Gender getGender() {
        return this.gender;
    }
    
    protected void setGender(Gender gender) {
        this.gender = gender;
    }
    
    protected String getId() {
        return this.id;
    }
    
    protected void setId(String id) {
        this.id = id;
    }
    
//    protected Login getLogin() {
//        return this.login;
//    }
//    
//    protected void setLogin(Login login) {
//        this.login = login;
//    }
    
    protected String getEmail() {
        return this.email;
    }
    
    protected void setEmail(String email) {
        this.email = email;
    }
    
    public int compareTo(User o) {
    	int result = this.surname.compareTo(o.surname);
		if (result == 0) {
			result = this.name.compareTo(o.name);
		}
		return result;        
    }
    
    public int hashCode() {
    	return Objects.hash(email, surname, name);
	}
    
    public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		User u = (User) o;
		return email == u.email && surname.equals(u.surname) && name.equals(u.name);
	}
    public boolean signIn(String l, String p) throws Exception {
		for (User cur : Database.getInstance().getUsers()) {
			if (cur.login.equals(l) && cur.password.equals(p)) {
				return true;
			}
		}
		return false;
	}
    
    
    
    public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    
    public boolean changePassword(String newPassword) throws Exception {
		for (User cur : Database.getInstance().getUsers()) {
			if (cur.equals(this)) {
				this.setPassword(newPassword);
				return true;
			}
		}
		return false;
	}
    
    
    public String viewNews() throws Exception {
		String s = "";
		for (News cur : Database.getInstance().getNews()) {
			s += cur.toString() + "\n";
		}
		return s;
	}
    
    
    public String toString() {
		return "Name: " + name +" Surname: " + surname + " Gender: " + gender + " Email: " + email;
	}
    
}
