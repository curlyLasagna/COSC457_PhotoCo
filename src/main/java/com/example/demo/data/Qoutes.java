package com.example.demo.data;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Qoutes extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name = "paymend_id")
    private Payments payment;

    @OneToOne
    @JoinColumn(name = "booking_id")
    private Bookings booking;

    public Payments getPayment() {
        return payment;
    }

    public void setPayment(Payments payment) {
        this.payment = payment;
    }

    public Bookings getBooking() {
        return booking;
    }

    public void setBooking(Bookings booking) {
        this.booking = booking;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private BigDecimal deposit;
}
