package model;
import java.util.ArrayList;

public class Customer extends User{

    public Customer(String name, String email) {
        super(name, email);
    }

    @Override
    public void showInformation() {
        System.out.println("Customer company AL TAYER MOTORS");
        
    }
    
}
