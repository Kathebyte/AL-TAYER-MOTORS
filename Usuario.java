class Usuario{
    
    String name;
    String phone;
    private int idUsario;
    private static int nextId =1;
    
    
    public Usuario(String name, String phone, int idUsario) {
        this.name = name;
        this.phone = phone;
        this.idUsario = nextId++;
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
        "Name: "+ name +
        "Phone: " + phone);
    }

    

}