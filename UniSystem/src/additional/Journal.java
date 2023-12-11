package additional;

import java.util.Vector;

/**
* @generated
*/
public class Journal {
    
    /**
    * @generated
    */
    private String name;
    
    /**
    * @generated
    */
    private Vector<ResearchPaper> papers;
    
    /**
    * @generated
    */
    private User subscribers;
    
    
    /**
    * @generated
    */
    private System system;
    
    

    /**
    * @generated
    */
    private String getName() {
        return this.name;
    }
    
    /**
    * @generated
    */
    private String setName(String name) {
        this.name = name;
    }
    
    
    /**
    * @generated
    */
    private Vector<ResearchPaper> getPapers() {
        return this.papers;
    }
    
    /**
    * @generated
    */
    private Vector<ResearchPaper> setPapers(Vector<ResearchPaper> papers) {
        this.papers = papers;
    }
    
    
    /**
    * @generated
    */
    private User getSubscribers() {
        return this.subscribers;
    }
    
    /**
    * @generated
    */
    private User setSubscribers(User subscribers) {
        this.subscribers = subscribers;
    }
    
    
    
    /**
    * @generated
    */
    public System getSystem() {
        return this.system;
    }
    
    /**
    * @generated
    */
    public System setSystem(System system) {
        this.system = system;
    }
    
    
    
}
