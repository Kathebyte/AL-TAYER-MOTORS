package model;

import java.util.ArrayList;

public class ListCustomer {

    ArrayList<Customer> userList;

    public ListCustomer() {
        userList = new ArrayList<>();
        userList.add(new Customer("Alejandra Moreno", "315425478", "Medellin", "alejamoreno1@email.com"));
        userList.add(new Customer("Carolina Mejia", "345125478", "Pereira", "caromejia@email.com"));
    }

    public void addCustomer(Customer customer) {
        userList.add(customer);
    }

    public void removeCustomer(Customer customer) {
        userList.remove(customer);
    }

    public ArrayList<Customer> getCustomers() {
        return userList;
    }
    
    public void printList() {
        for (Customer comprador : userList) {
            comprador.printUser();
        }
    }
}
 