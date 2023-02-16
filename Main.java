import java.sql.Connection;

import Menu.Menu;
import model.Conexion;

public class Main {

    public static void main(String[] args) {
        
        Menu menu = new Menu();
        menu.showMenu();
        
        
        Conexion conexion = new Conexion();
        try(Connection cnx = conexion.getConnection()) {
            
        } catch (Exception e) {
        System.out.println(e);
        }
    }
}
    


  