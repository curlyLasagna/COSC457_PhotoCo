package com.example.demo.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Bookings extends AbstractEntity{

    private Date date;
    private String notes;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getLast_active() {
        return last_active;
    }

    public void setLast_active(Date last_active) {
        this.last_active = last_active;
    }

    private String status;
    private Date last_active;
    private enum priority {a, b, c};
}
