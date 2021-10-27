package com.manara.ali.javabanking.controller;

import com.manara.ali.javabanking.model.CustomerModel;
import com.manara.ali.javabanking.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class CustomerController {

    // Inject the service class
    @Autowired
    CustomerService customerService;

    // Create a method to add new customers to the database
    @PostMapping("/sign-up")
    public CustomerModel signup(CustomerModel customerModel) {
        return customerService.signup(customerModel);
    }
}
