public class Main {

    public static void main(String[] args) {


        // Usuario usuario = new Usuario("Katherine Benjumea", "0521758899", 0);
        // usuario.PrintInformation();


        // Usuario usuario1 = new Usuario("Cristian Gutierrez", "971524587", 0);
        // usuario1.PrintInformation();


        // Vehicule vehicule = new Vehicule("ford", "Escape",
        // (float) 12000 , "Blue", 25000, "camioneta", 2);
        // vehicule.PrintVehicule();
        // vehicule.getWarrantyTime();


        Sale sale1= new Sale(new Usuario("Katherine Benjumea ", "0521785599", 1),new Employee("Cristian Gutierrez", 0101), new Vehicule("Ford", "Escape", 12000, "Blue", 25000, "SV", 5),1500,("15,12,2022"));
        sale1.PrintAllInformation();

        

    }
        
    
}

