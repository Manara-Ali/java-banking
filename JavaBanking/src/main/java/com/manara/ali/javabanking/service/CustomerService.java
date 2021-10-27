package com.manara.ali.javabanking.service;

import com.manara.ali.javabanking.model.CustomerModel;
import com.manara.ali.javabanking.repository.CustomerModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    // Inject repository as a dependency
    @Autowired
    CustomerModelRepository customerModelRepository;

    // Create a method to sign up new customer
    public CustomerModel signup(CustomerModel customerModel) {
        return customerModelRepository.save(customerModel);
    }
}
