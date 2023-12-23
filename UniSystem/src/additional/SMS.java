package additional;

import java.io.Serializable;

import users.Employee;

public class SMS implements Serializable {
	private static final long serialVersionUID = 1L;
	private Employee sender;
	private Employee reader;
	private String title;
	private String text;
	
	public SMS() {
		
	}
	
	public SMS(Employee sender,Employee reader,String title,String text) {
		this.sender=sender;
		this.title=title;
		this.text=text;
	}
	
	public Employee getSender() {
		return sender;
	}
	public void setSender(Employee sender) {
		this.sender = sender;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public String toString() {
		return "Sender: "+sender+"\n"+"Titile: "+title+"\n"+text;
	}

	public Employee getReader() {
		return reader;
	}

	public void setReader(Employee reader) {
		this.reader = reader;
	}
	
}
