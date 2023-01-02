class Usuario{
    
    String name;
    String phone;
    private int id;
    private static int nextId =1;
    
    
    public Usuario(String name, String phone, int id) {
        this.name = name;
        this.phone = phone;
        this.id = nextId++;
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
        System.out.println("Id: "+id + 
        "\nName: "+ name +
        "\nPhone: " + phone);
    }

    

}