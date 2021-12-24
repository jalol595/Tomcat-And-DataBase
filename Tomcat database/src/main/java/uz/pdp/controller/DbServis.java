package uz.pdp.controller;

import uz.pdp.model.Users;

import java.sql.*;

public class DbServis {

    String url="jdbc:postgresql://localhost:5432/work";
    String dbName="postgres";
    String dbPassword="12345";


    public void saveUser(Users users){

        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, dbName, dbPassword);

            String query = "insert into users(username, name, password) values(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, users.getUsername());
            preparedStatement.setString(2, users.getName());
            preparedStatement.setString(3, users.getPassword());


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }



}
