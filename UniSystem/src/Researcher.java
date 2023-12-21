package users;

import researcher.ResearchPaper;
import researcher.ResearchProject;
import enums.*;

import java.util.Vector;

public abstract class Researcher extends Employee {
	private static final long serialVersionUID = 123456789L;

    private Vector<ResearchProject> researchProjects;

    public Researcher(String name, String surname, Gender gender, String email) throws Exception {
        super(name, surname, gender, email);
        this.researchProjects = new Vector<>();
    }

    public Vector<ResearchProject> getResearchProjects() {
        return researchProjects;
    }

    public abstract void conductResearch();

    public abstract void publishPaper(ResearchPaper paper);

    public void joinResearchProject(ResearchProject project) {
        researchProjects.add(project);
    }

    public void quitResearchProject(ResearchProject project) {
        researchProjects.remove(project);
    }
    
}
