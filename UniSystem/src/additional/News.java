package additional;

import java.util.Date;
import enums.*;
import users.*;
import database.*;

public class News {
    private String title;
    public String text;
    private Priority priority;
    private Manager manager;
    private Database database;
    private Date date;
    

    public News() {}
    public News(String title, String text) {
    	this.title = title;
    	this.text = text;
    }
    public News(String title, String text, Priority priority, Date date, Manager manager, Database database){
        this.title = title;
        this.text = text;
        this.priority = priority;
        this.date = date;  
        this.manager = manager;
        this.database = database;
    }
    
    
    
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    
    public Priority getPriority() {
        return this.priority;
    }
    
    public void setPriority(Priority priority) {
        this.priority = priority;
    }
    
    public Date getTime() {
        return this.date;
    }

    public void setTime(Date date) {
        this.date = date;
    }
    
    public String toString(){
        return "----------"+"\n"+priority+"\n"+title+"\n"+text+"\n"+date+"\n"+"----------";
    }
    
}
