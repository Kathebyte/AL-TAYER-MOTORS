package model;
import java.util.ArrayList;

public class ListEmployee {
    
    //Atributes
    ArrayList <Employee> empleados;

    public ListEmployee(){
        empleados = new ArrayList<>();
        empleados.add(new Employee("Mariana Bedoya", "Maribedoya@opo.com", 1000));
        empleados.add(new Employee("Janet Osorio", "Jane.oso@opo.com", 2800));
        empleados.add(new Employee("Alejandro Munoz", "Alejo.mun@opo.com", 5400));

    }
    
    public void addEmployee(Employee employee){
        empleados.add(employee);
    }

    public void delateEmployee(Employee employee){
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
