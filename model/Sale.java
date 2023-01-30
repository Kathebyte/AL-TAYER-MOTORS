package model;
import java.util.Date;
import java.util.List;

public class Sale {

    private int employeeId;
    private double amount;
    private int customerId;
    private int carId;
    private Date date;
    
    public Sale(int employeeId, double amount, int customerId, int carId, Date date) {
        this.employeeId = employeeId;
        this.amount = amount;
        this.customerId = customerId;
        this.carId = carId;
        this.date = date;
    }

    public int getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
   @Override
   public String toString() {
       return "Employee Id : "+ employeeId +
        "\ncustomer Id " + customerId +
        "\ncar Id" + carId +
        "\nDate " + date +
        "\nAmount" + amount;
   }
    
    
    
    
}





  
    
 

    

