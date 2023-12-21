package users;

import enums.*;


public class GraduateStudent extends Student {
	private static final long serialVersionUID = 123456789L;

    private String thesisTopic;
    private Researcher researchSupervisor;
    private boolean thesisDefended;

    public GraduateStudent() {}

    public GraduateStudent(String name, String surname, Gender gender, String email) {
        super(name, surname, gender, email);
        this.thesisDefended = false;
    }

    public String getThesisTopic() {
        return thesisTopic;
    }

    public void setThesisTopic(String thesisTopic) {
        this.thesisTopic = thesisTopic;
    }

    public Researcher getResearchSupervisor() {
        return researchSupervisor;
    }

    public void setResearchSupervisor(Researcher researchSupervisor) {
        this.researchSupervisor = researchSupervisor;
    }

    @Override
    public void displayStudentInfo() {
        super.displayStudentInfo();
        System.out.println("Thesis Topic: " + thesisTopic);
        if (researchSupervisor != null) {
            System.out.println("Research Supervisor: " + researchSupervisor.getName() + " " + researchSupervisor.getSurname());
        } else {
            System.out.println("No Research Supervisor assigned.");
        }
    }
    
    
    
    
    
    
    public void submitThesis(String thesisTopic) {
        setThesisTopic(thesisTopic);
    }

    public void defendThesis() {
        if (getThesisTopic() != null && !getThesisTopic().isEmpty() && !thesisDefended) {
            System.out.println("Thesis defense for topic \"" + getThesisTopic() + "\" is successful!");
            thesisDefended = true;
        } else {
            System.out.println("Thesis defense is not possible. Make sure you submitted a thesis topic and haven't defended it already.");
        }
    }
}

