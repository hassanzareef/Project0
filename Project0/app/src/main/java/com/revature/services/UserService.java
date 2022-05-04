package com.revature.services;

import com.revature.dao.IUserDao;
import com.revature.models.User;

public class UserService {

    private IUserDao id;

    public UserService(IUserDao id){
        this.id = id;
    }

    public void registerUser(String first, String last, String email, String password, String type){
        User register = new User(0, first, last, email, password, type);
        id.createUser(register);
    }

}
