import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    System.out.println("****************************");
        
    //imprimir empleaods estaticos   
    List<Employee> staticEmployees = Employee.getStaticEmployees();

    for (Employee e : staticEmployees) {
        System.out.println("ID: " + e.getId());
        System.out.println("Nombre: " + e.getName());
        System.out.println("Phone : " + e.getPhoneNumber());
        System.out.println("Email: " + e.getEmail());
    }    
    System.out.println("****************************");
        
//Creacion nuevo usuario
    Usuario usuario1 = new Usuario(null, null, null);
    
    usuario1.addUsuario("Katherine", "315-432-2332","Kathe123@email.com");
    usuario1.addUsuario("Carmen", "315-123-2332","carmen@email.com");
    usuario1.addUsuario("Melisa", "321-432-2332","Melisas@email.com");
    usuario1.addUsuario("Andrea", "321-432-2332","andrea123@email.com");

    ArrayList<Usuario> usuarios = usuario1.getUsuarios();
        for (Usuario user : usuarios) {
        user.PrinterUser();
        }
    }
}
        

