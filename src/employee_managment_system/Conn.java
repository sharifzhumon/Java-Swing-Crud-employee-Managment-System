package employee_managment_system;

import java.sql.*;

public class Conn {

    public Connection c;
    public Statement s;
    
    // Must have to add mysql JDBC library folder in project library folder
    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // registering the driver for connection setup
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", ""); // making connection with database emp
            s = c.createStatement(); // making statement object to execute queries through it
        } catch (Exception e) {
            e.printStackTrace(); //printStackTrace method handles exception and errors and provide details about the exception with line number and class name 

        }

    }

}
