package com.manara.ali.javabanking.service;

import com.manara.ali.javabanking.model.CustomerModel;
import com.manara.ali.javabanking.repository.CustomerModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    // Inject repository as a dependency
    @Autowired
    CustomerModelRepository customerModelRepository;

    // Create a method to sign up new customer
    public CustomerModel signup(CustomerModel customerModel) {
        return customerModelRepository.save(customerModel);
    }

    // Create a method to retrieve all customers
    public List<CustomerModel> getAllCustomers() {
        return customerModelRepository.findAll();
    }

    // Create a method to retrive a single customer
    public CustomerModel getCustomer(int id) {
        return customerModelRepository.findById(id).get();
    }

    // Create a method to update a customer
    public CustomerModel updateCustomer(CustomerModel customerModel, int id) {
        // Find the current customer
        CustomerModel customer = getCustomer(id);

        customer.setFirstname(customerModel.getFirstname());
        customer.setLastname(customerModel.getLastname());
        customer.setUsername(customerModel.getUsername());
        customer.setPassword(customerModel.getPassword());

        // Return the customer
        return customerModelRepository.save(customer);
    }

    // Create a method to delete a single user
    public HttpStatus deleteCustomer(int id) {
        customerModelRepository.deleteById(id);
        return HttpStatus.OK;
    }
}
