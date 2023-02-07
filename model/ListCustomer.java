package model;

import java.util.ArrayList;

public class ListCustomer {

    ArrayList<Customer> usuarios;

    public ListCustomer() {
        usuarios = new ArrayList<>();
        usuarios.add(new Customer("Alejandra Moreno", "315425478", "Medellin", "alejamoreno1@email.com"));
        usuarios.add(new Customer("Carolina Mejia", "345125478", "Pereira", "caromejia@email.com"));
    }

    public void addCustomer(Customer customer) {
        usuarios.add(customer);
    }

    public void removeCustomer(Customer customer) {
        usuarios.remove(customer);
    }

    public ArrayList<Customer> getCustomers() {
        return usuarios;
    }
}
