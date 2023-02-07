package model;

import java.util.ArrayList;

public class ListVehicles{

    ArrayList<Vehicle> listaVehiculos = new ArrayList<>();

        public ListVehicles(){
            listaVehiculos.add(new Vehicle("Nissan", "Patrol",2020, 1500, "Blue", 300000, "SUV ", "4","No"));
            listaVehiculos.add(new Vehicle("Porshe", "Carrera Gt3",2018, 41000, "White", 369000,"Coupe ", "2","No"));
            listaVehiculos.add(new Vehicle("Volkswagen", "ID.4", 2022, 0, "Grey", 129000, "Electric", "4", "No"));
            listaVehiculos.add(new Vehicle("Honda", "Civic", 2021, 32550, "White", 65000, "Sedan", "2", "No"));
            listaVehiculos.add(new Vehicle("Nissan", "Patrol",2017, 100000, "Black", 200000, "SUV ", "0","Si"));
            listaVehiculos.add(new Vehicle("Porshe", "Carrera Gt3",2016, 180000, "Green", 198000,"Coupe ", "0","No"));
            listaVehiculos.add(new Vehicle("Volkswagen", "ID.4", 2022, 0, "Green", 129000, "Electric", "4", "No"));
            listaVehiculos.add(new Vehicle("Honda", "Civic", 2017, 80000, "Black", 40000, "Sedan", "0", "No"));
        }

        public void addVehicle(Vehicle vehicle){
            listaVehiculos.add(vehicle);
        }

        public void delateVehicle(Vehicle vehicle){
            listaVehiculos.remove(vehicle);
        }
        public ArrayList<Vehicle> getVehicles(){
            return listaVehiculos;
        }
        public void printAllVehicules(){
            for (Vehicle vehicle : listaVehiculos) {
                System.out.println(vehicle.toString());
            }
        }
        public void getMostExpensiveCar(){
            double highestPrice=0;
            Vehicle expensiveCar =null;
            for (Vehicle vehicle : listaVehiculos) {
                if(vehicle.getPrices() >= highestPrice){
                    highestPrice = vehicle.getPrices();
                        expensiveCar=vehicle;
                }
            }
            System.out.println("::   Expensive car characteristics  ::");
            expensiveCar.PrintVehicule();
        }

    }

    



    


    
