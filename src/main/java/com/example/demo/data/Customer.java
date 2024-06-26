package com.example.demo.data;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

@Entity
@Table(name = "CUSTOMER")
public class Customer extends AbstractEntity {

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getlName() {
        return lName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone_number() {
        return phone_number;
    }


    @Column(name = "fName")
    private String fName;

    @Column(name = "lName")
    private String lName;

    @Email
    @Column(name = "email")
    private String email;

    @Column(name = "phone_num")
    private String phone_number;


}
