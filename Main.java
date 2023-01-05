public class Main {

    public static void main(String[] args) {

        Sale sale1= new Sale(new Usuario("Katherine Benjumea ", "0587125874", 0),new Employee(0, null), new Vehicule("Ford", "Escape", 12000, "Blue", 25000, "SV", 5),1500,("15,12,2022"));
        System.out.println(":::::::::::::");
        sale1.PrintAllInformation();
        sale1.generateReceipt();
        

        EmployeeData employeeData1 = new EmployeeData();

        for (Employee e : employeeData1.getEmployee()) {
        System.out.println("ID: " + e.getId());
        System.out.println("Nombre: " + e.getName());
}


        

    }
        
    
}

