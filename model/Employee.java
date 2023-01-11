package model;

public class Employee extends User{
    private Integer employeeId;
    private Integer salary;
    static Integer nextEmployeeId = 200;
   
    public Employee(String name, String email, Integer salary) {
        super(name, email);
        this.salary = salary;
        this.employeeId = nextEmployeeId ++;
    }

    public Integer getSalary () {
        return salary;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {        
        return "EmployeeId: " + employeeId + " " + super.toString() + " Salary: " + salary;
    }

    @Override
    public void showInformation() {
       System.out.println("Employee Company AL TAYER MOTORS");
        
    }
   
  
}

    
   

