public class Vehicule {

    String make;
    String brand;
    Float miliage;
    String color;
    float prices;
    String typeCar;
    int warrantyTime;
    
    public Vehicule(String make, String brand, float miliage, String color, float prices, String typeCar,
            int warrantyTime) {
        this.make = make;
        this.brand = brand;
        this.miliage = miliage;
        this.color = color;
        this.prices = prices;
        this.typeCar = typeCar;
        this.warrantyTime = warrantyTime;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Float getMiliage() {
        return miliage;
    }

    public void setMiliage(Float miliage) {
        this.miliage = miliage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrices() {
        return prices;
    }

    public void setPrices(float prices) {
        this.prices = prices;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    public int getWarrantyTime() {
        if(warrantyTime >1){
            System.out.println(warrantyTime + " years");
        }else{
            System.out.println(warrantyTime + " year");
        }
        return warrantyTime;
    }

    public void setWarrantyTime(int warrantyTime) {
        this.warrantyTime = warrantyTime;
    }

    
    public void PrintVehicule() {
        System.out.println( "Vehicule make:" + make + ", brand:" + brand + ", miliage:" + miliage + "\ncolor:" + color + ", Prices:"
                + prices + ", typeCar:" + typeCar + "warrantyTime:" + warrantyTime );
    }
 
   
     



    
}
