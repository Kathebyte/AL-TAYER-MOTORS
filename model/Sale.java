package model;
import java.util.List;

public class Sale {

    private String employeeId;
    private float amount;
    public static float getTotalAmountSoldByEmployee(String employeeId, List<Sale> sales) {
        float totalAmount = 0;
        for (Sale sale : sales) {
            if (sale.employeeId.equals(employeeId)) {
                totalAmount += sale.amount;
            }
        }
        return totalAmount;
    }
}





  
    
 

    

