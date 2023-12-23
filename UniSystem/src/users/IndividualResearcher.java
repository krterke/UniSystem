package users;

import enums.*;
import research.*;


public class IndividualResearcher extends Researcher {
	private static final long serialVersionUID = 123456789L;

    private int hIndex;

    
    public IndividualResearcher() {}
    
    public IndividualResearcher(String name, String surname, Gender gender, String email) throws Exception {
        super(name, surname, gender, email);
    }
    
    public IndividualResearcher(String name, String surname, Gender gender, String email, int hIndex) throws Exception {
        super(name, surname, gender, email);
        this.hIndex = hIndex;
    }

    public int getHIndex() {
        return hIndex;
    }
    public void setHIndex(int hIndex) {
        this.hIndex = hIndex;
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
    
    public static IndividualResearcher createResearcher(String name, String surname, Gender gender, String email) throws Exception {
    	return new IndividualResearcher(name, surname, gender, email);
    }
    
    public static IndividualResearcher createResearcher(String name, String surname, Gender gender, String email, int hIndex) throws Exception {
    	return new IndividualResearcher(name, surname, gender, email, hIndex);
    }
}
