
package Menu;
import java.util.Scanner;

public class menu {

    public static void showMenu(){
        System.out.println("Welcome to al tayer motors");
        System.out.println("Select the desired option:");

        int response= 0;

        do{

            System.out.println("MENU:");
            System.out.println("1. Customer");
            System.out.println("2. Employee");
            System.out.println("0. Exit");

            Scanner teclado= new Scanner(System.in);
            response= teclado.nextInt();

            switch(response){
                case 1:
                    System.out.println("Customer");

                    
                    break;
                case 2:
                    System.out.println("Employee");
                
                    break;
                case 3:
                    System.out.println("Thanks for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
            teclado.close();
        }while(response !=0);
    }
    
}
