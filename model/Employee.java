package model;

public class Employee extends User{
    private Integer salary;
   
    public Employee(String name, String email, Integer salary) {
        super(name, email);
        this.salary = salary;
    }

    public Integer getSalary () {
        return salary;
    }

    @Override
    public String toString() {        
        return super.toString() + " Salary: " + salary ;
    }

    @Override
    public void showInformation() {
       System.out.println("Employee Company AL TAYER MOTORS");
        
    }
   
  
}

    
   

