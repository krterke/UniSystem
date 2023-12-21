package research;

import java.util.Vector;

import users.*;

public class ResearchProject {

    private String topic;
    private Vector<ResearchPaper> publishedPapers;
    private Vector<Researcher> projectParticipants;

    public ResearchProject(String topic) {
        this.topic = topic;
        this.publishedPapers = new Vector<>();
        this.projectParticipants = new Vector<>();
    }

    public String getTopic() {
        return topic;
    }

    public Vector<ResearchPaper> getPublishedPapers() {
        return publishedPapers;
    }

    public Vector<Researcher> getProjectParticipants() {
        return projectParticipants;
    }

    public void addPublishedPaper(ResearchPaper paper) {
        publishedPapers.add(paper);
    }

    public void addProjectParticipant(Researcher researcher) {
        projectParticipants.add(researcher);
    }

    public void removeProjectParticipant(Researcher researcher) {
        projectParticipants.remove(researcher);
    }
    

    public int getTotalCitations() {
        int totalCitations = 0;
        for (ResearchPaper paper : publishedPapers) {
            totalCitations += paper.getCitationCount();
        }
        return totalCitations;
    }

    public boolean isPaperInProject(ResearchPaper paper) {
        return publishedPapers.contains(paper);
    }
}
