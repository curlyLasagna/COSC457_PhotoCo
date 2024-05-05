package com.example.demo.services;

import com.example.demo.data.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CRMService {
    @Autowired
    private final CustomerRepository customerRepository;
    @Autowired
    private final BookingsRepository bookingsRepository;


    public CRMService(
            CustomerRepository customerRepository,
            BookingsRepository bookingsRepository
    ) {
        this.customerRepository = customerRepository;
        this.bookingsRepository = bookingsRepository;
    }
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public List<Bookings> getAllBookings() {
        return bookingsRepository.findAll();
    }
}
