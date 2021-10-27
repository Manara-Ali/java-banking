package com.manara.ali.javabanking.service;

import com.manara.ali.javabanking.model.CustomerModel;
import com.manara.ali.javabanking.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    // Inject repository as a dependency
    @Autowired
    CustomerRepository customerRepository;

    // Create a method to sign up new customer
    public CustomerModel signup(CustomerModel customerModel) {
        return customerRepository.save(customerModel);
    }
}
