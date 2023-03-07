
package Menu;
import model.*;

import javax.swing.*;
import java.util.Scanner;

public class Menu {

    public void showMenu(){
        int opciom_menu= 0;
        String[] botton ={
        "1. Add Customer",
        "2. List Customers",
        "3. Add Vehicle",
        "4. List Vehicle",
        "5. List employee",
        "6. List Sales",
        "7. Exit"
        };

        do{
            String response = (String) JOptionPane.showInputDialog(null,"Welcome to al tayer motors","MENU",
                    JOptionPane.INFORMATION_MESSAGE,null,botton,botton[0]);


            //validate que opction select

            for (int i = 0; i < botton.length; i++) {
                if(response.equals(botton[i])){
                    opciom_menu = i;
                }
            }

            switch (opciom_menu) {
                case 0 -> addCustomer();
                case 1 -> showCustomers();
                case 2 -> addVehicle();
                case 3 -> showVehicles();
                case 4-> showEmployee();
                case 5 -> showSales();
                default -> {
                }
            }
            
        }while(opciom_menu !=6);
    }
    private void showEmployee(){
       AddDataDb.ListEmployee();

    }
    private void addVehicle(){
        Scanner infoVehicle = new Scanner(System.in);

        /*Request information */
        System.out.println("Input the make");
        String make = infoVehicle.nextLine();

        System.out.println("Input the brand");
        String brand = infoVehicle.nextLine();

        System.out.println("Input the year the vehicle");
        String year = infoVehicle.nextLine();

        System.out.println("Input the Miliage");
        float miliage = infoVehicle.nextFloat();
        infoVehicle.nextLine();

        System.out.println("Input the color of the vehicle");
        String color = infoVehicle.nextLine();

        System.out.println("Input the prices vehicle");
        double prices = infoVehicle.nextDouble();

        System.out.println("Input the type car");
        String typeCar = infoVehicle.nextLine();
        infoVehicle.nextLine();

        System.out.println("Input Warranty time");
        int warrantyTime = infoVehicle.nextInt();
        infoVehicle.next();
        System.out.println("Accident History input : [YES] or [NO]");
        String acctidentHistory = infoVehicle.nextLine();

        Vehicle newVehicle = new Vehicle(make, brand, year, miliage, color, prices, typeCar, warrantyTime, acctidentHistory);
        AddDataDb.addVehicleBd(newVehicle);
    }

    public void showVehicles(){
        AddDataDb.ListVehicleBd();

    }
    
    private void addCustomer() {
        Scanner infoCustomer = new Scanner(System.in);
        
        /*Request Info from user */
        System.out.println("Input the name of the customer");
        String name = infoCustomer.nextLine();

        System.out.println("Input the phone number of the customer");
        String phoneNumber = infoCustomer.nextLine();

        System.out.println("Input the address of the customer");
        String address = infoCustomer.nextLine();

        System.out.println("Input the email of the customer");
        String email = infoCustomer.nextLine();
        
        // Create customer
        Customer newCustomer = new Customer(name, phoneNumber, address, email);
        AddDataDb.crearCustomerBd(newCustomer);
        
    }

    public void showCustomers () {
       AddDataDb.ListCustomerBd();
       
    }
    private void showSales(){
        AddDataDb.ListSales();
    }

}
