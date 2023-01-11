package model;
import java.time.LocalDate;
import java.util.List;



public class Sale {

    private String employeeId;
    private String customerId;
    private String carId;
    private float amount;
    private LocalDate date; 

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





  
    
 

    

