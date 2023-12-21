package users;

import researcher.*;
import enums.*;


public class IndividualResearcher extends Researcher {
	private static final long serialVersionUID = 123456789L;

    private int hIndex;

    public IndividualResearcher(String name, String surname, Gender gender, String email, int hIndex) throws Exception {
        super(name, surname, gender, email);
        this.hIndex = hIndex;
    }

    public int getHIndex() {
        return hIndex;
    }

    @Override
    public void conductResearch() {
        System.out.println("Conducting individual research...");
    }

    @Override
    public void publishPaper(ResearchPaper paper) {
        System.out.println("Publishing paper as an individual researcher...");
        getResearchProjects().forEach(project -> project.addPublishedPaper(paper));
    }
}
