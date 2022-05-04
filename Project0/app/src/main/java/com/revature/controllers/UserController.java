package com.revature.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.RegisterObject;
import com.revature.services.UserService;
import io.javalin.http.Handler;

public class UserController {

    private UserService us;

    private ObjectMapper om;

    public UserController(UserService us){
        this.us = us;
        this.om = new ObjectMapper();
    }

    public Handler handleRegister = (ctx -> {
        RegisterObject ro = om.readValue(ctx.body(), RegisterObject.class);

        System.out.println(ro);

       // us.registerUser(ro.first, ro.last, ro.email, ro.password, ro.type);
       // ctx.status(201);
        ctx.result("Create user");

    });
}
