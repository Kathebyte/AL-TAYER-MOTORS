import java.text.SimpleDateFormat;
import java.util.Date;




public class Sale {

        private Usuario usuario;
        private Employee employee;
        private Vehicule vehicule;
        private float amount;
        Date date= new Date();
        private static int idVenta=01;

     
    public Sale(Usuario usuario,Employee employee,Vehicule vehicule,int i,String string){
            this.usuario=usuario;
            this.employee=employee;
            this.vehicule=vehicule;
            this.amount=i;
            this.formattedDate=string;
            idVenta++;
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
    
    public void generateReceipt() {
        System.out.println("::RECEIPT ::");
        System.out.println();
        System.out.println(date);
        System.out.println("ID VENTA: "+ idVenta);
        this.usuario.PrintInformation();
        this.employee.PrintEmployee();
        System.out.println("Precio vehiculo: " + vehicule.getPrices()+
        "/n Referece Vehicule ");
        this.vehicule.PrintVehicule();

      }


    

    
 

    
}
