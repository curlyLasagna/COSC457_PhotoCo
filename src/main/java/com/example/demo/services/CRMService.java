package com.example.demo.services;

import com.example.demo.data.Customer;
import com.example.demo.data.CustomerRepository;

import java.util.List;

public class CRMService {
    private final CustomerRepository customerRepository;

    public CRMService(CustomerRepository customerRepository

    ) {
        this.customerRepository = customerRepository;
    }
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
