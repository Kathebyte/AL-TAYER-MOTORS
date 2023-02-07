import java.util.List;

public class SalesPersonComission {

    private int employeeId;
    private List<String > salesArrayIds;
    private double commissionRate;
    
    public SalesPersonComission(int employeeId, List<String> salesArrayIds,double commissionRate ) {
        this.employeeId = employeeId;
        this.salesArrayIds = salesArrayIds;
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public List<String> getSalesArrayIds() {
        return salesArrayIds;
    }

    public void setSalesArrayIds(List<String> salesArrayIds) {
        this.salesArrayIds = salesArrayIds;
    }

    public void calculateComision(){

    }

    
    
}
