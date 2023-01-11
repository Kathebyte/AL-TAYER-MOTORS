package model;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee extends User{
    private String employeeId;
   

    public Employee(String name, String email, String employeeId) {
        super(name, email);
        this.employeeId = employeeId;

    }
        
  
    
    @Override
    public String toString() {
        
        return super.toString() ;
    }
    @Override
    public void showInformation() {
       System.out.println("Employee Company AL TAYER MOTORS");
        
    }
   
  
}

    
   

