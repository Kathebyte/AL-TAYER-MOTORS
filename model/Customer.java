package model;

public class Customer extends User{
    
    public Customer(String name, String phoneNumber, String address, String email) {
        super(name, phoneNumber, address, email);
    }
    

    @Override
    public void showInformation() {
        System.out.println("Customer company AL TAYER MOTORS");
        
    }
    @Override
    public String toString() {
        return super.toString();
    }
    
}
