import java.text.SimpleDateFormat;
import java.util.Date;

import javax.sound.midi.Soundbank;



public class Sale {
        private Usuario usuario;
        private Employee employee;
        private Vehicule vehicule;
        private float amount;
        Date date= new Date();

     
  

    public Sale(Usuario usuario,Employee employee,Vehicule vehicule,int i,String string){
        this.usuario=usuario;
        this.employee=employee;
        this.vehicule=vehicule;
        this.amount=i;
        this.formattedDate=string;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    String formattedDate = formatter.format(date);
    
    public void PrintAllInformation(){
        this.employee.PrintEmployee();
        this.usuario.PrintInformation();
        this.vehicule.PrintVehicule();
    }
    


    /*public void PrintInformtion(){
        System.out.println("USUARIO "+ 
                            "\n Name :" +usuario.getName() + " Telephone: "+
                            usuario.getPhone() + " Id: " + usuario.getId() + 
                            "\nEMPLOYEE "+
                            "\n Name: " +employee.getName() + " Employee id: " + employee.getId() +
                            "\n VEHICULE "+ 
                            "\n make" +vehicule.getMake() + " Brand: " +vehicule.getBrand()+ " Miliage: " + vehicule.getMiliage() + " Color: " + vehicule.getColor()+
                            "Prices "+ vehicule.getPrices() + " TypeCar: " +vehicule.getTypeCar() + "Warranty Time: "+ vehicule.getWarrantyTime()+ 
                            "\n SalesPerson Comision: "+ getAmount() + "Date: " + formattedDate);
                           
                         
                              
    }
    */

    
 

    
}
