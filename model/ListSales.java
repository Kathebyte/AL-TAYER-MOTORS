package model;

import java.util.ArrayList;

public class ListSales {
   
    ArrayList<Sale> sales;

    public ListSales() {
        sales= new ArrayList<>();
        sales.add(new Sale(200, 5.000, 101, 5, null));


    }

    public void addSales(Sale sale){
    sales.add(sale);
}

public void delateSales(Sale sale){
    sales.remove(sale);
}

public ArrayList<Sale> getSales(){
    return sales;
}

public void printAllSales() {
    for (Sale sale : sales) {
        System.out.println(sales);
    }
}@Override
public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
}
    
}
