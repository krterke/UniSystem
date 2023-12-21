package additional;

import users.Admin;

public class LogFile {
    private Integer userId;
    private String action;
    private Admin admin;

    public LogFile(){

    }
    public LogFile(Integer userId, String action, Admin admin;){
        this.userId = userId;
        this.action = action;
        this.admin = admin;
    }

    private Integer getUserId() {
        return this.userId;
    }
    private Integer setUserId(Integer userId) {
        this.userId = userId;
    }
    private String getAction() {
        return this.action;
    }
    private String setAction(String action) {
        this.action = action;
    }

    public String toString() {
		return "User: "+userId.getName()+" "+userId.getSurname()+"\n"+"Actions: "+getAction();
	}
    
}
