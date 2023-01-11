package model;
public abstract class User {
    private int id;
    private String name;
    private String phoneNumber;
    private String address;
    private String email;
    private static int nextId=100;
    
    public User(String name, String email) {
        this.name = name;
        this.email = email;
        id=nextId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8){
            System.out.println("El numero telefonico debe de ser de 6 digitos maximo");
        }else if(phoneNumber.length()==8){
            this.phoneNumber = phoneNumber;}
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   public void PrinterUser(){
    System.out.println("ID : "+id + "\nName : " +name 
             + " Email: "+ email);
   }

   @Override
   public String toString() {
       return "Id: " +id +" User: "+ name + " Email: "+ email;
   }

   public abstract void showInformation();

}