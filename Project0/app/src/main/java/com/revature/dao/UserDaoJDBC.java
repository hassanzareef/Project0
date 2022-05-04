package com.revature.dao;

import com.revature.models.User;
import com.revature.utils.ConnectionSingleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDaoJDBC implements IUserDao {

    public ConnectionSingleton cs = ConnectionSingleton.getConnectionSingleton();

    @Override
    public void createUser(User u) {

        Connection c = cs.getConnection();

        String sql = "insert into users (first_name, last_name, email, password, type) values " +
                "('" + u.getFirstName() +"','" + u.getLastName() + "','" + u.getEmail() +"','" + u.getPassword() +"','" + u.getType() + "')";

        try {
            Statement s = c.createStatement();
            s.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<User> readAllUsers() {
        return null;
    }

    @Override
    public User readUserByEmail(String email) {
        return null;
    }

    @Override
    public User updateUser(User u) {
        return null;
    }

    @Override
    public void deleteUser(User u) {

    }
}
