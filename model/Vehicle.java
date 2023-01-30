package model;
public class Vehicle {
    private int carId;
    private static int nextId=005;
    private String make;
    private String brand;
    private int year;
    private Float miliage;
    private String color;
    private Double prices;
    private String typeCar;
    private String accidentHistory;
    private String warrantyTime;

    public Vehicle(){
    }
    
    public Vehicle(String make, String brand,int year, float miliage, String color, double prices, String typeCar,
        String warrantyTime, String accidentHistory) {
        this.carId=nextId++;
        this.make = make;
        this.brand = brand;
        this.year = year;
        this.miliage = miliage;
        this.color = color;
        this.prices = prices;
        this.typeCar = typeCar;
        this.warrantyTime = warrantyTime;
        this.accidentHistory = accidentHistory;
    }

    public int getCarId() {
        return carId;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    public String getWarrantyTime() {
        return warrantyTime + " YEARS";
    }

    public void setWarrantyTime(String warrantyTime) {
        this.warrantyTime = warrantyTime;
    }
    public String getAccidentHistory() {
        return accidentHistory;
    }

    public void setAccidentHistory(String accidentHistory) {
        this.accidentHistory = accidentHistory;
    }
    
    public void PrintVehicule() {
        System.out.println( "CarId: " +carId+ ", Vehicule make:" + make + ", brand:" + brand + ", miliage:" + miliage + "\ncolor:" + color + ", Prices:"
                + prices + ", type Car:" + typeCar + ", History Accident: "+ accidentHistory +", warrantyTime:" + getWarrantyTime()  );
    }
 
    @Override
    public String toString() {
        return "CarId: "+ carId +", Vehicule make:" + make + ", brand:" + brand + ", miliage:" + miliage + "\ncolor:" + color + ", Prices:"
                + prices + ", type Car:" + typeCar + ", History Accident: "+ accidentHistory +", warrantyTime:" + getWarrantyTime();

    }
 

    
}
