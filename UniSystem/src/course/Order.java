package course;


import java.io.Serializable;

import enums.*;

public class Order implements Serializable {
    private static final long serialVersionUID = 123456789L;

    private OrderStatus status;
    private int orderId;
    private String description;
    private String customerName;
    private boolean isAccepted;

    public Order(int orderId, String description, String customerName) {
        this.orderId = orderId;
        this.description = description;
        this.customerName = customerName;
        
        // Default status is not accepted
        this.isAccepted = false;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getDescription() {
        return description;
    }

    public String getCustomerName() {
        return customerName;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public void setAccepted(boolean accepted) {
        isAccepted = accepted;
    }
    
    
    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    
    

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", description='" + description + '\'' +
                ", customerName='" + customerName + '\'' +
                ", isAccepted=" + isAccepted +
                '}';
    }
}

