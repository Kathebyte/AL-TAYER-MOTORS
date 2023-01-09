import java.util.ArrayList;
import java.util.List;

class Usuario extends User{

    public Usuario(String name, String phoneNumber, String email) {
        super(name, phoneNumber, email);
    }
 
    ArrayList< Usuario >usuarios=new ArrayList<>();

    public void addUsuario(String name, String phone, String email){
        usuarios.add(new Usuario(name, phone,email));
    }

    public ArrayList<Usuario>getUsuarios(){
        return usuarios;
    }
    
}
