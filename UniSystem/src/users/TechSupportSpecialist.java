package users;

import java.io.Serializable;

import course.*;
import enums.*;

public class TechSupportSpecialist extends Employee implements Serializable{
	
	
	private static final long serialVersionUID = 123456789L;

	
	public TechSupportSpecialist() {}
    
    public TechSupportSpecialist(String name, String surname, Gender gender, String email) throws Exception {
    	super(name, surname, gender, email);
    }
   
    public void acceptOrder(Order order) {
        // Assuming Order class is available and contains necessary information
        // Process the order and perform necessary actions
        System.out.println("Order accepted. Processing...");
        // Example: Log the order details
        System.out.println("Order Details: " + order.toString());
        // Example: Update the status of the order
        order.setStatus(OrderStatus.ACCEPTED);
        System.out.println("Order processed successfully.");
    }
    
    
    public static TechSupportSpecialist createTechSupportSpecialist(String name, String surname, Gender gender, String email) throws Exception {
    	return new TechSupportSpecialist(name, surname, gender, email);
    }
    
}

