package com.example.demo.data;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "BOOKINGS")
public class Bookings extends AbstractEntity {
    public enum Priority {low, medium, high}

    public enum Status {Pending, WIP, Done}

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Column(name = "last_active")
    private Date last_active;
    @Column(name = "notes")
    private String notes;

    public Date getLast_active() {
        return last_active;
    }

    public void setLast_active(Date last_active) {
        this.last_active = last_active;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "priority")
    @Enumerated(EnumType.STRING)
    private Priority priority;

//    @Query("Select fName, lName from BOOKINGS join CUSTOMER on")
//    public List<Customer> findCustomerName_Id(Integer id);
}
