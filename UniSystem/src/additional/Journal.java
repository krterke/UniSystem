package additional;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import database.Database;
import research.ResearchPaper;
import users.*;



public class Journal {
	
    private String name;
    private Vector<ResearchPaper> papers;
    private List<Observer> subscribers = new ArrayList<>();
//  private User subscribers;
    private Database database;
    
    
    public Journal() {}
    
    public Journal(String name) {
    	this.name = name;
    }
    
    public Journal(String name,List<Observer> subscribers,Vector<ResearchPaper> papers, Database database){
        this.name = name;
        this.papers = papers;
        this.subscribers = subscribers;
        this.database = database;
    }
    
    
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Vector<ResearchPaper> getPapers() {
        return this.papers;
    }
    
    public void setPapers(Vector<ResearchPaper> papers) {
        this.papers = papers;
    }
   
    public List<Observer> getSubscribers() {
        return this.subscribers;
    }
 
    public void setSubscribers(List<Observer> subscribers) {
        this.subscribers = subscribers;
    }
    
    
  //methods
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }
    private void notifySubscribers() {
        for (Observer subscriber : subscribers) {
            subscriber.update(name);
        }
    }
    
}
