/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.sql.*;
public class Website {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String url ="jdbc:mysql://localhost:3306/school";
        String username = "root";
        String password = "1234";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            ResultSet resultset = statement.executeQuery("select * from student");
            while(resultset.next()){
                System.out.println(resultset.getString(1) + " "+ resultset.getInt(2));
            }
            connection.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
