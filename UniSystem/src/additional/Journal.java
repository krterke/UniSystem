package additional;

import java.util.ArrayList;
import java.util.List;

import users.User;

public class Journal {
    private String name;
    private Vector<ResearchPaper> papers;
    private List<Observer> subscribers = new ArrayList<>();
    // private User subscribers;
    private System system;

    //constructors
    public Journal(){
    }
    public Journal(String name,User subscribers,Vector<ResearchPaper> papers, System system;){
        this.name = name;
        this.papers = papers;
        this.subscribers = subscribers;
        this.system = system;
    }

    // getters and setters
    private String getName() {
        return this.name;
    }
    private String setName(String name) {
        this.name = name;
    }
    private Vector<ResearchPaper> getPapers() {
        return this.papers;
    }
    private Vector<ResearchPaper> setPapers(Vector<ResearchPaper> papers) {
        this.papers = papers;
    }
    private User getSubscribers() {
        return this.subscribers;
    }
    private User setSubscribers(User subscribers) {
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
    // !
    interface Observer {
        void update(String name);
    }  


}
