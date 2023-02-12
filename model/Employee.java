package model;

public class Employee extends User{
    private Integer employeeId;
    private Integer salary;
    static Integer nextEmployeeId = 200;
    private String jobPosition;

    public Employee(String name, String phoneNumber, String address, String email,int salary,String jobPosition) {
        super(name, phoneNumber, address, email);
        this.salary=salary;
        this.jobPosition=jobPosition;
        employeeId=nextEmployeeId++;
    }

    public Integer getSalary () {
        return salary;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition ; 
    }

    @Override
    public void showInformation() {
       System.out.println("Employee Company AL TAYER MOTORS");
        
    }
    @Override
    public String toString() {
        return  "EmployeeId: "+ employeeId + super.toString() +" Job Position: "+jobPosition +"\n";
    }
   
  
}

    
   

