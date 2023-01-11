import java.util.ArrayList;

import model.Employee;
import model.User;
import model.Customer;
import model.ListEmployee;


public class Main {

    public static void main(String[] args) {
        System.out.println("****************************");
        ListEmployee listaEmpleados = new ListEmployee();

        listaEmpleados.printAllEmployees();
        System.out.println("////////////////////////");
        System.out.println("Total Salary Payment all Employees: " + listaEmpleados.calculateAllSalaryPayment());

        System.out.println("////////////////////////");
        System.out.println("////////////////////////");
        System.out.println("////////////////////////");
        System.out.println("Empleado Existe: " + listaEmpleados.validateIsEmployee("Janet Osorio"));
        

    }
    

}

  