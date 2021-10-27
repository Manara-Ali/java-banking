package com.manara.ali.javabanking.controller;

import com.manara.ali.javabanking.model.CustomerModel;
import com.manara.ali.javabanking.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class CustomerController {

    // Inject the service class
    @Autowired
    CustomerService customerService;

    // Create a method to add new customers to the database
    @PostMapping("/sign-up")
    public CustomerModel signup(@RequestBody CustomerModel customerModel) {
        return customerService.signup(customerModel);
    }

    // Create a method to retrive all the users
    @GetMapping("/")
    public List<CustomerModel> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/customer/{id}")
    public CustomerModel getCustomer(@PathVariable int id) {
        return customerService.getCustomer(id);
    }

    // Create a method to update customer
    @PatchMapping("/update-customer/{id}")
    public CustomerModel updateCustomer(@PathVariable int id, @RequestBody CustomerModel customerModel) {
        return customerService.updateCustomer(customerModel, id);
    }

    @DeleteMapping("/delete-customer/{id}")
    public HttpStatus deleteCustomer(@PathVariable int id) {
        return customerService.deleteCustomer(id);
    }

}
