import java.util.ArrayList;

class Usuario{
    
    String name;
    String phone;
    private static int nextId=100;
    private int id;
    
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
        this.id=nextId;
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

    public int getId() {
        return id;
    }

    
    public void PrintInformation(){
        System.out.println("Id Usuario: "+id + 
        " Name: "+ name +
        " Phone: " + phone);
    }

    

}

//phoneNumber
/*  public void setPhoneNumbre(String phoneNumber) {
        if (phoneNumber.length() > 8){
            System.out.println("El numero telefonico debe de ser de 6 digitos maximo");
        }else if(phoneNumber.length()==8){
            this.phoneNumber = phoneNumber;}
    }
     */