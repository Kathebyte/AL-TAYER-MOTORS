import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*Sale sale1= new Sale(new Usuario("Katherine Benjumea ", "0587125874"),new Employee(0, null), new Vehicule("Ford", "Escape", 12000, "Blue", 25000, "SV", 5),1500,("15,12,2022"));
        System.out.println(":::::::::::::");
        sale1.PrintAllInformation();
        sale1.generateReceipt();
        */
        

        System.out.println("****************************");
        Usuario usuario1 = new Usuario(null, null);
        usuario1.addUsuario("Katherine", "2123644");
        usuario1.addUsuario("Carmen", "2123644");
        usuario1.addUsuario("Melisa", "2123644");
        usuario1.addUsuario("Andrea", "2123644");

        ArrayList<Usuario> usuarios = usuario1.getUsuarios();

        for (Usuario user : usuarios) {
        user.PrintInformation();
        }
        
        

        
       

        
    }
}
        /*EmployeeData employeeData1 = new EmployeeData();

        /*for (Employee e : employeeData1.getEmployee()) {
        System.out.println("ID: " + e.getId());
        System.out.println("Nombre: " + e.getName());
        */


