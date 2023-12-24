package additional;

import java.util.Date;
import enums.*;
import users.Manager;

public class News {

    private String title;
    private String text;
    private Priority priority;
    private Date date;;
    private Manager manager;
    private System system;
	private Time time;
	
    public News(){

    }
    public News(String title, String text, Priority priority, Time time, Manager manager, System system){
        this.title = title;
        this.text = text;
        this.priority = priority;
        this.time = time;
        this.manager = manager;
        this.system = system;
    }

    private String getTitle() {
        return this.title;
    }
    private void setTitle(String title) {
        this.title = title;
    }
    private String getText() {
        return this.text;
    }
    private void setText(String text) {
        this.text = text;
    }
    private Priority getPriority() {
        return this.priority;
    }
    private void setPriority(Priority priority) {
        this.priority = priority;
    }
    private Date getTime() {
        return this.date;
    }
    private void setTime(Time time) {
        this.time = time;
    }

    public String toString(){
        return "----------"+"\n"+priority+"\n"+title+"\n"+text+"\n"+date+"\n"+"----------";
    }

    
}
