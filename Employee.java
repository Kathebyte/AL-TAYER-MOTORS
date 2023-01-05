public class Employee {
   
    private int id;
    String name;
    
    
    
    public Employee( int id,String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void PrintEmployee(){
        System.out.println("Employees Name: "+name +",id: "+id);
    }
    
}

