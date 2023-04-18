package com.example.simplespringapp.controller;

import com.example.simplespringapp.model.Client;
import com.example.simplespringapp.model.SimpleModel;
import com.example.simplespringapp.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SimpleSpringAppController {

    @RequestMapping(value="/simpleapp", method = RequestMethod.GET)
    public String justSimple() {
        return "Just Simple";
    }

    @Autowired
    SimpleService service;

    @RequestMapping(value="/simpleAddUser", produces = MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.POST)
    public String simpleAddUser(@RequestBody SimpleModel model) {
          Client client = model.getClient();
          //call simple service;
            return "SUCCESS";
    }

}
