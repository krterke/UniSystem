package Users;

import java.io.Serializable;

import Enums.Gender;

public class TechSupportSpecialist extends Employee implements Serializable{
	
	public TechSupportSpecialist() {}
    
    public TechSupportSpecialist(String name, String surname, Gender gender, String email) throws Exception {
    	super(name, surname, gender, email);
    }
   
    public void acceptOrder() {
        //TODO
    }
    
    
    public static TechSupportSpecialist createTechSupportSpecialist(String name, String surname, Gender gender, String email) throws Exception {
    	return new TechSupportSpecialist(name, surname, gender, email);
    }
    
}

