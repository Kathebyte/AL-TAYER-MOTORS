package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AddUserBd {

    public static void addCustomer(){
       
        Conexion db_connect = new Conexion();
        
        try(Connection conexion = db_connect.getConnection()){
            PreparedStatement ps=null;
            try{
                String query="insert into Customer (name,phoneNumber,addres,email) values (?)";
                ps= conexion.prepareStatement(query);
                ps.setString(1,Customer.getName());
                ps.setString(2,Customer.getPhoneNumber());
                ps.setString(3,Customer.getAddress());
                ps.setString(4,Customer.getEmail());

                ps.executeUpdate();
                System.out.println("The user is created successfully");

            }catch(SQLException ex){
                System.out.println(ex);
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }
}


    

