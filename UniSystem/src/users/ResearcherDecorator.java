package users;

import researcher.*;

import java.util.Vector;

import enums.Gender;

public class ResearcherDecorator extends Researcher {
	private static final long serialVersionUID = 123456789L;

    private Researcher decoratedResearcher;

    public ResearcherDecorator(String name, String surname, Gender gender, String email, Researcher decoratedResearcher) throws Exception {
        super(name, surname, gender, email);
        this.decoratedResearcher = decoratedResearcher;
    }

    @Override
    public void conductResearch() {
        decoratedResearcher.conductResearch();
    }

    @Override
    public void publishPaper(ResearchPaper paper) {
        decoratedResearcher.publishPaper(paper);
    }

    @Override
    public void joinResearchProject(ResearchProject project) {
        decoratedResearcher.joinResearchProject(project);
    }

    @Override
    public void quitResearchProject(ResearchProject project) {
        decoratedResearcher.quitResearchProject(project);
    }

    @Override
    public Vector<ResearchProject> getResearchProjects() {
        return decoratedResearcher.getResearchProjects();
    }
}
