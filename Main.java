
import model.ListEmployee;
import model.ListVehicles;
import model.Vehicle;

public class Main {

    public static void main(String[] args) {
        System.out.println("****************************");
        //ListEmployee listaEmpleados = new ListEmployee();

        /*listaEmpleados.printAllEmployees();
        System.out.println("////////////////////////");
        System.out.println("Total Salary Payment all Employees: " + listaEmpleados.calculateAllSalaryPayment());
        listaEmpleados.validateIsEmployee("Katherine Benjumea");
        listaEmpleados.addEmployee(new Employee("kATHE", "123323", "mde", "n/a", 15000, "Customer"));
        System.out.println(":::::");
        listaEmpleados.printAllEmployees();
        */

        ListVehicles lista= new ListVehicles();
        lista.printAllVehicules();
        System.out.println("------------");
        lista.expensiveCar();
        System.out.println("------------");
        System.out.println("\n");
        System.out.println("El carro se encunetra " + lista.validateIsVehicle("FORD"));
        
    }
    

}

  