
package Menu;
import model.*;
import java.util.Scanner;

public class Menu {

    ListCustomer customerList;
    ListEmployee employeeList;
    ListVehicles vehiclesList;

    public void showMenu(){
        int response= 0;
        Scanner teclado= new Scanner(System.in);

        //Initialize customer List
        customerList = new ListCustomer();

        do{
            printMenu();
            response= teclado.nextInt();
            switch(response){
                case 1:
                    addCustomer();
                    break;
                case 2:
                    showCustomers();
                    break;
                case 3:
                    System.out.println("Thanks for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
            
        }while(response !=0);
        teclado.close();
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

        // Add Customer to List
        customerList.addCustomer(newCustomer);

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
        System.out.println("0. Exit");
    }

}
