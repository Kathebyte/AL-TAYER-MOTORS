package model;
import java.util.ArrayList;
import java.util.List;

public class Usuario extends User{

    public Usuario(String name, String email) {
        super(name, email);
    }
 
    ArrayList< Usuario >usuarios=new ArrayList<>();

    public void addUsuario(String name, String email){
        usuarios.add(new Usuario(name,email));
    }

    public ArrayList<Usuario>getUsuarios(){
        return usuarios;
    }

    @Override
    public void showInformation() {
        System.out.println("Customer company AL TAYER MOTORS");
        
    }
    
}
