package additional;

import java.util.Date;


import users.Admin;
import users.User;



public class LogFile {
    
	private String userId;
    private String action;
    private Admin admin;
    
    public LogFile() {}
    
    public LogFile(String userId, String action, Admin admin){
        this.userId = userId;
        this.action = action;
        this.admin = admin;
    }
    
    
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getAction() {
        return this.action;
    }
    
    public void setAction(String action) {
        this.action = action;
    }
    
    public String toString() {
		return "User ID: " + getUserId()+"\n"+"Actions: "+getAction();
	}
    
}
