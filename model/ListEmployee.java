package model;

import java.util.ArrayList;
import java.util.List;

public class ListEmployee {
    
    List <Employee> empleados;

    public ListEmployee(){
        empleados = new ArrayList<>();
        empleados.add(new Employee("Mariana Bedoya", "Maribedoya@opo.com", "01"));
        empleados.add(new Employee("Janet Osorio", "Jane.oso@opo.com", "02"));
        empleados.add(new Employee("Alejandro Munoz", "Alejo.mun@opo.com", "03"));

    }
    
    
    public void addEmployee(Employee employee){
        empleados.add(employee);
    }
    public void delateEmployee(Employee employee){
        empleados.remove(employee);
    }
    public List<Employee> getEmployees(){
        return empleados;
    }
  

    
}
