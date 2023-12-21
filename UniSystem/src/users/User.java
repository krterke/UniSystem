package users;

import java.util.Objects;

import additional.*;
import database.Database;
import enums.*;

public class User extends WrongLoginExceptionWrongPasswordException {
	
    private String name;
    private String surname;
    Gender gender;
    private String id;
    private String email;
    private int phoneNumber;
    private Login login;
    private String password;
    Admin admin;
    System system;
    
    public User() {
    	
    }
    public User(String name, String surname, Gender gender, String id, String email, int phoneNumber) {
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.id= id;
		this.email = email;
		this.phoneNumber = phoneNumber;
		
	public User(String name, String surname) {
			this.name = name;
			this.surname = surname;
	}
	
    public User(String name, String surname, String email) {
		this.email = email;
		this.name = name;
		this.surname = surname;
	}

	public User(String name, String surname, String log, String pass) {
		this.setPassword(pass);
		this.setLogin(log);
		this.name = name;
		this.surname = surname;
	}

	public User(String name, String surname, String email, int phoneNumber, Gender gender) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
	}
    
    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        this.name = name;
    }
    
    public String getSurname() {
        return this.surname;
    }
    
 
    public String setSurname(String surname) {
        this.surname = surname;
    }
    
    public Gender getGender() {
        return this.gender;
    }
    

    public Gender setGender(Gender gender) {
        this.gender = gender;
    }
    

    public String getId() {
        return this.id;
    }
    
    private String setId(String id) {
        this.id = id;
    }
    
    private Login getLogin() {
        return this.login;
    }
    
    private Login setLogin(Login login) {
        this.login = login;
    }
    
    private String getEmail() {
        return this.email;
    }
    
    private String setEmail(String email) {
        this.email = email;
    }
    
    private Integer getPhoneNumber() {
        return this.phoneNumber;
    }
    
    private Integer setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
                                     

    public int compareTo(User o) {
    	int result = this.surname.compareTo(o.surname);
		if (result == 0) {
			result = this.name.compareTo(o.name);
		}
		return result;        
    }
    
    public int hashCode() {
    	return Objects.hash(email, phoneNumber, surname, name);
	}
    
    public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		User u = (User) o;
		return email == u.email && phoneNumber == u.phoneNumber && surname.equals(u.surname) && name.equals(u.name);
	}
    
    public boolean signIn(String l, String p) {
		for (User cur : Database.users) {
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
	
    public boolean changePassword(String newPassword) {
		for (User cur : Database.users) {
			if (cur.equals(this)) {
				this.setPassword(newPassword);
				return true;
			}
		}
		return false;
	}
    
    public String viewNews() {
		String s = "";
		for (News cur : Database.news) {
			s += cur.toString() + "\n";
		}
		return s;
	}

    public String toString() {
		return "Name: " + name +" Surname: " + surname + " Gender: " + gender + " Email: " + email;
	}
    
}
