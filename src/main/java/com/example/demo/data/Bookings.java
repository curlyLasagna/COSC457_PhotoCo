package com.example.demo.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Bookings {
    @Id
    @GeneratedValue
    private int booking_id;
    private Date date;
    private String status;
    private Date last_active;
    private enum priority {a, b, c};


}
