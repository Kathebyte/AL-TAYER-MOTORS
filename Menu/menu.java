
package Menu;
import model.*;

import java.util.Scanner;

public class Menu {

    ListCustomer customerList= new ListCustomer();
    ListVehicles vehiclesList= new ListVehicles();
    ListEmployee employeeList= new ListEmployee();

    public void showMenu(){
        int response= 0;
        Scanner teclado= new Scanner(System.in);
        


        do{
            printMenu();
            response= teclado.nextInt();
            switch(response){
                case 1:
                    AddUserBd.addCustomer();
                    break;
                case 2:
                    showCustomers();
                    
                    break;
                case 3:
                    addVehicle();
                    break;
                case 4:
                    showVehicles();
                    break;
                case 5:
                    showEmployee();
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
            
        }while(response !=0);
        teclado.close();
    }
    private void showEmployee(){
       employeeList.printAllEmployees();

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
        String warrantyTime = infoVehicle.nextLine();

        System.out.println("Accident History input : [YES] or [NO]");
        String acctidentHistory = infoVehicle.nextLine();

        Vehicle newVehicle = new Vehicle(make, brand, year, miliage, color, prices, typeCar, warrantyTime, acctidentHistory);
        
        vehiclesList.addVehicle(newVehicle);
    }

    public void showVehicles(){
        vehiclesList.printAllVehicules();

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
        newCustomer.setName(name);
        newCustomer.setPhoneNumber(phoneNumber);
        newCustomer.setAddress(address);
        newCustomer.setEmail(email);
        AddUserBd.addCustomer();
        

        // // Add Customer to List
        // customerList.addCustomer(newCustomer);
        

    }

    public void showCustomers () {
       customerList.printList();
       
    }

    private void printMenu () {
        System.out.println("\nWelcome to al tayer motors");
        System.out.println("Select the desired option:");
        System.out.println("MENU:");
        System.out.println("1. Add Customer");
        System.out.println("2. List Customers");
        System.out.println("3. Add Vehicle");
        System.out.println("4. List Vehicle");
        System.out.println("5. List employee");
        System.out.println("0. Exit");

    }



}
