import java.util.ArrayList;

class Usuario{
    
    String name;
    String phone;
    private static int idUsario=100;
    
    ArrayList< Usuario >usuarios=new ArrayList<>();

    public void addUsuario(String name, String phone){
        usuarios.add(new Usuario(name, phone));
    }

    public ArrayList<Usuario>getUsuarios(){
        return usuarios;
    }
    
    public Usuario(String name, String phone) {
        this.name = name;
        this.phone = phone;
        idUsario++;
    }


    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getidUsario() {
        return idUsario;
    }

    
    public void PrintInformation(){
        System.out.println("Id Usuario: "+idUsario + 
        " Name: "+ name +
        " Phone: " + phone);
    }

    

}