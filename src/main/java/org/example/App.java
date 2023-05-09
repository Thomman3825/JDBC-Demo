package org.example;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_store","root","pass@word1");

            Statement s = c.createStatement();

            //READ
//            ResultSet res = s.executeQuery("select * from sql_store.customers");
//
//            while (res.next()){
//                System.out.println(res.getInt(1) + " " + res.getString(2));
//            }

            //CREATE
            //s.execute("CREATE database EY_fresh");

//            s.execute("CREATE table EY_fresh.Freshers(emp_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
//                    "first_name varchar(255) NOT NULL," +
//                    "designation varchar(255) NOT NULL )");

//            s.executeUpdate("INSERT into EY_fresh.Freshers(first_name, designation)" +
//                    "values('Dona', 'Ass. SE'), ('Chandni' , 'Ass.SE'), ('Thomas', 'Ass.SE')");


            c.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //root@localhost:3306
    }
}
