package model;
import java.util.ArrayList;

public class ListEmployee {
    
    //Atributes
    ArrayList <Employee> empleados;

    public ListEmployee(){
        empleados = new ArrayList<>();
        empleados.add(new Employee("Mariana Bedoya", "312432230","Medellin","mariana.bedoya@email.com",1500,"Sales Manager"));
        empleados.add(new Employee("Cristiano Gutierrez", "312111237","Envigado","Cristiano.Gutierrez@email.com",2000,"Sales Manager"));
        empleados.add(new Employee("Camila Osorio", "312431232","Medellin","Camila.Osorio",2000,"Sales Manager"));
        empleados.add(new Employee("Tifa Mejia", "312321231","Itagui","Camila.Osorio",2800,"Sales Manager"));
        empleados.add(new Employee("Carolina Montoya", "312231234","Sabaneta","Carolina.Montoya",12000,"Junior Sales Manager"));

        
    }
    
    public void addEmployee(Employee employee){
        empleados.add(employee);
    }

    public void removeEmployee(Employee employee){
        empleados.remove(employee);
    }

    public ArrayList<Employee> getEmployees(){
        return empleados;
    }

    public void printAllEmployees() {
        for (Employee employee : empleados) {
            System.out.println(employee);
        }
    }

    public Integer calculateAllSalaryPayment() {
        int totalSalary = 0;
        for (Employee employee : empleados) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public void jobPosition(){
        for (Employee employee : empleados) {
           System.out.println(employee.getJobPosition());
        }
    }

    public boolean validateIsEmployee(String name) {
        boolean isFound = false;
        for (Employee employee : empleados) {
            if(employee.getName() == name) {
                isFound = true;
            }
        }
        return isFound;
    }
    
}
