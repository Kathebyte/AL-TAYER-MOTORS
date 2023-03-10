package model;
public abstract class User {
    private int id;
    private static String name;
    private static String phoneNumber;
    private static String address;
    private static String email;
    private static int nextId=100;
    
 
    public User(String name, String phoneNumber, String address, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        id=nextId++;
    }

    public int getId() {
        return id;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8){
            System.out.println("El numero telefonico debe de ser de 6 digitos maximo");
        }else if(phoneNumber.length()==8){
            this.phoneNumber = phoneNumber;}
    }

    public static String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public static String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   public void printUser(){
    System.out.println("ID : "+id + "\nName : " +name 
             + " \nEmail: "+ email);
   }

   public abstract void showInformation();

    @Override
    public String toString() {
        return " User id:" + id + ", name: " + name + ", phoneNumber:" + phoneNumber + ", address:" + address + ", email:"
                + email + "\n";

    }

}